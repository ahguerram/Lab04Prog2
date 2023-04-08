package lab04_pkg;
import java.util.*;

public class TestProduit {

    
    public static int faireInventaire(ArrayList<Article> arts, ArrayList<Meubles> meubs) {
        int nbProduits = 0;
        for (Article a : arts) {
            nbProduits++;
        }
        
        for(Meubles m : meubs) {
            nbProduits++;
        }
        
        return nbProduits;
    }

    public void listerFournisseur(Article[] arts){
        for(int i=0; i<arts.length; i++){
            System.out.println("Le fournisseur " + arts[i].getFournisseur() + " a comme produit " + arts[i].getNom_article());
        }
        //ajouter le fournisseur a l'objet.
    }

    public static String definirQualite(ArrayList<Article> arts){
    	String caract = "";
    	for (Article art : arts) {
            if (art instanceof ArtNett) {
                ArtNett net = (ArtNett) art;
                caract = net.controlerQualite(net.getNom());
          
            } else if (art instanceof ArtCuisine) {
                ArtCuisine artcuis = (ArtCuisine) art;
                caract = artcuis.controlerQualite(artcuis.getNom());
            }
    	}
    	return caract;
     // appeler controlerQualité, ça va retourner un objet et faire un switch case pour comparer chaque chose et retourner
    }
	
	public static void main(String[] args) {
		
		ArrayList<Article> arts = new ArrayList<Article>();
        ArrayList<Meubles> meubs = new ArrayList<Meubles>();
        
        arts.add(new Batterie("Batterie", 750.5, "Cuisinart","Cuisine", "grande"));
        arts.add(new ContenantEnPlastique("Lunch box", 10.5, "Yeti","Cuisine", "petit"));
        arts.add(new Ustensile("Cuillere", 8.5, "PC","Cuisine"));
        arts.add(new Brosse("Brosse bouteille", 750.5, "Asiatica","Produit Nettoyant"));
        arts.add(new ProduiNettoyant("All purpose cleaner", 10.75, "Scrubbing Bubbles","Produit Nettoyant"));
        
        meubs.add(new Table("Bureau", 455.6, 70, 140, 80, "IKEA", "bon", "mauvais",""));
        meubs.add(new Chaise("Chaise salle", 119, 100, 82, 68, "IKEA", "bon", "mauvais", "bon",""));
        
        // Downcasting https://www.baeldung.com/java-type-casting
        /*Definir l'etat des meubles
        *Mesurer chaque meuble
         * 
         */
        for (int i=0; i<meubs.size(); i++){
            if(meubs.get(i) instanceof Table) {
            	((Table) meubs.get(i)).definirEtat();
            	((Table) meubs.get(i)).mesurer();
            } else if (meubs.get(i) instanceof Chaise) {
            	((Chaise) meubs.get(i)).definirEtat();
            	((Chaise) meubs.get(i)).mesurer();
        }
        }
        //Definir qualite de chaque article
         definirQualite(arts);
        
        
        
        // Appeler les méthodes pour tester les fonctionnalités
        int nbProduits = faireInventaire(arts, meubs);
        System.out.println("Nombre de produits : " + nbProduits);
        
        //listerFournisseur(arts);



		
	}

}
