package classes.air;

import java.util.Arrays;
import java.util.Random;

public class map {
    Random rand = new Random();
    int [][] map = new int [5][5];


    public int[][] generate(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j]=rand.nextInt(2);
            }
        }
        return map;
    }

}
