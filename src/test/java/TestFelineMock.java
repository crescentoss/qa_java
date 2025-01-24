import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestFelineMock {

    @Mock
    Feline feline;

    @Test
    public void testGetFamily() {

        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }

    @Test
    public void testGetCallTimeFamily() {

        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
    }
}
