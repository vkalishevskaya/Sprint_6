import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    protected Feline feline;



    @Test
    public void getSound() {
        Cat cat = new Cat(feline);

        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }
    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);

        String getFood = cat.getFood().toString();
        assertEquals("[Животные, Птицы, Рыба]", getFood);
    }
}