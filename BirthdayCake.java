package chapter9;

public class BirthdayCake extends Cake{

    private String candles;

    public String getCandles() {
        return candles;
    }

    public BirthdayCake(String flavor, double price, String candles) {
        super(flavor, price);
        this.candles = candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }


}
