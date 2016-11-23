package exception;

/**
 * Exception lev�e si les donn�es n'ont pas �t� initialis�es et ne sont pas pr�sentes
 * @author abi
 *
 */
public class DonneesException extends Exception {

	// cl� pour la s�rialisation des exceptions.
	private static final long serialVersionUID = 2964992968445100298L;

	public DonneesException() {
		super();
	}

	public DonneesException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return super.toString()
				+ " au moins une des sources de données incorrecte";
	}

}
