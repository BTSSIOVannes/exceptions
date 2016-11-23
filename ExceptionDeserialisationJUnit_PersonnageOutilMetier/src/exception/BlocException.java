package exception;

/**
 * Classe mère qui couvre toutes les exceptions de désérialisation
 * que nous avons pointées dans cet exercice pédagogique 
 * @author jljouannic, abi
 *
 */
public class BlocException extends DeserialisationException {

	// clé pour la sérialisation des exceptions.
	private static final long serialVersionUID = -2783399591600396142L;

	/**
	 * Permet de tracer le numéro de bloc qui a posé problème dans un String
	 * -1 est retenu si le problème survient avant même la lecture du premier bloc.
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
