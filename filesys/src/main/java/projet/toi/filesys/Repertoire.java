/**
 * initialisation et ajout d'un repertoire.
 * @version avril 2013.
 * @author barsaoui.
 * 
 */
package projet.toi.filesys;
import java.util.*;
import projet.toi.filesys.repertoire_Exception.*;



public class Repertoire extends Entite{
   
    private  ArrayList<Entite> arbo; 
  
/**
 *     
 * @param Lenom initialisation du nom.
 */
    
    public Repertoire(String Lenom)
    {
        super(Lenom);
        arbo = new ArrayList<Entite>();
    }

 /**
 * ajout de l'entité.     
 * @param uneEntite ajout de l'entité
 * @throws Reference_vide exception lorsque la reference est nulle.
 * @throws Meme_nom_entite exception lorsque l'entité est du meme nom
 * @throws Meme_repertoire exception lorsque le repertoire est deja existant. 
 * 
 */
 
  
    public void getAjout(Entite uneEntite) throws Reference_vide,Meme_nom_entite, Meme_repertoire{
    		if(uneEntite == null){
    		throw new Reference_vide("l'entité est vide");
    		}
     
    		if(verif_nom(uneEntite) == true){
    		throw new Meme_nom_entite("Le nom de cette entite existe deja");	
    		}	
    	
    		if(meme_repertoire(uneEntite) == true){
    		throw new Meme_repertoire("c'est le meme repertoire ");
    		
    		}
    	
    	arbo.add(uneEntite); 				// si toutes les conditions sont satisfaites, ajouter au tableau. 
    
 /**
  *@return retourne la taille de l'entité.   	
  */
 
    }
    
     public int getTaille(){
     int taille = 0 ;
    
     for(Entite e : arbo)
        taille += e.getTaille();						
    
     return taille;
        
    }
  /**
   * 
   * @param entite
   * @return resultat du test. 
   */
     public boolean verif_nom(Entite entite){
    	
    	 for(Entite e : arbo){
    		if( e.getNom().equals(entite.getNom()))				// tester si les chaines de caractere sont égales.
    				return true;
    	 }
    	 return false;
     }
     public boolean meme_repertoire(Entite entite){
    	 if (this == entite)   									// tester si les fichiers sont egaux 
    		 return true;	
    	 else if (entite instanceof Repertoire) {
    		 Repertoire ent = (Repertoire) entite;
    		 for (Entite e : ent.getArbo())
    		 	{
    			 if (e instanceof Repertoire) {				// tester si les repertoires sont egaux. 
    				 return meme_repertoire(e);				// parcours recursif en profondeur. 
    				 										
    			 	}
    		 	}
    	 }
    	 return false;


     	}
     /**
      * 
      * @return le tableau. 
      */
     
     public ArrayList<Entite> getArbo()
     {
     return arbo;
     }
     
     
}    
