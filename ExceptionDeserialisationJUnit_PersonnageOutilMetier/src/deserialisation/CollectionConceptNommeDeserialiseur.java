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

	//public static final String SEP = "\n"; // non utilis�

	// Cet attribut contient les m�thodes � utiliser pour d�s�rialiser un objet de type T
	private IDeserialiseur<T> objectNommeDeserialiseur;

	/**
	 * @param objectNommeDeserialiseur les m�thodes de d�s�rialisation d'un objet de type T
	 */
	public CollectionConceptNommeDeserialiseur(
			IDeserialiseur<T> objectNommeDeserialiseur) {
		super();
		this.objectNommeDeserialiseur = objectNommeDeserialiseur;
	}

	/**
	 * Les collections se d�s�rialisent � partir d'un fichier
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
				// pouvons tout de même écrire dans la console la pile
				// d'exécution :
				e.printStackTrace();
			}
		}

		return oeuvres;
	}

	/**
	 * Les collections ne se d�s�rialisent pas � partir d'un objet java de type String
	 */
	public Collection<T> deserialise(String chaine)
			throws DeserialisationException {

		throw new UnsupportedOperationException(
				"M�thode non impl�ment�e dans cette classe");
	}
}
