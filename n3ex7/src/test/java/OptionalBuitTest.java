import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalBuitTest {

    @Test
    void verificaOptionalBuit() {

        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();

    }

    @Test
    void verificaOptionalNoBuit() {

        String nom = "Ernest";

        Optional<String> optional = Optional.of(nom);
        assertThat(optional).isNotEmpty();

    }

}
