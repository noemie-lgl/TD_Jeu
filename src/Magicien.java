public class Magicien extends Sorcier implements SuperPouvoir {

    public Magicien(String nom_magicien, int pts_vie){
        super(nom_magicien,pts_vie);
    }

    public double getpouvoir(){
        return extra*this.pouvoir;
    }

    @Override
    public double sort(){
        return Math.random()*(getpouvoir());
    }

    @Override
    public int subitCharme(int coup){
        if (this.mort()==1){                 //riposte s'il n'est pas mort
            return (int)(coup*this.sort());
        }
        else {
            return 0;
        }
    }
}

