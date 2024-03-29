public class Jaar {
    private final int jaar;

    Jaar (int jaar){
        this.jaar = jaar;
    }

    boolean isSchrikkeljaar(){
/*        if (jaar % 400 == 0){
            return true;
        }
        if (jaar % 100 == 0){
            return false;
        }
        return jaar % 4 == 0;*/

        // REFACTORING:

        return jaar % 4 == 0 && jaar % 100 != 0 || jaar % 400 == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(jaar);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Jaar anderJaar && jaar == anderJaar.jaar;
    }

    @Override
    public int hashCode() {
        return jaar;
    }
}
