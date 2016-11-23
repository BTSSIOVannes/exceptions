package fichier;

import exception.DeserialisationException;
import exception.DonneesException;
import exception.FichierException;

public interface ILireFichier<T> {

	// Permet de prendre lenom d'une ligne au hasard associée au fichier
	String tirerUnNom() throws DonneesException;

	// Permet d'initialiser une collection d'objet de type T
	// avec le contenu d'un fichier
	void chargerFichier() throws DeserialisationException;

	// Affiche le contenu du fichier, ligne par ligne, sans passer par des objets.
	void afficherFichier() throws FichierException;
}
