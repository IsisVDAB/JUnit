import java.time.LocalDate;

public class Periode {
    private final LocalDate van;
    private final LocalDate tot;

    public Periode(LocalDate van, LocalDate tot) {
        if (tot.isBefore(van)){
            throw new IllegalArgumentException();
        }
        this.van = van;
        this.tot = tot;
    }

    boolean komtNa(Periode periode){
        return van.isAfter(periode.tot);
    }

    boolean overlaptMet(Periode periode){
        return tot.compareTo(periode.van) >= 0 && van.compareTo(periode.tot) <=0;
    }
}
