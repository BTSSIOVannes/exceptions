/**
 *
 */
package deserialisation;

import java.util.StringTokenizer;

import metier.Metier;
import exception.BlocException;
import exception.DeserialisationException;

/**
 * @author jljouannic, abi
 *
 */
public class MetierDeserialiseur extends ConceptNommeDeserialiseur<Metier> {

	/**
	 * Constructeur par défaut
	 */
	public MetierDeserialiseur() {
		super();
	}

	public Metier deserialise(String chaine) throws DeserialisationException {
		Metier resultat = null;
		int numeroBloc = 0;
		try {

			StringTokenizer st = new StringTokenizer(chaine, SEP);
			if (st.countTokens()!=2){
				throw new BlocException("pas le bon nombre de blocs",numeroBloc);
			}
			String nom = st.nextToken();
			numeroBloc++;
			String ville = st.nextToken();
			numeroBloc++;
			resultat = new Metier(nom, ville);

		} catch (Exception e) {
			throw new BlocException("problème de bloc Métier",e, numeroBloc);
		}

		return resultat;

	}

}
