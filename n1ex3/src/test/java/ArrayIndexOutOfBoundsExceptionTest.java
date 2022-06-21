import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.n1ex3.ExceptionProvider;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    @DisplayName("Comprovant ArrayIndexOutOfBoundsException")
    void testArrayIndexOutOfBoundsException() {
        int[] array = {0, 1};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> ExceptionProvider.provideException(array),
                "ArrayIndexOutOfBoundsException expected");

        assertEquals("Index 2 out of bounds for length 2", exception.getMessage());
    }
}
