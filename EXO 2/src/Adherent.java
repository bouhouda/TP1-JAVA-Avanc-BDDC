class Adherent extends Personne {
    private int numAdherent;
    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }
    public String toString() {
        return super.toString() + ", Numéro Adhérent: " + numAdherent;
    }
}