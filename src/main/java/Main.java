import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {
        CcyPair ccyPair = new CcyPair();
        System.out.println(ccyPair.getCcyPair());
        System.out.println(ccyPair.getRate());
        // создает пять задач
        Runnable r1 = new Task();
        Runnable r2 = new Task();
        Runnable r3 = new Task();
        Runnable r4 = new Task();
        Runnable r5 = new Task();

        // создаем пул потоков с номером TIMES_TO_REPEAT из Task
        // потоки как фиксированный размер пула (шаг 2)
        ExecutorService pool = Executors.newFixedThreadPool(Properties.QUANTITY_OF_PAIRS);

        // передает объекты Task в пул для выполнения (шаг 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // закрытие пула (шаг 4)
        pool.shutdown();
    }
}
