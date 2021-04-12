import java.util.concurrent.ThreadLocalRandom;

public class CcyPair {
    String ccyPair;
    double rate;
    public String getCcyPair(){
        StringBuffer ccyPair = new StringBuffer();
        int ccyRandomOne = ThreadLocalRandom.current().nextInt(0, 17);
        int ccyRandomTwo = 20;
        do{
            ccyRandomTwo = ThreadLocalRandom.current().nextInt(0, 17);
        } while (ccyRandomOne == ccyRandomTwo);

        ccyPair.append(Currency.values()[ccyRandomOne].toString());
        ccyPair.append(Currency.values()[ccyRandomTwo].toString());
        return ccyPair.toString();
    }

    public double getRate() {
        return ThreadLocalRandom.current().nextDouble(0, 300);
    }
}
