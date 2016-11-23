package metier;

import java.io.Serializable;

public class Personnage extends ConceptNomme implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 355727108586904065L;
	private String description;
	private String vivant;

	public Personnage(String nom, String description, String etat) {
		super();
		super.nom = nom;
		this.description = description;
		vivant = etat;
	}

	public void setNom(String nom) {
		super.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return nom + " : " + description + " (" + vivant + ")";
	}

}
