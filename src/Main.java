import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Victime> victimes= new ArrayList<Victime>();  //c'est un constructeur donc il y a forcément des parenthèses

        int n=10;

        for(int i=0 ; i<n ; i++){
            int rand= (int) (Math.random()*5);
            if (rand==0) {
                victimes.add(new Sorcier("Sorcier victime " + (i + 1), (int) (Math.random() * 101)));
            }
            else if (rand==1) {
                victimes.add(new Monstre("Monstre victime " + (i + 1), (int) (Math.random() * 101)));
            }
            else if (rand==2) {
                victimes.add(new Magicien("Magicien victime " + (i+1), (int) (Math.random() * 101)));
            }
            else if (rand==3) {
                victimes.add(new NainJardin("Nain de jardin " + (i + 1), (int) (Math.random() * 101)));
            }
            else if (rand==4) {
                victimes.add(new GnomeJardin("Gnome de jardin " + (i + 1), (int) (Math.random() * 101)));
            }
        }


        ArrayList<Personnage> attaquants= new ArrayList<Personnage>();  //c'est un constructeur donc il y a forcément des parenthèses


        for(int i=0 ; i<n ; i++){
            int rand= (int) (Math.random()*3);
            if (rand==0) {
                attaquants.add(new Sorcier("Sorcier attaquant " + (i + 1), (int) (Math.random() * 101)));
            }
            else if (rand==1) {
                attaquants.add(new Monstre("Monstre attaquant " + (i + 1), (int) (Math.random() * 101)));
            }
            else if (rand==2) {
                attaquants.add(new Magicien("Magicien attaquant " + (i+1), (int) (Math.random() * 101)));
            }
        }


        for (int i=0 ; i<n ; i++){
            int rand2= (int) (Math.random()* 10);
            System.out.println("\n Au début du round" + (i+1) + ":\n");
            attaquants.get(i).afficher();
            victimes.get(rand2).afficher();
            attaquants.get(i).attaque( victimes.get(rand2));
            System.out.println("\n A la fin du round" + (i+1) + ":\n");
            attaquants.get(i).afficher();
            victimes.get(rand2).afficher();
            }
        }
    }
