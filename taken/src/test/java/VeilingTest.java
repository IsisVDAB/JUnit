
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class VeilingTest {
    @Test
    void hoogsteBodVanNieuweVeilingIs0 () {
        assertThat(new Veiling().getHoogsteBod()).isZero();
    }

    @Test
    void nadatJeBodVan10UitvoertIsHoogsteBod10(){
        var veiling = new Veiling();
        veiling.doeBod(BigDecimal.TEN);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }

    @Test
    void nadatJeBodVan10en2UitvoertIsHoogsteBod20() {
        var veiling = new Veiling();
        veiling.doeBod(BigDecimal.TEN);
        veiling.doeBod(BigDecimal.TWO);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }
}
