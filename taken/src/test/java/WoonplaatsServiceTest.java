import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class WoonplaatsServiceTest {
    private WoonplaatsService service;
    @BeforeEach
    void beforeEach(){
        service = new WoonplaatsService(new WoonplaatsRepository());
    }

    @Test
    void maxAantalStreepjesInEenWoonplaats(){
        assertThat(service.maxAantalStreepjesInEenWoonplaats()).isNotNegative();
    }
}
