public class Properties {
    //нижняя граница для Random на время которого поток засыпает. Default = 1000ms
    public static final int MIN_WAITING_TIME = 1;
    //верхнаая граница для Random на время которого поток засыпает. Default = 1000ms
    public static final int MAX_WAITING_TIME = 1000;
    //количество одновременно работающих поток из пула потоков
    public static final int QUANTITY_OF_PAIRS = 3;
    public static final int TIMES_TO_REPEAT = 5;   // время повторения задачи
    public static final int MAX_CURRENCY_PAIRS = 200; //максимальное количество пар
    public static final int UPDATE_TIME_FOR_SKIP_CCY_PAIR = 1000;
}
