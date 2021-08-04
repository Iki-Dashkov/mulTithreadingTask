import classes.air.map;
import classes.bandit.bandit;
import classes.bandit.scroll;
import classes.sheepAndWolf.point;
import classes.sheepAndWolf.sheep;
import classes.vinniAndBee.hive;
import classes.vinniAndBee.bee;
import classes.vinniAndBee.vinni;
import jdk.jshell.JShellException;

import java.util.concurrent.TransferQueue;

public class main {

    public static void main(String[] args) {
        int []ar = {1,2,3,4,5,6,7,8,9};
        point p1 = new point(ar);
        sheep s = new sheep(p1);
        s.start();


        /*
        System.out.println("Vinni and Bee");
        hive hive = new hive();
        vinni v = new vinni(hive,3);
        bee bee1 = new bee(hive,4);
        bee bee2 = new bee(hive,2);
        new Thread(v).start();
        new Thread(bee1).start();
        new Thread(bee2).start();
        */
        /*
        System.out.println("Game start...");
        scroll s = new scroll();
        bandit b1 = new bandit(s);
        bandit b2 = new bandit(s);
        bandit b3 = new bandit(s);
        b1.start();
        b2.start();
        b3.start();
         */

    }
}

