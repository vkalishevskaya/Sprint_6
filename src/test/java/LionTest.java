
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

    public void doesHaveMane() throws Exception {

        Lion lion = new Lion("Самец");

        boolean mane = lion.doesHaveMane();
        assertEquals(true, mane);

    }
    @Test
    public void doesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка");

        boolean mane = lion.doesHaveMane();
        assertEquals(false, mane);

    }
    /* @Test
    public void doesMane() throws Exception {
        Lion lion = new Lion("Используйте допустимые значения пола животного - самец или самка");

        boolean mane = lion.doesHaveMane();
        assertEquals(false, mane);

    }*/

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline, predator);

        String getFood = lion.getFood().toString();
        assertEquals("[Животные, Птицы, Рыба]", getFood);
    }

}
