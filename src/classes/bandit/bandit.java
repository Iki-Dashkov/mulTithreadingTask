package classes.bandit;

/*
Однорукий бандит - 3 потока, генерирующие числа от 0 до 9.
По нажатию кнопки потоки останавливаются и результат анализируется.
При анализе использовать следующие комбинации
(три одинаковых числа, два одинаковых числа, три единицы, три семерки, две единицы, имеется четверка)
 */

public class bandit extends Thread {
    scroll scroll;
    int result;

    public bandit(scroll scroll) {
        this.scroll = scroll;
    }

    @Override
    public void run() {
        result = scroll.generate();
        System.out.println(result);

        int [] array = new int[3];
        int count31=0;
        int count37=0;
        int count21=0;

        for (int i = 0; i < 1; i++) {
            array[i] = result;
            if(array[i]==1){
                count31++;
                if(count31==3){
                    System.out.println("three 1");
                }
            }
            if(array[i]==7){
                count37++;
                if(count37==3){
                    System.out.println("three 7");
                }
            }
            if(array[i]==1){
                count21++;
                if(count21==2){
                    System.out.println("two 1");
                }
            }
            if(array[i]==4){
                System.out.println("contain 4");
            }
           System.out.print(array[i]+" ");
        }
    }
}
