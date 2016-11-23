/**
 *
 */
package deserialisation;

import java.io.Reader;

import metier.ConceptNomme;
import exception.DeserialisationException;

/**
 * Classe asbtraite qui sert de moule général pour Métier, Outil et Personnage
 * @author jljouannic, abi
 *
 */
public abstract class ConceptNommeDeserialiseur<T extends ConceptNomme>
		implements IDeserialiseur<T> {

	// Le séparateur retenu pour les concepts nommés, pour distinguer les tokens d'un String
	public static final String SEP = "#";

	/**
	 * Constructeur par défaut
	 */
	public ConceptNommeDeserialiseur() {
		super();
	}


	/**
	 * Un fichier contient une collection de concepts nommés. Or, ici, on ne désérialise
	 * qu'un seul concept nommé à la fois.
	 * @see deserialisation.IDeserialiseur#deserialise(java.io.Reader)
	 */
	public T deserialise(Reader entree) throws DeserialisationException {
		throw new UnsupportedOperationException(
				"Méthode non implémentée dans cette classe");
	}

}
