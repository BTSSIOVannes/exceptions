package metier;

import java.io.Serializable;

/**
 * 
 * @author jljouannic, abi
 *
 */
public abstract class ConceptNomme implements Serializable {
	/** clé de hachage SHA qui identifie de manière unique la Classe.
	Cela permet lorsqu’elle est sérialisée, de la marquer avec une
	somme de contrôle (checksum) pour que lors de la désérialisation,
	votre programme soit certain de la version de la classe Java
	qu’il manipule. C’est un gestionnaire de version de votre classe.
	On retrouve cet identifiant dans les exceptions
	*/
	private static final long serialVersionUID = 3500560746325395388L;

	protected String nom;

	public String getNom() {
		return nom;
	}

}
