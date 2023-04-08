package lab04_pkg;

public class ArtCuisine extends Article {
	
	private String type_art;
	
	public ArtCuisine(String nom_article, double prix, String fournisseur, String type_art) {
		super(nom_article, prix, fournisseur);
		this.type_art = type_art;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficherInfo() {
		System.out.println(getTitre() + getNom_article() + " a un prix : " + getPrix() + ", son fournisseur est: " +
	getFournisseur() + " \net il est/a : " + controlerQualite(getNom_article()));
	}
	
	@Override
	public String controlerQualite(String nom_article) {
        // TODO Auto-generated method stub
		Article art = new ArtCuisine()//*************************************************
        switch(nom_article) {
        	case "batterie":
        	case "Batterie":
        		return "Revêtement antiadisif";
        	case "contenant":
        	case "Contenant":
        		return "Pba free";
        	default:
        		return "Durable, professionnelle";
    
		}
    }
	
	public String getTitre() {
		return "L'article de type " + this.type_art;
	}
	
}
