package exception;

/**
 * Classe m�re qui couvre toutes les exceptions de d�s�rialisation
 * que nous avons point�es dans cet exercice p�dagogique 
 * @author jljouannic, abi
 *
 */
public class BlocException extends DeserialisationException {

	// cl� pour la s�rialisation des exceptions.
	private static final long serialVersionUID = -2783399591600396142L;

	/**
	 * Permet de tracer le num�ro de bloc qui a pos� probl�me dans un String
	 * -1 est retenu si le probl�me survient avant m�me la lecture du premier bloc.
	 */
	private int numeroDeBloc = -1;

	public BlocException(String message, Throwable cause, int numeroDeBloc) {
		super(message, cause);
		this.numeroDeBloc = numeroDeBloc;
	}

	/**
	 *
	 */
	public BlocException(int numeroDeBloc) {
		super();
		this.numeroDeBloc = numeroDeBloc;
	}


	/**
	 * @param message
	 */
	public BlocException(String message, int numeroDeBloc) {
		super(message);
		this.numeroDeBloc = numeroDeBloc;
	}

	/**
	 * @param cause
	 */
	public BlocException(Throwable cause, int numeroDeBloc) {
		super(cause);
		this.numeroDeBloc = numeroDeBloc;
	}

	/**
	 * @return the numeroDeBloc
	 */
	public int getNumeroDeBloc() {
		return numeroDeBloc;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("Bloc incorrect : %s", numeroDeBloc);
	}
}
