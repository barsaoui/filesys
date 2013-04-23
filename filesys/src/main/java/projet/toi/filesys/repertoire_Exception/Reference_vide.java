/**
 * Gestion d'erreur.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */
package projet.toi.filesys.repertoire_Exception;


public class Reference_vide extends Exception {

/**
 * 	
 * @param message retourne un message lorsque la reference ajouté est vide.
 */
	public Reference_vide(String message)
	{
		super(message);
	}
	
	
}
