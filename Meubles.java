package lab04_pkg;

public abstract class Meubles implements Titre {

	private double hauteur;
    private double largeur;
    private double longeur;
    private String nom_meuble;
    private double prix_meuble;
    private String fournisseur;
    private Meubles[] inventaire_meubles;
    private int nbreMeubles;
    private final static int MAXNMEUBLES = 10;
    private String etat;


    public Meubles(String nom_meuble, double prix_meuble, double hauteur, double largeur, double longeur, String fournisseur, String etat) {
		this.hauteur = hauteur;
        this.largeur = largeur;
        this.longeur = longeur;
        this.prix_meuble = prix_meuble;
        this.fournisseur = fournisseur;
        this.nom_meuble = nom_meuble;
        this.etat=etat;
		// TODO Auto-generated constructor stub
	}
    
    public Meubles() {
    	inventaire_meubles = new Meubles[MAXNMEUBLES];
        nbreMeubles = 0;
    }

	public double getHauteur(){
        return hauteur;
    }

    public double getLargeur(){
        return largeur;
    }

    public double getLongeur(){
        return longeur;
    }

   public double getPrix_meuble() {
		return prix_meuble;
	}

	public void setPrix_meuble(double prix_meuble) {
		this.prix_meuble = prix_meuble;
	}
	
    
    public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public abstract void afficherInfo();
	public abstract Meubles mesurer();
    
    public String getTitre() {
    	return "Le meuble ";
    }
    
    public String getNom() {
    	return getTitre() + this.nom_meuble;
    }
    
    public void ajouterMeubles(Meubles meub){
        ++nbreMeubles;
        if(nbreMeubles <=MAXNMEUBLES){
            inventaire_meubles[nbreMeubles-1] = meub;
        }
        else{
            System.out.println("Pas plus de" + MAXNMEUBLES + "meubles");
        }
    }
    
}
