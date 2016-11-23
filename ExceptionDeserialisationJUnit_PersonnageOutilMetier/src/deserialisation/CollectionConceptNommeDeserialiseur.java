/**
 *
 */
package deserialisation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metier.ConceptNomme;
import exception.BlocException;
import exception.DeserialisationException;
import exception.FichierException;
import exception.LigneException;

/**
 * @author jljouannic, abi
 *
 */
public class CollectionConceptNommeDeserialiseur<T extends ConceptNomme>
		implements IDeserialiseur<Collection<T>> {

	//public static final String SEP = "\n"; // non utilisé

	// Cet attribut contient les méthodes à utiliser pour désérialiser un objet de type T
	private IDeserialiseur<T> objectNommeDeserialiseur;

	/**
	 * @param objectNommeDeserialiseur les méthodes de désérialisation d'un objet de type T
	 */
	public CollectionConceptNommeDeserialiseur(
			IDeserialiseur<T> objectNommeDeserialiseur) {
		super();
		this.objectNommeDeserialiseur = objectNommeDeserialiseur;
	}

	/**
	 * Les collections se désérialisent à partir d'un fichier
	 */
	public Collection<T> deserialise(Reader entree)
			throws DeserialisationException {

		List<T> oeuvres = new ArrayList<T>();

		BufferedReader reader = new BufferedReader(entree);
		String line = null;
		int numeroLigne = 0;

		try {
			while ((line = reader.readLine()) != null) {
				numeroLigne++;
				oeuvres.add(objectNommeDeserialiseur.deserialise(line));
			}
		} catch (IOException e) {
			throw new FichierException(e);
		} catch (BlocException e) {
			throw new LigneException("ligne corrompue",e, numeroLigne);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// Il n'est pas important de traiter cette exception mais nous
				// pouvons tout de mÃªme Ã©crire dans la console la pile
				// d'exÃ©cution :
				e.printStackTrace();
			}
		}

		return oeuvres;
	}

	/**
	 * Les collections ne se désérialisent pas à partir d'un objet java de type String
	 */
	public Collection<T> deserialise(String chaine)
			throws DeserialisationException {

		throw new UnsupportedOperationException(
				"Méthode non implémentée dans cette classe");
	}
}
