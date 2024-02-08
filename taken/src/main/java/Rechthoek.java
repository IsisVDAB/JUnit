public class Rechthoek {
    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    int getOppervlakte (){
        return lengte * breedte;
    }

    int getOmtrek(){
        return (lengte + breedte) * 2;
    }
}