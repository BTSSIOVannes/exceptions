package metier;

import java.io.Serializable;

public class Outil extends ConceptNomme implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2152035128845056531L;
	private String couleur;
	private String matiere;

	public Outil(String nom, String coul, String mat) {
		super();
		super.nom = nom;
		this.couleur = coul;
		this.matiere = mat;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
