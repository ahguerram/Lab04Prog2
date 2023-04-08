package lab04_pkg;

public class Batterie extends ArtCuisine {

	public String taille;
	
	public Batterie(String nom_article, double prix, String fournisseur, String type_art, String taille) {
		super(nom_article, prix, fournisseur, type_art);
		this.taille = taille;
		// TODO Auto-generated constructor stub
	}

	public String getTitre() {
		return "La batterie ";
	}
	

}
