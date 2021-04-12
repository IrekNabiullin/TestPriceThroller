public class PriceThrottler implements PriceProcessor {
    private static final int MAX_CURRENCY_PAIRS = 200;
    private static final int UPDATE_TIME_FOR_SKIP_CCY_PAIR = 1000;

    @Override
    public void onPrice(String ccyPair, double rate) {

    }

    @Override
    public void subscribe(PriceProcessor priceProcessor) {

    }

    @Override
    public void unsubscribe(PriceProcessor priceProcessor) {

    }
}
