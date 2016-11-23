package exception;

/**
 * Exception levée si les données n'ont pas été initialisées et ne sont pas présentes
 * @author abi
 *
 */
public class DonneesException extends Exception {

	// clé pour la sérialisation des exceptions.
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
				+ " au moins une des sources de donnÃ©es incorrecte";
	}

}
