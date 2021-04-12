// Класс для моделирования изменений курса валют. Используем ThreadPool

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.Properties;

// Задача класса для выполнения (Шаг 1)
class Task implements Runnable {
    private CcyPair ccyPair;
    private String ccyPairName;
    private double ccyRate;

//    public Task(String s) {
//        name = s;
//    }

    // Печатает имя задачи и спит в течение 1 с
    // Весь этот процесс повторяется 5 раз
    public void run() {
        try {
            for (int i = 0; i <= Properties.TIMES_TO_REPEAT; i++) {
                ccyPair = new CcyPair();
                ccyPairName = ccyPair.getCcyPair();
                ccyRate = ccyPair.getRate();
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Price call for ccyPair - " + ccyPairName
                            + " at the time " + ft.format(d)
                            + " rate = " + ccyRate);
                    // печатает время инициализации для каждой задачи
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Price call for ccyPair - " + ccyPairName
                            + " at the time " + ft.format(d)
                            + " rate = " + ccyRate);
                    // печатает время выполнения для каждой задачи
                }
                int randomNum = ThreadLocalRandom.current().nextInt(Properties.MIN_WAITING_TIME, Properties.MAX_WAITING_TIME + 1);
//                Thread.sleep(1000);
                Thread.sleep(randomNum);
            }
            System.out.println(ccyPairName + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
