/**
 * Gestion d'erreur.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */

package projet.toi.filesys.repertoire_Exception;

public class Meme_nom_entite extends Exception {

	/**
	 * 
	 * @param message renvoie le message d'erreur. 
	 */
	public Meme_nom_entite(String message)
	{
		super(message);
	}
	
}