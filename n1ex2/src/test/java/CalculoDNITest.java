import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.n1ex2.CalculoDNI;
import org.n1ex2.DNINoValidException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;



public class CalculoDNITest {

    @Test
    @DisplayName("Excepció amb num no vàlid")
    void error() {
        Exception exception = assertThrows(DNINoValidException.class, () -> CalculoDNI.calculDNI(3), "DNINoValidException expected");

        String expectedMessage = "El nombre ha de tenir 8 dígits";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    //Provem diferents dades amb Test Factory i Dynamic Test

    @TestFactory
    @DisplayName("Provem diferents nombres v1")
    Stream<DynamicTest> DNILletraMultipleVersio1() {

        //Referència: https://www.baeldung.com/junit5-dynamic-tests

        //Generem les dades a testejar
        HashMap<Integer, String> dnis = new HashMap<>();

        dnis.put(54915642, "Z");
        dnis.put(33770111, "Q");
        dnis.put(32428918, "E");
        dnis.put(57677982, "P");
        dnis.put(62802141, "C");
        dnis.put(46191445, "Q");
        dnis.put(80527308, "F");
        dnis.put(15836767, "W");
        dnis.put(69626007, "Q");
        dnis.put(54776642, "A");

        //Obtenim els números
        List<Integer> list = dnis.keySet().stream().toList();

        //Fem un iterador per provar tots els casos
        Iterator<Integer> inputGenerator = list.iterator();

        //Només fa un display de quin cas s'està testejant
        Function<Integer, String> displayNameGenerator = (input) -> "Comprovant: " + input;

        //Test execution code
        ThrowingConsumer<Integer> testExecutor = (input) -> {
            String lletra = dnis.get(input);
            assertEquals(lletra, CalculoDNI.calculDNI(input));
        };

        //Ho posem tot junt:
        return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor);

    }

    @TestFactory
    @DisplayName("Provem diferents nombres v2")
    Stream<DynamicTest> DNILletraMultipleVersio2() {

        //Fa el mateix que DNILletraMultipleVersio1 però amb un codi més net

        //Referència: https://www.baeldung.com/junit5-dynamic-tests

        //Generem les dades a testejar
        HashMap<Integer, String> dnis = new HashMap<>();

        dnis.put(54915642, "Z");
        dnis.put(33770111, "Q");
        dnis.put(32428918, "E");
        dnis.put(57677982, "P");
        dnis.put(62802141, "C");
        dnis.put(46191445, "Q");
        dnis.put(80527308, "F");
        dnis.put(15836767, "W");
        dnis.put(69626007, "Q");
        dnis.put(54776642, "A");

        //Obtenim els números
        List<Integer> listNum = dnis.keySet().stream().toList();

        //Obtenim les lletres
        List<String> listLletra = dnis.values().stream().toList();

        //Fem el test
        return listNum.stream()
                .map(num -> DynamicTest.dynamicTest("Comprovant: " + num, () -> {
                    String lletra = dnis.get(num);
                    assertEquals(lletra, CalculoDNI.calculDNI(num));
                }));

    }

    //Provem diferents dades amb un test parametritzat

    @ParameterizedTest
    @MethodSource("provideDataForTest")
    @DisplayName("Provem diferents nombres v3")
    void DNILletraMultipleVersio3(Integer num, String lletra) throws DNINoValidException{

        //https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests

        assertEquals(lletra, CalculoDNI.calculDNI(num));

    }

    //Funció que proveeix el test parametritzat de dades
    private static Stream<Arguments> provideDataForTest() {

        return Stream.of(
                Arguments.of(54915642, "Z"),
                Arguments.of(33770111, "Q"),
                Arguments.of(32428918, "E"),
                Arguments.of(57677982, "P"),
                Arguments.of(62802141, "C"),
                Arguments.of(46191445, "Q"),
                Arguments.of(80527308, "F"),
                Arguments.of(15836767, "W"),
                Arguments.of(69626007, "Q"),
                Arguments.of(54776642, "A")
        );
    }




}
