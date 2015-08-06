/**
 * Created by sebastianhaas on 05.08.15.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {
    public static double roundAmount(double number) {
        BigDecimal amount = new BigDecimal(number);
        for (int i = amount.scale(); i >= 2; i--) {
            amount = amount.setScale(i, RoundingMode.HALF_UP);
        }
        return amount.doubleValue();
    }
}
