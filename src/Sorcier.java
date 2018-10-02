public class Sorcier extends Personnage {

    protected double pouvoir;

    public Sorcier(String nom_sorcier, int pts_vie){
        super(nom_sorcier,pts_vie);
        this.pouvoir= Math.random();
    }

    public double getPouvoir(){
        return this.pouvoir;
    }

    @Override
    public int subitFrappe(int coup){
        this.addVie(coup);
        if (this.mort()==1){                               //s'il n'est pas mort, il riposte
            return (int)(-(this.vie)*(this.pouvoir));
        }
        else{
            return 0;
        }

    }

    @Override
    public int subitCharme(int coup){
        return 0;
    }

    @Override
    public void attaque(Victime v){
        if (this.mort()==1){
            int coup= (int)(-(this.vie)*(this.pouvoir));
            this.vie += v.subitCharme(coup);
        }
    }

}
