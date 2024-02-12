import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) public class WoonplaatsServiceTest {
    private WoonplaatsService service;
    @Mock
    private WoonplaatsRepository repository;

    @BeforeEach
    void beforeEach(){
        service = new WoonplaatsService(repository);
    }

    @Test
    void eenWoonplaatsBevatMaximaal3Streepjes(){
        when(repository.findMetStreepjes()).thenReturn(
                List.of("Sint-Niklaas", "Sint-Ama-nds-berg", "Sint-Katelijne"));
        assertThat(service.maxAantalStreepjesInEenWoonplaats()).isEqualTo(3L);
        verify(repository).findMetStreepjes();
    }
}
