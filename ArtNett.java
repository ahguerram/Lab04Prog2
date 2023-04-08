package lab04_pkg;

public class ArtNett extends Article {
	
	private String type_art;
	
      public ArtNett(String nom_article, double prix, String fournisseur, String type_art) {
        super(nom_article, prix, fournisseur);
        this.type_art = type_art;
        //TODO Auto-generated constructor stub
    }

    @Override
	public void afficherInfo() {
    	System.out.println(getTitre() + " a un prix : " + getPrix() + ", son fournisseur est: " +
    			getFournisseur() + " \net il est : " + controlerQualite(getNom_article()));
    }

    @Override
	public String controlerQualite(String nom_article) {
        // TODO Auto-generated method stub

        switch(nom_article) {
        	case "brosse" :
        	case "Brosse":
        		return "durable";
        	default:
        		return "rapide, efficace, biodégradable";
		}
    }
    
    public String getTitre() {
		return "L'article de type" + this.type_art + getNom_article() ;
	}
}
