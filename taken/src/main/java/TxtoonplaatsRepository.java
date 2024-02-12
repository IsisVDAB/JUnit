import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TxtoonplaatsRepository implements WoonplaatsRepository {

    @Override
    public List<String> findMetStreepjes(){
        try (var stream = Files.lines(Path.of("/data.woonplaatsen.txt"))) {
            return stream.filter(woonplaats -> woonplaats.contains("-")).toList();
        } catch (IOException ex) {
            throw new RepositoryException(ex);
        }
    }
}
