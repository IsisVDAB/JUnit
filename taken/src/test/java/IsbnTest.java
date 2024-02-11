import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class IsbnTest {

    @Test
    void nummer0isVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(0));
    }

    @Test
    void negatiefNummerIsVerkeerd(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(-9789027439642L));
    }

    @Test
    void nummerMet12CijfersIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(()-> new Isbn(978902743964L));
    }

    @Test
    void deEerste3CijfersMoeten978of979Zijn() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(9779227439643L));
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal2() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(8789027439642L));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal2() {
        new Isbn(9789027439642L);
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal3() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(9789027439643L));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal0() {
        new Isbn(9789227439640L);
    }
    @Test
    void toStringMoetHetNummerTeruggeven() {
        assertThat(new Isbn(9789227439640L)).hasToString("9789227439640");
    }
}
