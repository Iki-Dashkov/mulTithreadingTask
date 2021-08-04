package classes.bandit;

import java.util.Random;

public class scroll {
    private int number = 0;
    Random rand = new Random();

    public int generate(){
        return number = rand.nextInt(10);
    }
}
