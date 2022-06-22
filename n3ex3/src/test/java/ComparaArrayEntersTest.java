import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ComparaArrayEntersTest {

    @Test
    void comparaArrayEnters() {

        int[] array1 = {0, 1, 2};
        int[] array2 = {0, 1, 2};

        assertThat(array1).isEqualTo(array2);

    }

}
