import java.util.ArrayList;
import java.util.List;

public class Persoon {
    private final List<String> voornamen = new ArrayList<>();

    void add (String voornaam){
        if (voornamen.contains(voornaam)){
            throw new IllegalArgumentException("Voornaam is reeds toegevoegd.");
        } else if (voornaam.isBlank()){
            throw new IllegalArgumentException("Voornaam mag niet leeg zijn.");
        }
        voornamen.add(voornaam);
    }

    @Override
    public String toString() {
        return String.join(" ", voornamen);
    }
}
