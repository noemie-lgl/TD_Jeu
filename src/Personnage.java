public abstract class Personnage implements Victime{

    protected String nom;
    protected int vie;

    public Personnage(String nom_perso, int ptsDeVie) {
        this.nom = nom_perso;
        this.vie = ptsDeVie;
    }

    public void afficher() {
        System.out.println("Je m'appelle " + this.nom + " et j'ai " + this.vie + " points de vie.");
    }

    public String getNom() {
        return this.nom;
    }

    public int mort() {
        if (this.vie < 1) {
            return 0; // le personnage est mort
        } else {
            return 1; // le personnage est vivant
        }
    }

    public int pointsDeVie() {
        return this.vie;
    }

    public void addVie(int num) {
        this.vie += num;
    }

    public abstract void attaque(Victime v);

    public abstract int subitFrappe(int coup);

    public abstract int subitCharme(int coup);
}