public class NainJardin implements Victime {

    protected String nom;
    protected int solidite;

    public NainJardin(String nom_nain, int durete){
        this.nom = nom_nain;
        this.solidite = durete;
    }

    public void afficher() {
        System.out.println("Je m'appelle " + this.nom + " et j'ai " + this.solidite + " de solidité.");
    }

    public int subitFrappe(int coup){
        if (this.solidite > 0){
            if (coup > this.solidite){         //riposte que s'il n'est pas cassé
                int coup_rendu = this.solidite;
                this.solidite=0;
                return -coup_rendu;
            }
            else {
                return coup;
            }
        }
        else{
            return 0;
        }

    }

    public int subitCharme(int coup){
        if (this.solidite>0){
            return -1;
        }
        else{
            return 0;
        }
    }

}
