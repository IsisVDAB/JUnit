import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class WoordtellerTest {

    private Woordteller woordteller;
    @BeforeEach
    void beforeEach(){
        woordteller = new Woordteller();
    }

    @Test
    void eenNullWaardeKanNiet() {
        assertThatNullPointerException().isThrownBy(() -> woordteller.telWoorden(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", " ", ",", ",,,", " , ,, "})
    void bevat0Woorden(String tekst){
        assertThat(woordteller.telWoorden(tekst)).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"woord", " woord", "woord "})
    void bevat1Woord(String tekst) {
        assertThat(woordteller.telWoorden(tekst)).isOne();
    }

    @ParameterizedTest
    @ValueSource(strings = {"ik ook", "ik ook", "ik,ook", "ik, ook", "ik , ook"})
    void bevat2Woorden(String tekst) {
        assertThat(woordteller.telWoorden(tekst)).isEqualTo(2);
    }
}
