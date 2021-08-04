package classes.vinniAndBee;

import java.awt.*;

public class hive {
    private int honey;

    public synchronized void get(int count){
        while (honey<3){
            try{
                wait();
            }catch (Exception e){

            }
        }
        honey=honey-count;
        System.out.println("honey -"+count);
        System.out.println("honey left "+ honey);
        notify();
    }

    public synchronized void put(int count){
        while (honey>=10){
            try{
                wait();
            }catch (Exception e){

            }
        }
        honey=honey+count;
        System.out.println("honey +"+count);
        System.out.println("honey left "+ honey);
        notify();
    }
}
