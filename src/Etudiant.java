publc class Etudiant extends cour implements NiveauInteligence {
    private string nom;
    private string prenom;
    private string sexe;

    public Etudiant(String nom, String prenom, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public void presentation() {
        System.out.println("Bonjour je m'appelle " + nom + " " + prenom + " et je suis de sexe " + sexe);
    }

    // Redéfinission des méthodes abstraites de la classe abstraite cour

    public void lire(String lire) {
        System.out.println("je suis en train de lire " + lire);
    }

    public void ecrire(String ecrire) {
        System.out.println(" je suis en train d'écrire " + ecrire);
    }

    // Redéfinission des méthodes de l'interface  NiveauInteligence

    public void calculer() {
        System.out.println("je suis en train de calculer ");
    }

    public void reflechir() {
        System.out.println("je suis en train de reflechir sur un exercice");
    }
}