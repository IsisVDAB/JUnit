import java.util.Objects;

public class Rechthoek {
    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        if (lengte < 1 || breedte < 1 || lengte < breedte){
            throw new IllegalArgumentException();
        }
        this.lengte = lengte;
        this.breedte = breedte;
    }

    int getOppervlakte (){
        return lengte * breedte;
    }

    int getOmtrek(){
        return (lengte + breedte) * 2;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Rechthoek andereRechthoek &&
                lengte == andereRechthoek.lengte && breedte == andereRechthoek.breedte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengte, breedte);
    }
}

