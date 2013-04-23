/**
 * Gestion d'erreur.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */
package projet.toi.filesys.repertoire_Exception;

public class Meme_repertoire extends Exception{

/**
 * 	
 * @param message retourne le message lorsque le nom de l'entité est deja existant.
 */
	public Meme_repertoire(String message){
		super(message);
	}
	
}
