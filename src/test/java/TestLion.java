import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThrows;

public class TestLion {

    @Test
    public void testGetKittens() throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, lion.getFood());
    }

    @Test
    public void testDoesHaveManeException() throws Exception {

        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("test", feline);
        });

        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        Assert.assertEquals(expectedMessage, exception.getMessage());
    }
}
