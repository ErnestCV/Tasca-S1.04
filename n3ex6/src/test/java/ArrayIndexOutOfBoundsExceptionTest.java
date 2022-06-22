import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.n3ex6.ExceptionProvider;

import java.util.Arrays;
import java.util.List;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    @DisplayName("Comprovant ArrayIndexOutOfBoundsException")
    void testArrayIndexOutOfBoundsException() {

        assertThatThrownBy(() -> {
            int[] array = {0, 1};
            ExceptionProvider.provideException(array);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class).hasMessageContaining("Index 2 out of bounds for length 2");

    }

    @Test
    @DisplayName("Comprovant ArrayIndexOutOfBoundsException2")
    void testArrayIndexOutOfBoundsException2() {

        assertThatThrownBy(() -> {
            List<String> list = Arrays.asList("a", "b");
            list.get(2);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class).hasMessageContaining("Index 2 out of bounds for length 2");

    }

    //Una altra manera
    @Test
    @DisplayName("Comprovant ArrayIndexOutOfBoundsException3")
    void testArrayIndexOutOfBoundsException3() {

        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {
            List<String> list = Arrays.asList("a", "b");
            list.get(2);
        }).withMessage("Index 2 out of bounds for length 2");

    }

    //Tb es poden separar: https://www.baeldung.com/assertj-exception-assertion

}