// Classe de base Vehicule
class Vehicule {
    protected String nom;
    protected double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.println("Nom du véhicule : " + nom);
        System.out.println("Prix du véhicule : " + prix + " euros");
    }
}

// Classe Voiture héritant de Vehicule
class Voiture extends Vehicule {
    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modèle : " + modele);
        System.out.println("Année : " + annee);
    }
}

// Classe Moto héritant de Vehicule
class Moto extends Vehicule {
    private String marque;
    private int puissance;

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque : " + marque);
        System.out.println("Puissance : " + puissance + " chevaux");
    }
}

// Classe Avion héritant de Vehicule
class Avion extends Vehicule {
    private String compagnie;
    private double vitesseMax;

    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie : " + compagnie);
        System.out.println("Vitesse maximale : " + vitesseMax + " km/h");
    }
}

// Classe principale pour tester
public class VehiculeTest {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", 25000, "Camry", 2021);
        maVoiture.emettreSon();
        maVoiture.afficherInformations();

        System.out.println("-------------------------");

        Moto maMoto = new Moto("Ducati", 12000, "Monster", 120);
        maMoto.emettreSon();
        maMoto.afficherInformations();

        System.out.println("-------------------------");

        Avion monAvion = new Avion("Boeing", 150000000, "Air Canada", 980);
        monAvion.emettreSon();
        monAvion.afficherInformations();
    }
}
