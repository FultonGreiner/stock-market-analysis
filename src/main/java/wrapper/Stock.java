package wrapper;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public class Stock {
    private String ticker;
    private String name;
    BigDecimal lastTradePrice; // "current price"
    BigDecimal bid;
    BigDecimal ask;


}
