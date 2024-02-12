import java.util.StringTokenizer;

public class Woordteller {

    int telWoorden(String zin){
        return new StringTokenizer(zin, " ,").countTokens();
    }
}
