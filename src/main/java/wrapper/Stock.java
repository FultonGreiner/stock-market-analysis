package wrapper;

import java.math.BigDecimal;

public class Stock {
    private String ticker;
    private String name;
    BigDecimal lastTradePrice; // "current price"
    BigDecimal bid;
    BigDecimal ask;

    public Stock() {
        // default constructor
    }

    public Stock(String ticker) {
        this.ticker = ticker;
    }
}
