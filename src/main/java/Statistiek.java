import java.math.BigDecimal;
import java.util.Arrays;

public class Statistiek {
    static BigDecimal getGemiddelde(BigDecimal[] getallen){
        if (getallen.length == 0){
            throw new IllegalArgumentException("Lege array");
        }
        return Arrays.stream(getallen)
                .reduce(BigDecimal.ZERO)
    }
}
