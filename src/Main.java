//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creation des trois livres
        Livre l1 = new Livre("Livre1", "Auteur1", "L1",10,"Taha Hssine");
        Livre l2 = new Livre("Livre2", "Auteur2", "L2",20,"Najib Mahfoudh");
        Livre l3 = new Livre("Livre3", "Auteur3", "L3",15,"HASNI ZIED");
        //Affichage des information des objet l1,l2,l3
        System.out.println("Les information de l1 : " + l1.toString());
        System.out.println("Les information de l2 : " + l2.toString());
        System.out.println("Les information de l3 : " + l3.toString());
        //Affichage des nombres de page des objets l1,l2,l3
        System.out.println("Nombre de page de l1 : " + l1.getNbr_page());
        System.out.println("Nombre de page de l2 : " + l2.getNbr_page());
        System.out.println("Nombre de page de l3 : " + l3.getNbr_page());
        //Affichage des nombres total des pages des objets l1,l2,l3
        System.out.println("Nombre total des pages de l1,l2,l3 : " +  (l1.getNbr_page() + l2.getNbr_page() + l3.getNbr_page()));

    }
}