package classes.vinniAndBee;

public class vinni  implements Runnable{
    hive hive;
    int count;

    public vinni(hive hive, int count) {
        this.hive = hive;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            hive.get(2);
        }
    }
}
