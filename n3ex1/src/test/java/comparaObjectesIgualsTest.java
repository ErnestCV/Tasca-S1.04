import static org.assertj.core.api.Assertions.*;

import org.n3ex1.Persona;
import org.n3ex1.PersonaEquals;
import org.testng.annotations.Test;

public class comparaObjectesIgualsTest {

    @Test
    void equalStrings() {
        assertThat("red").isEqualTo("red");
    }

    @Test
    void differentStrings() {
        assertThat("red").isNotEqualTo("green");
    }

    @Test
    void comparePersonesDiferents() {
        Persona p1 = new Persona("Joan", 23);
        Persona p2 = new Persona("Marta", 34);

        assertThat(p1).usingRecursiveComparison().isNotEqualTo(p2);

    }

    @Test
    void comparePersonesIguals() {
        Persona p1 = new Persona("Joan", 23);
        Persona p2 = new Persona("Joan", 23);

        //assertThat(p1).isEqualTo(p2); //Falla perquè compara referències d'objectes i no tenim equals @Override
        assertThat(p1).usingRecursiveComparison().isEqualTo(p2); //No cal implementar res

        //El mètode anterior fa servir la implementació custom d'equals, si existeix
        //https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#field-by-field-recursive
    }

    @Test
    void comparePersonesIgualsEqualsOverride() {
        PersonaEquals p1 = new PersonaEquals("Joan", 23);
        PersonaEquals p2 = new PersonaEquals("Joan", 23);

        assertThat(p1).isEqualTo(p2); //No falla perquè hem implementat equals a la classe
        assertThat(p1).usingRecursiveComparison().isEqualTo(p2); //No cal implementar res

        //El mètode anterior fa servir la implementació custom d'equals, si existeix
        //https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#field-by-field-recursive
    }

}
