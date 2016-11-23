/**
 *
 */
package deserialisation;

import java.io.Reader;

import exception.DeserialisationException;

/**
 * Un désérialiseur peut désérialiser à partir d'un fichier ou d'un objet java String
 * Selon notre contexte, une des deux méthodes peut être neutralisée et
 * accompagnée d'une levée d'exception
 * @author jljouannic, abi
 * @see DeserialisationException
 *
 */
public interface IDeserialiseur<T> {

	T deserialise(Reader entree) throws DeserialisationException;

	T deserialise(String chaine) throws DeserialisationException;

}
