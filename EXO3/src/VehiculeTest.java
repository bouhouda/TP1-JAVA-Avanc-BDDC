public class VehiculeTest {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("DACIA", 250, "LOGAN", 2021);
        maVoiture.emettreSon();
        maVoiture.afficherInformations();
        Moto maMoto = new Moto("YAMAHA", 1200, "SPORT", 120);
        maMoto.emettreSon();
        maMoto.afficherInformations();
        Avion monAvion = new Avion("TEST", 199000, "Air TEST", 980);
        monAvion.emettreSon();
        monAvion.afficherInformations();
    }
}
