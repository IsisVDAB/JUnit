import static java.lang.Character.*;

public class Paswoord {
    private String waarde;

    public Paswoord(String waarde) {
        if (checkPaswoord(waarde))
            this.waarde = waarde;
    }

    String getPuntjes() {
        return ".".repeat(waarde.length());
    }

    boolean komtOvereenMet(String paswoord) {
        return this.waarde.equals(paswoord);
    }

    boolean checkPaswoord(String waarde) {
        if (waarde.length() >= 8) {
            if (bevatKleineLetter(waarde)) {
                if (bevatGroteLetter(waarde)) {
                    if (bevatCijfer(waarde)){
                        return true;
                    } else {
                        throw new IllegalArgumentException("Paswoord moet grote letter bevatten");
                    }
                } else {
                    throw new IllegalArgumentException("Paswoord moet grote letter bevatten");
                }
            } else {
                throw new IllegalArgumentException("Paswoord moet kleine letter bevatten");
            }
        } else {
            throw new IllegalArgumentException("Paswoord moet 8 tekens lang zijn");
        }
    }

    private boolean bevatKleineLetter(String waarde) {
        for (var index = 0; index < waarde.length(); index++) {
            if (isLowerCase(waarde.charAt(index))) {
                return true;
            }
        }
        return false;
    }

    private boolean bevatGroteLetter(String waarde) {
        for (var index = 0; index < waarde.length(); index++) {
            if (isUpperCase(waarde.charAt(index))) {
                return true;
            }
        }
        return false;
    }

    private boolean bevatCijfer(String waarde) {
        for (var index = 0; index < waarde.length(); index++) {
            if (isUpperCase(waarde.charAt(index))) {
                return true;
            }
        }
        return false;
    }
}
