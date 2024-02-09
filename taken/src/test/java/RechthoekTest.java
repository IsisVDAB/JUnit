import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RechthoekTest {

    @Test
    void oppervlakteVanEenRechthoekVan5Op3Is15(){
        assertThat(new Rechthoek(5, 3).getOppervlakte()).isEqualTo(15);
    }

    @Test
    void omtrekVanEenRechthoekVan5Op3Is16(){
        assertThat(new Rechthoek(5, 3).getOmtrek()).isEqualTo(16);
    }

    @Test
    void rechthoekenMetDezelfdeAfmetingenZijnGelijk() {
        assertThat(new Rechthoek(5, 3)).isEqualTo(new Rechthoek(5, 3));
    }
    @Test
    void rechthoekenMetVerschillendeAfmetingenZijnVerschillend() {
        assertThat(new Rechthoek(5, 3)).isNotEqualTo(new Rechthoek(5, 2));
    }
    @Test
    void rechthoekenMetDezelfdeAfmetingenGevenDezelfdeHashcode() {
        assertThat(new Rechthoek(5, 3)).hasSameHashCodeAs(new Rechthoek(5, 3));
    }
}
