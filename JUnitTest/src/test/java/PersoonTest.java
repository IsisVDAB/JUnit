import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class PersoonTest {

    private Persoon persoon;

    @BeforeEach
    void beforeEach(){
        persoon = new Persoon();
    }

    @Test
    void driesIsCorrect(){
        persoon.add("Dries");
    }

    @Test
    void nullWaardeKanNiet() {
        assertThatNullPointerException().isThrownBy(() -> persoon.add(null));
    }

    @Test
    void persoonKanNietDezelfdeVoornaamHebben() {
        persoon.add("Kim");
        assertThatIllegalArgumentException().isThrownBy(() -> persoon.add("Kim"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    void blancoVoornaamKanNiet(String string) {
        assertThatIllegalArgumentException().isThrownBy(() -> persoon.add(string));
    }

    @Test
    void toStringGeeftVoornamenInVolgordeTerugGescheidenDoorSpatie() {
        persoon.add("Kim");
        persoon.add("Tom");
        persoon.add("Pieter");
        assertThat(persoon).hasToString("Kim Tom Pieter");
    }
}
