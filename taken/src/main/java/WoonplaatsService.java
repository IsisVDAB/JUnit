public class WoonplaatsService {
    private final WoonplaatsRepository repository;

    public WoonplaatsService(WoonplaatsRepository repository) {
        this.repository = repository;
    }

    long maxAantalStreepjesInEenWoonplaats(){
        return repository.findMetStreepjes()
                .stream()
                .map(woonplaats -> woonplaats.chars().filter(eenChar -> eenChar == '-').count())
                .max(Long::compare)
                .orElse(0L);
    }
}
