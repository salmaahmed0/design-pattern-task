package singletone;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Thread task1 = new Thread(() -> {
            Counter counter1 = Counter.getInstance();
            counter1.increment();
            System.out.println("Unsafe Counter1: " +  counter1.count + ", Hash code : "+ counter1);
        });
        Thread task2 = new Thread(() -> {
            Counter counter2 = Counter.getInstance();
            counter2.increment();
            System.out.println("Unsafe Counter2: " +  counter2.count + ", Hash code : "+ counter2);
        });
        task1.start();
        task2.start();
//
        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Unsafe Counter Value: " + Counter.getInstance().count);

        System.out.println("--------");
        Thread Ptask1 = new Thread(() -> {
            SafeCounter counter1 = SafeCounter.getInstance();
            counter1.increment();
            System.out.println("Safe Counter1: " +  counter1.count + ", Hash code : "+ counter1);
        });
        Thread Ptask2 = new Thread(() -> {
            SafeCounter counter2 = SafeCounter.getInstance();
            counter2.increment();
            System.out.println("Safe Counter2: " +  counter2.count + ", Hash code : "+ counter2);
        });
        Ptask1.start();
        Ptask2.start();

        try {
            Ptask1.join();
            Ptask2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final Safe Counter Value: " + SafeCounter.getInstance().count);
    }

}
