package lab04_pkg;

public class ContenantEnPlastique extends ArtCuisine {

	private String forme;
	
	public ContenantEnPlastique(String nom_article, double prix, String fournisseur, String type_art, String forme) {
		super(nom_article, prix, fournisseur, type_art);
		this.forme = forme;
		// TODO Auto-generated constructor stub
	}

	public String getTitre() {
		return "Le contenant en plastique ";
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

}
