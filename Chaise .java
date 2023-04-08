package lab04_pkg;

public class Chaise extends Meubles implements Meuble {

	private String etat_dossier;
    private String etat_pieds;
    private String etat_planche;
    
    public Chaise(String nom_meuble, double prix_meuble, double hauteur, double largeur, double longeur, String fournisseur, String etat_planche, String etat_pieds, String etat_dossier, String etat) {
		super(nom_meuble, prix_meuble, hauteur, largeur, longeur, fournisseur, etat);
		this.etat_planche = etat_planche;
		this.etat_pieds = etat_pieds;
		this.etat_dossier = etat_dossier;
	}

    @Override
    public String definirEtat() {
		if (this.etat_planche == "bon" && this.etat_pieds == "bon" && this.etat_dossier == "bon" ) {
			setEtat("parfait");
			return "parfait";
		}
		else if ((this.etat_planche == "bon" && this.etat_pieds == "mauvais" && this.etat_dossier == "bon" )
				|| (this.etat_planche == "bon" && this.etat_pieds == "bon" && this.etat_dossier == "mauvais") ||
				(this.etat_planche == "mauvais" && this.etat_pieds == "bon" && this.etat_dossier == "bon" ))
				{
			setEtat("bon");
			return "bon";
		}
		
		else if ((this.etat_planche == "mauvais" && this.etat_pieds == "mauvais" && this.etat_dossier == "mauvais") ||
			(this.etat_planche == "mauvais" && this.etat_pieds == "bon" && this.etat_dossier == "mauvais") ||
			(this.etat_planche == "mauvais" && this.etat_pieds == "mauvais" && this.etat_dossier == "bon") ||
			(this.etat_planche == "bon" && this.etat_pieds == "mauvais" && this.etat_dossier == "mauvais")) {
			setEtat("mauvais");
			return "mauvais";
		}
		else return "undefined";
    }

    @Override
    public void afficherInfo() {
        System.out.println("Etat de la chaise:" + definirEtat() + ", \ndimensions (hauteur, largeur, longeur):" + getHauteur()+ getLargeur()+ getLongeur());
        
    }
    
    @Override
    public Meubles mesurer(){
        Meubles chaise = new Chaise(getNom(), getPrix_meuble(), getHauteur(), getLargeur(), getLongeur(), getFournisseur(), getEtat(), this.etat_planche, this.etat_pieds, this.etat_dossier);
        return chaise;
    }
    
}
