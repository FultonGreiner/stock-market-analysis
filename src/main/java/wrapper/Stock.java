package wrapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@AllArgsConstructor
public class Stock {
    /** The ticker (symbol) of this stock. */
    @Getter @Setter private String ticker;
    /** The full name of this stock. */
    @Getter @Setter private String name;
    /** The last traded price of this stock. */
    @Getter @Setter private BigDecimal lastTradePrice;
    /** The highest price a buyer will pay to buy a share of this stock. */
    @Getter @Setter private BigDecimal bid;
    /** The lowest price at which a seller will sell a share of this stock. */
    @Getter @Setter private BigDecimal ask;
}
