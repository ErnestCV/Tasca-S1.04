import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapKeyTest {

    @Test
    void mapaConteKey() {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "boop");
        mapa.put(2, "beep");

        assertThat(mapa).containsKey(1);

    }

}
