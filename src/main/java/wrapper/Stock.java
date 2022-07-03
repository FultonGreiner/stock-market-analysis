package wrapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@AllArgsConstructor
public class Stock {
    @Getter @Setter private String ticker;
    @Getter @Setter private String name;
    @Getter @Setter private BigDecimal lastTradePrice;
    @Getter @Setter private BigDecimal bid;
    @Getter @Setter private BigDecimal ask;
}
