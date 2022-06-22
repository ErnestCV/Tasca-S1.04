import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.n3ex4.Persona;
import org.n3ex4.Cotxe;

import java.util.ArrayList;
import java.util.List;

public class OrdreObjectesTest {

    @Test
    void conteObjectesOrdreInsercio() {

        List<Object> llista = new ArrayList<>();

        Persona p1 = new Persona("Joan", 34);
        Persona p2 = new Persona("Marta", 27);
        Cotxe c1 = new Cotxe("Opel", 15000);
        Cotxe c2 = new Cotxe("Seat", 9000);

        llista.add(p1);
        llista.add(p2);
        llista.add(c1);
        llista.add(c2);

        assertThat(llista).containsSequence(p1, p2, c1, c2);

    }

    @Test
    void conteObjectesQualsevolOrdre() {

        List<Object> llista = new ArrayList<>();

        Persona p1 = new Persona("Joan", 34);
        Persona p2 = new Persona("Marta", 27);
        Cotxe c1 = new Cotxe("Opel", 15000);
        Cotxe c2 = new Cotxe("Seat", 9000);

        llista.add(p1);
        llista.add(p2);
        llista.add(c1);
        llista.add(c2);

        assertThat(llista).containsExactlyInAnyOrder(c2, p2, c1, p1);

    }

    @Test
    void objecteNomesAfegitUnaVegada() {

        List<Object> llista = new ArrayList<>();

        Persona p1 = new Persona("Joan", 34);
        Persona p2 = new Persona("Marta", 27);
        Cotxe c1 = new Cotxe("Opel", 15000);
        Cotxe c2 = new Cotxe("Seat", 9000);

        llista.add(p1);
        llista.add(p2);
        llista.add(c1);
        llista.add(c2);

        assertThat(llista).containsOnlyOnce(p1);

    }

    @Test
    void llistaNoConteElement() {

        List<Object> llista = new ArrayList<>();

        Persona p1 = new Persona("Joan", 34);
        Persona p2 = new Persona("Marta", 27);
        Cotxe c1 = new Cotxe("Opel", 15000);
        Cotxe c2 = new Cotxe("Seat", 9000);

        llista.add(p1);
        llista.add(p2);
        llista.add(c1);

        assertThat(llista).doesNotContain(c2);

    }

}
