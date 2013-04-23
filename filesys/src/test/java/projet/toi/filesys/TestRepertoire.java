/**
 * Test JUnit pour entité.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */
package projet.toi.filesys;
import static org.junit.Assert.*;
import projet.toi.filesys.repertoire_Exception.*;
import org.junit.Test;


public class TestRepertoire {

	
	@Test(expected = Reference_vide.class)
	public void videReference() throws Reference_vide, Meme_nom_entite, Meme_repertoire {
		Repertoire rep1 = new Repertoire("rep1");
		
			Repertoire rep2 = new Repertoire("rep2");
 			rep2= null;
			rep1.getAjout(rep2);
		
	}
/**
 * 
 * @throws Reference_vide
 * @throws Meme_nom_entite
 * @throws Meme_repertoire
 */
	
	@Test(expected = Meme_nom_entite.class)
	public void MemeNomEntite() throws Reference_vide, Meme_nom_entite, Meme_repertoire{
		Repertoire repertoire = new Repertoire("repertoire");
		Fichier fichier_1 = new Fichier("Fichier_1",50);
		Fichier fichier_2 = new Fichier("Fichier_2",20);
		Repertoire repertoire_1 = new Repertoire("repertoire_1");
		Repertoire repertoire_2 = new Repertoire("repertoire_2");
		
		repertoire.getAjout(fichier_1);
		repertoire.getAjout(fichier_2);
		repertoire.getAjout(repertoire_1);
		repertoire.getAjout(repertoire_2);
		
		Repertoire rep = new Repertoire("repertoire_2");
		repertoire.getAjout(rep);
		
		
		
	}
	/**
	 * 
	 * @throws Reference_vide
	 * @throws Meme_nom_entite
	 * @throws Meme_repertoire
	 */
	
	@Test
	public void mesureTaille() throws Reference_vide, Meme_nom_entite, Meme_repertoire{
		
		Repertoire repertoire = new Repertoire("repertoire");
		
		Fichier fichier_1 = new Fichier("Fichier_1",50);
		Fichier fichier_2 = new Fichier("Fichier_2",20);
		
		repertoire.getAjout(fichier_1);
		repertoire.getAjout(fichier_2);
		
		System.out.println(repertoire.getTaille());
		
		assertTrue(repertoire.getTaille()==70);
	}
	
	/**
	 * 
	 * @throws Reference_vide
	 * @throws Meme_nom_entite
	 * @throws Meme_repertoire
	 */
	@Test(expected = Meme_repertoire.class)
	public void MemeRepertoire() throws Reference_vide, Meme_nom_entite, Meme_repertoire{
		Repertoire repertoire = new Repertoire("repertoire");
		Repertoire repertoire_1 = new Repertoire("repertoire_1");
		repertoire_1.getAjout(repertoire);
		repertoire.getAjout(repertoire_1);
		repertoire.getAjout(repertoire);
		
	}
	
}
