public class Livre {

    //Attribut de la Livre
    private int id ;
    private String titre ;
    private String auteur;
    private String name;
    private int nbr_page;
    private String editeur;
    private static int nbrlivre=0;


    //Propriete et methode d'acces  de la Livre
    private void setTitre(String titulo) {this.titre = titulo;}
    private void setAuteur(String auteur) {this.auteur = auteur;}
    private void setName(String name){this.name = name;}
    private void setNbr_page(int nbr_page){this.nbr_page = nbr_page;}
    private void setEditeur(String editeur){this.editeur = editeur;}
    public int getId(){return id;}
    public String getTitre(){return titre;}
    public String getAuteur(){return auteur;}
    public String getName(){return name;}
    public int getNbr_page(){return nbr_page;}
    public String getEditeur(){return editeur;}
    public int getNbrlivre(){return nbrlivre;}



    //Cette fonction retourne les details d'un rectangle
    public String toString()
    {
        return  "Id : " + this.getId() + "| Titre : " + this.getTitre() + "| - Auteur : " +  this.getAuteur() + "| Name : " + getName() + "| Nbr Page : " + getNbr_page() + "| Editeur : " + getEditeur() ;
    }




    //constructeur par defaut
    public Livre(String titre,String auteur,String name) {
        nbrlivre++;
        this.id = nbrlivre;
        this.titre = titre;
        this.auteur = auteur;
        this.name = name;

    }

    // constructeur avec toutes les parametres
    public Livre(String titre,String auteur,String name, int nbr_page, String editeur   ) {
        nbrlivre++;
        this.id = nbrlivre;
        this.titre = titre;
        this.auteur = auteur;
        this.name = name;
        this.nbr_page = nbr_page;
        this.editeur = editeur;

    }



}
