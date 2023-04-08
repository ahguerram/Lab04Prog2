package lab04_pkg;

public abstract class Article implements Titre{

	private String fournisseur;
    private double prix;
    private String nom_article;
	protected Article[] inventaire_article;
    private final static int MAXNBARTICLES = 30;
    private int nbreArticles;
    private String etat="";
    
    
    public Article(String nom_article, double prix, String fournisseur){
        this.fournisseur=fournisseur;
        this.prix = prix;
        this.nom_article = nom_article;
        
    }
    
    public Article() {
    	inventaire_article = new Article[MAXNBARTICLES];
        nbreArticles = 0;
    }

    public String getFournisseur(){
        return fournisseur;
    }

    public double getPrix(){
        return prix;
    }

    public String getNom_article(){
        return nom_article;
    }

    public void setFournisseur(String new_fournisseur){
        this.fournisseur = new_fournisseur;
    }

    public void setPrix(double new_prix){
        this.prix = new_prix;
    }

    public void setNom_article(String new_nom_article){
        this.nom_article = new_nom_article;
    }

    public abstract String controlerQualite(String nom_article);

       
    public String getTitre() {
    	
    	return "L'article ";
    }
    
    public String getNom() {
    	
    	return getTitre() + this.nom_article;
    }
    
    public void afficherInfo(){
    	System.out.println(getNom() + " coût " + this.prix + " et son fournisseur est :" + this.fournisseur);
    }

    public void ajouterArticles(Article art){
        ++nbreArticles;
        if(nbreArticles <=MAXNBARTICLES){
            inventaire_article[nbreArticles-1] = art;
        }
        else{
            System.out.println("Pas plus de" + MAXNBARTICLES + "articles");
        }
    }
}
