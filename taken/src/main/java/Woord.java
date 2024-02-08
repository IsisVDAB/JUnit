public class Woord {
    private final String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    boolean isPalindroom (){
        var omgekeerd = new StringBuilder(woord).reverse().toString();
        return woord.equals(omgekeerd);
    }
}
