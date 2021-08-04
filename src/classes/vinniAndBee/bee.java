package classes.vinniAndBee;

/*
Заданное количество пчел добывают мед равными порциями, задерживаясь в пути на случайное время.
Винни-Пух потребляет мед порциями заданной величины за заданное время и столько же времени может прожить без питания.
Работа каждой пчелы реализуется в порожденном потоке.
 */
public class bee implements Runnable {
    hive hive;
    int count;

    public bee(hive hive,int count) {
        this.hive = hive;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            hive.put(3);
        }
    }
}
