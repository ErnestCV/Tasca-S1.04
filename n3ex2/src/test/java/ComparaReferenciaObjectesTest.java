import static org.assertj.core.api.Assertions.*;

import org.n3ex2.Persona;
import org.junit.jupiter.api.Test;

public class ComparaReferenciaObjectesTest {

    @Test
    void comparaReferenciaIgual() {
        Persona p1 = new Persona("Joan", 23);
        Persona p2 = p1;

        //Podem comprovar que la referència és igual de vàries maneres:
        //assertThat(p1).isEqualTo(p2);
        assertThat(p2.equals(p1)).isTrue();
        //assertThat(p1 == p2).isTrue();
    }

    @Test
    void comparaReferenciaDiferent() {
        Persona p1 = new Persona("Joan", 23);
        Persona p2 = new Persona("Joan", 23);

        //assertThat(p1).isNotEqualTo(p2);
        assertThat(p2.equals(p1)).isFalse();
        //assertThat(p1 == p2).isFalse();
    }

}
