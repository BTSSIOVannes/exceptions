package exception;

/**
 * 
 * @author abi
 *
 */
public class LigneException extends DeserialisationException {

	// clé pour la sérialisation des exceptions.
	private static final long serialVersionUID = 5234855610719116407L;

	private int numeroDeLigne = -1;

	public LigneException(int nLigne) {
		super();
		this.numeroDeLigne = nLigne;
	}

	public LigneException(String arg0, int nLigne) {
		super(arg0);
		this.numeroDeLigne = nLigne;
	}

	public LigneException(Throwable arg0, int nLigne) {
		super(arg0);
		this.numeroDeLigne = nLigne;
	}
	public LigneException(String message, Throwable cause, int nLigne) {
		super(cause);
		this.numeroDeLigne = nLigne;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("Ligne incorrecte : %s, Cause : %s",
						numeroDeLigne, getCause());
	}

}
