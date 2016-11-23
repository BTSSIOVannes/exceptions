package fichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import deserialisation.IDeserialiseur;
import exception.DeserialisationException;
import exception.DonneesException;
import exception.FichierException;
import metier.ConceptNomme;

/**
 * 
 * @author abi
 *
 * @param <T> correspond au type de l'objet présent en exemplaires multiples
 * dans le fichier
 */
public class LireFichier<T extends ConceptNomme> implements ILireFichier<T> {

	private ArrayList<T> tDispos = new ArrayList<T>();

	private IDeserialiseur<Collection<T>> deserialiseurRacine;

	// Adresse "Windows" vers le fichier envoyée dans le constructeur
	private String adresseFichier;

	/**
	 * @param deserialiseurRacine
	 * @param nomFichier
	 */
	public LireFichier(IDeserialiseur<Collection<T>> deserialiseurRacine,
			String adresseFichier) {
		super();
		this.deserialiseurRacine = deserialiseurRacine;
		this.adresseFichier = adresseFichier;
	}

	public void chargerFichier() throws DeserialisationException {

		try {
			Collection<T> resultat = deserialiseurRacine
					.deserialise(new FileReader(adresseFichier));
			tDispos.addAll(resultat);
		} catch (FileNotFoundException e) {
			throw new FichierException(e);
		}

	}

	public String tirerUnNom() throws DonneesException {
		String perso = null;

		if (tDispos.isEmpty()) {
			throw new DonneesException();
		} else {
			/**
			 * choix d'un concept nommÃ© au hasard
			 */

			perso = (tDispos.get((int) (Math.random() * tDispos.size())))
					.getNom();

		}
		return perso;
	}

	@Override
	public void afficherFichier() throws FichierException {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(adresseFichier));

			String line;
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		} catch (FileNotFoundException e) {
			throw new FichierException(e);
		}
		
	}

}
