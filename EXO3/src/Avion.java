class Avion extends Vehicule {
    private String compagnie;
    private double vitesseMax;
    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie : " + compagnie);
        System.out.println("Vitesse maximale : " + vitesseMax + " km/h");
    }
}