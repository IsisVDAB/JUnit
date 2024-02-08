import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    void eenInchIs2Komma54Centimeters(){
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE)).isEqualByComparingTo("2.54"); // Je mag verwachte waarde meegeven als String ipv BigDecimal.valueOf(2.54)
    }

    @Test
    void tweehonderdInchesIs508Centimeters(){
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.valueOf(2.54))).isEqualByComparingTo("508");
    }
}
