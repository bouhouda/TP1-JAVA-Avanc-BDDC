public class GestionBibliotheque {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("N1", "P1", "N1@email.com", "063838383", 30, 101);

        // Instanciation d'un auteur
        Auteur auteur = new Auteur("N2", "P2", "P2@email.com", "0698765432", 72, 201);

        // Instanciation d'un livre
        Livre livre = new Livre(10292033, "TITRELIV", auteur);

        // Affichage des informations
        System.out.println("Informations de l'adhérent : " + adherent.toString());
        System.out.println("Informations du livre : " + livre.toString());
    }
}