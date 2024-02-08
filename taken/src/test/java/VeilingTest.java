
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class VeilingTest {

    private Veiling veiling;

    @BeforeEach
    void beforeEach(){
        veiling = new Veiling();
    }
    @Test
    void hoogsteBodVanNieuweVeilingIs0 () {
        assertThat(veiling.getHoogsteBod()).isZero();
    }

    @Test
    void nadatJeBodVan10UitvoertIsHoogsteBod10(){
        veiling.doeBod(BigDecimal.TEN);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }

    @Test
    void nadatJeBodVan10en2UitvoertIsHoogsteBod20() {
        veiling.doeBod(BigDecimal.TEN);
        veiling.doeBod(BigDecimal.TWO);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }
}
