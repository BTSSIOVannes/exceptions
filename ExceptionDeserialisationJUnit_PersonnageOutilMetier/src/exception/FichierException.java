package exception;

/**
 * 
 * @author abi
 *
 */
public class FichierException extends DeserialisationException {

	// clé pour la sérialisation des exceptions.
	private static final long serialVersionUID = -2981401269598538751L;

	public FichierException() {
		super();
	}

	public FichierException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return super.toString() + "  fichier incorrect";
	}

}
