/**
 *
 */
package exception;

/**
 * @author jljouannic, abi
 *
 */
public class DeserialisationException extends Exception {

	/** cl� de hachage SHA qui identifie de mani�re unique la Classe.
	Cela permet lorsqu�elle est s�rialis�e, de la marquer avec une
	somme de contr�le (checksum) pour que lors de la d�s�rialisation,
	votre programme soit certain de la version de la classe Java
	qu�il manipule. C�est un gestionnaire de version de votre classe.
	On retrouve cet identifiant dans les classes du m�tier
	*/
	private static final long serialVersionUID = -1233010037807355069L;

	public DeserialisationException() {
		super();
	}

	public DeserialisationException(String message, Throwable cause) {
		super(message, cause);
	}


	/**
	 * @param message
	 */
	public DeserialisationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DeserialisationException(Throwable cause) {
		super(cause);
	}

}
