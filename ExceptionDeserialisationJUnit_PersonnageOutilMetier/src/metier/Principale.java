package metier;

import deserialisation.CollectionConceptNommeDeserialiseur;
import deserialisation.MetierDeserialiseur;
import deserialisation.OutilDeserialiseur;
import deserialisation.PersonnageDeserialiseur;
import exception.DeserialisationException;
import exception.DonneesException;
import fichier.LireFichier;

public class Principale {

	public static final String CHEMIN_FICHIER_PERSONNAGE = "src/donnees/Personnages.txt";
	public static final String CHEMIN_FICHIER_OUTIL = "src/donnees/Outils.txt";
	public static final String CHEMIN_FICHIER_METIER = "src/donnees/Metiers.txt";

	public static LireFichier<Metier> lfm;
	public static LireFichier<Outil> lfo;
	public static LireFichier<Personnage> lfp;

	/**
	 * Charge les données des trois fichiers et stocke l'accès à ces fichiers dans les
	 * trois attributs lfp, lfo, lfm
	 * @throws DonneesException
	 */
	public static void init() throws DonneesException {

		lfp = new LireFichier<Personnage>(
				new CollectionConceptNommeDeserialiseur<Personnage>(
						new PersonnageDeserialiseur()),
				CHEMIN_FICHIER_PERSONNAGE);
		lfo = new LireFichier<Outil>(
				new CollectionConceptNommeDeserialiseur<Outil>(
						new OutilDeserialiseur()), CHEMIN_FICHIER_OUTIL);
		lfm = new LireFichier<Metier>(
				new CollectionConceptNommeDeserialiseur<Metier>(
						new MetierDeserialiseur()), CHEMIN_FICHIER_METIER);

		try {
			lfp.chargerFichier();
			lfo.chargerFichier();
			lfm.chargerFichier();
		} catch (DeserialisationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Affiche trois noms issus de trois fichiers, de façon aléatoire.
	 * @throws DonneesException
	 */
	public static void afficherTrois() throws DonneesException {
		System.out.println(lfp.tirerUnNom() + ", " + lfm.tirerUnNom()
		+ ", avec " + lfo.tirerUnNom());
	}

	public static void main(String[] args) throws DonneesException {
		init();
		// Affiche 20 lignes combinant aléatoirement des informations des fichiers.
		for (int i = 0; i < 20; i++) {
			afficherTrois();
		}

		//new LireFichier<Metier>(null,".\\src\\donnees\\Metiers.txt").afficherFichier();;

	}

}
