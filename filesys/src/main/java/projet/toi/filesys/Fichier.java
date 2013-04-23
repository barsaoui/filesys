/**
 * initialisation et ajout d'un fichier.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */
package projet.toi.filesys;
import projet.toi.filesys.Entite;

public class Fichier extends Entite
{
    
    private int taille; 
  /**
   * 
   * @param Lenom initialise le nom de l'entité.
   * @param taille initialise la taille de l'entité.
   */
    public Fichier(String Lenom, int taille)
    {    
        super(Lenom);
        this.taille = taille;
    }
    /**
     * @return la taille de l'entité.
     */
    public int getTaille()
    {
        return taille;
    }
    
    
}
