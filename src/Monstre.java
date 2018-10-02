public class Monstre extends Personnage {

    public Monstre(String nom_monstre, int pts_vie){
        super(nom_monstre,pts_vie);
    }

    @Override
    public int subitFrappe(int coup){
        this.addVie(coup);
        if (this.mort()==1){          // riposte s'il est toujours vivant
            return -(this.vie)/2;
        }
        else{
            return 0;
        }
    }

    @Override
    public int subitCharme(int coup){
        this.addVie(coup);
        return (this.vie)/2; //le charmeur reçoit un gain de pts de vie
    }

    @Override
    public void attaque(Victime v){
        if (this.mort()==1){
            int coup= -(this.vie)/2;
            this.vie += v.subitFrappe(coup);
        }
    }
}
