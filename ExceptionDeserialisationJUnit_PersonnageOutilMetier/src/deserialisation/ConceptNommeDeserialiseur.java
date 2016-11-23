/**
 *
 */
package deserialisation;

import java.io.Reader;

import metier.ConceptNomme;
import exception.DeserialisationException;

/**
 * Classe asbtraite qui sert de moule g�n�ral pour M�tier, Outil et Personnage
 * @author jljouannic, abi
 *
 */
public abstract class ConceptNommeDeserialiseur<T extends ConceptNomme>
		implements IDeserialiseur<T> {

	// Le s�parateur retenu pour les concepts nomm�s, pour distinguer les tokens d'un String
	public static final String SEP = "#";

	/**
	 * Constructeur par d�faut
	 */
	public ConceptNommeDeserialiseur() {
		super();
	}


	/**
	 * Un fichier contient une collection de concepts nomm�s. Or, ici, on ne d�s�rialise
	 * qu'un seul concept nomm� � la fois.
	 * @see deserialisation.IDeserialiseur#deserialise(java.io.Reader)
	 */
	public T deserialise(Reader entree) throws DeserialisationException {
		throw new UnsupportedOperationException(
				"M�thode non impl�ment�e dans cette classe");
	}

}
