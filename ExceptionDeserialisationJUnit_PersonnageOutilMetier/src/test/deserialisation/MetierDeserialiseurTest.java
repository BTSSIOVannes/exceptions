package test.deserialisation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import deserialisation.MetierDeserialiseur;
import exception.DeserialisationException;
import metier.Metier;
import metier.Principale;

public class MetierDeserialiseurTest {

	@Test
	public void deserialiseTest() {
		try {
			String chaine="Boulanger#Vannes";
			MetierDeserialiseur md = new MetierDeserialiseur();
			Metier m = md.deserialise(chaine);
			assertEquals(m.getNom(),"Boulanger");
			assertEquals(m.getVille(),"Vannes");
		} catch (Exception e) {
			fail("exception levée");
		}
		try {
			String chaine="Boulanger#Vannes#Radis";
			MetierDeserialiseur md = new MetierDeserialiseur();
			md.deserialise(chaine);
			fail("exception non levée");
		} catch (DeserialisationException e) {
		}


	}

	@Test
	public void deserialiseFichierTest() {
		try {
			try {
				try {
					MetierDeserialiseur md = new MetierDeserialiseur();
					md.deserialise(new FileReader(Principale.CHEMIN_FICHIER_METIER));
					fail("exception non levée");

				} catch (UnsupportedOperationException e) {
					// comportement normal
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fail(" fichier non trouvéexception");
			}
		} catch (DeserialisationException e) {
			fail("exception désérialisation");
		}


	}

}
