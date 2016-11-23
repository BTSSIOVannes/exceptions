package metier;

import java.io.Serializable;

public class Metier extends ConceptNomme implements Serializable{

	private static final long serialVersionUID = 7888069456399000639L;
	private String ville;

	public Metier(String nom, String ville) {
		super();
		super.nom = nom;
		this.ville = ville;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
