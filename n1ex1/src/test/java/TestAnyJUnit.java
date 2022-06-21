import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.n1ex1.Any;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnyJUnit {
    private static final Any any = new Any();

    @Test
    @DisplayName("La llista té 12 posicions")
    void testAny12Mesos() {
        assertEquals(12, any.getLlista().size());
    }

    @Test
    @DisplayName("La llista no és buida")
    void testAnyBuit() {
        assertFalse(any.getLlista().isEmpty());
    }

    @Test
    @DisplayName("El mes 8 es diu agost")
    void testAnyMes8Agost() {
        assertEquals("agost", any.getLlista().get(7));
    }
}
