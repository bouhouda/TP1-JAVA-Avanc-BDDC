class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;
    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + ", Tel: " + tel + ", Âge: " + age;
    }
}
