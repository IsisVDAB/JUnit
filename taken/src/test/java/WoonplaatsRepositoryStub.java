import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class WoonplaatsRepositoryStub extends WoonplaatsRepository{

    @Override
    List<String> findMetStreepjes() {
        return List.of("Sint-Niklaas", "Sint-Ama-nds-berg", "Sint-Katelijne");
    }
}
