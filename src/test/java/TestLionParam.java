import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.fail;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestLionParam {

    @ParameterizedTest
    @MethodSource("isAdultTestData")
    public void isAdultForBoundaryValuesIsValid (String sex, boolean result) {

        Feline feline = new Feline();
        try {
            Lion lion = new Lion(sex, feline);
            Assertions.assertEquals(result, lion.doesHaveMane());
        } catch (Exception e) {
            // Если вы ожидаете, что исключение не должно быть выброшено, вы можете провалить тест
            Assertions.fail("Исключение было выброшено: " + e.getMessage());
        }
    }

    static Stream<Arguments> isAdultTestData() {
        return Stream.of(
                arguments("Самец", true),
                arguments("Самка", false)
        );
    }
}
