/**
 *
 */
package deserialisation;

import java.util.StringTokenizer;

import metier.Outil;
import exception.BlocException;
import exception.DeserialisationException;

/**
 * @author jljouannic, abi
 *
 */
public class OutilDeserialiseur extends ConceptNommeDeserialiseur<Outil> {

	/**
	 * Constructeur par défaut
	 */
	public OutilDeserialiseur() {
		super();
	}

	public Outil deserialise(String chaine) throws DeserialisationException {

		Outil resultat = null;

		int numeroBloc = 0;

		try {

			StringTokenizer st = new StringTokenizer(chaine, SEP);
			String nom = st.nextToken();
			numeroBloc++;
			String couleur = st.nextToken();
			numeroBloc++;
			String matiere = st.nextToken();
			numeroBloc++;
			resultat = new Outil(nom, couleur, matiere);

		} catch (Exception e) {
			throw new BlocException(e, numeroBloc);
		}

		return resultat;

	}

}
