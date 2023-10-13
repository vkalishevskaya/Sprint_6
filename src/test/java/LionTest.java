
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
// не понимаю, как реализовать второй RunWith для параметризированного теста

public class LionTest {
    @Spy
    protected Feline feline;
    @Spy
    Predator predator;


    @Test
    public void getKittens() {
        Lion lion = new Lion(feline, predator);

        int kittens = lion.getKittens();
        assertEquals(1, kittens);
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline, predator);

        String getFood = lion.getFood().toString();
        assertEquals("[Животные, Птицы, Рыба]", getFood);
    }

    @Test
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion("Лев"));
    }
}
