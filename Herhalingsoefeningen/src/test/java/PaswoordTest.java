import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class PaswoordTest {
    private Paswoord paswoord;

    @Test
    void nullWaardeKanNiet() {
        assertThatNullPointerException().isThrownBy(() -> new Paswoord(null));
    }

    @Test
    void b4lleKesIsCorrect() {
        new Paswoord("b4lleKes");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcdef", "123456", "ABCDE5", "abcdef9", "abcd"})
    void verkeerPaswoord(String string){
        assertThatIllegalArgumentException().isThrownBy(() -> new Paswoord(string));
    }

    @Test
    void evenveelPuntjesAlsHetPaswoord() {
        assertThat(new Paswoord("Abcd3Fee").getPuntjes()).isEqualTo("........");
    }

    @Test
    void paswoordKomtOvereenMetZichzelf() {
        var string = "Abcd3Fee";
        assertThat(new Paswoord(string).komtOvereenMet(string)).isTrue();
    }
}
