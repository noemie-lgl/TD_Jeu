public class GnomeJardin extends NainJardin implements SuperPouvoir, Victime {

    public GnomeJardin( String nom_gnome, int durete){
        super(nom_gnome, durete);
    }

    @Override
    public double sort() {
        return Math.random()*this.solidite;
    }

    @Override
    public int subitCharme(int coup) {
        if (this.solidite >0){           // riposte que s'il n'est pas cassé
            if(this.sort()>coup){
                return coup;
            }
            else{
                return -1;
            }
        }
        else{
            return 0;
        }

    }

    @Override
    public int subitFrappe(int coup) {
        return super.subitFrappe(coup);
    }


}
