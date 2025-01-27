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
    public void testGetFamilyMock() {

        Mockito.when(feline.getFamily()).thenReturn("Птичьи");
        Assert.assertEquals("Птичьи", feline.getFamily());
    }

    @Test
    public void testGetKittensParamMock() {

        Mockito.when(feline.getKittens(2)).thenReturn(5);
        Assert.assertEquals(5, feline.getKittens(2));
    }
}
