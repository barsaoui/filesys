/**
 * Entite contenant un repertoire ou un fichier.
 * @version avril 2013
 * @author barsaoui
 */
package projet.toi.filesys;

public abstract class Entite{
private String nom;
/**
 * s
 * @param Lenom initialise le nom de l'entite.
 */

public Entite(String Lenom) {
    nom = Lenom;
    }
    
public abstract int getTaille();  
/**
 *     
 * @return le nom.
 */
public String getNom(){
	   return nom;
   }
}

