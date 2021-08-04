package classes.sheepAndWolf;

import java.util.Random;

public class point {
    int x =3;
    int[] array;
    Random rand = new Random();
    int number =0;

    public point(int[] array) {
        this.array = array;
    }

    public int generate(){
        return number = rand.nextInt(10);
    }

}
