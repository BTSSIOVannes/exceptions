/**
 *
 */
package deserialisation;

import java.io.Reader;

import exception.DeserialisationException;

/**
 * Un d�s�rialiseur peut d�s�rialiser � partir d'un fichier ou d'un objet java String
 * Selon notre contexte, une des deux m�thodes peut �tre neutralis�e et
 * accompagn�e d'une lev�e d'exception
 * @author jljouannic, abi
 * @see DeserialisationException
 *
 */
public interface IDeserialiseur<T> {

	T deserialise(Reader entree) throws DeserialisationException;

	T deserialise(String chaine) throws DeserialisationException;

}
