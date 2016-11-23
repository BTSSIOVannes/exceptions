/**
 *
 */
package deserialisation;

import java.util.StringTokenizer;

import metier.Personnage;
import exception.BlocException;
import exception.DeserialisationException;

/**
 * @author jljouannic, abi
 *
 */
public class PersonnageDeserialiseur extends
		ConceptNommeDeserialiseur<Personnage> {

	/**
	 * Constructeur par défaut
	 */
	public PersonnageDeserialiseur() {
		super();
	}

	public Personnage deserialise(String chaine)
			throws DeserialisationException {

		Personnage resultat = null;

		int numeroBloc = 0;

		try {

			StringTokenizer st = new StringTokenizer(chaine, SEP);
			String nom = st.nextToken();
			numeroBloc++;
			String description = st.nextToken();
			numeroBloc++;
			String etat = st.nextToken();
			numeroBloc++;
			resultat = new Personnage(nom, description, etat);

		} catch (Exception e) {
			throw new BlocException(e, numeroBloc);
		}

		return resultat;

	}

}
