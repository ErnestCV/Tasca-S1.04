import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class StringLengthTest {

    @Test
    void stringHasLength8Test() {
        assertThat("Mordor", StringLengthMatcher.stringLength(is(8)));
    }


}


