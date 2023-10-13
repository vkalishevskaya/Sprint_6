import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.*;

public class FelineTest {

    @Test

    public void eatMeat() throws Exception {
        Feline feline = new Feline();

        String eatMeat = feline.eatMeat().toString();
        assertEquals("[Животные, Птицы, Рыба]", eatMeat);
    }

    @Test
    public void getFamily(){
        Feline feline = new Feline();

        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }
    @Test
    public void getKittens(){
        Feline feline = new Feline();

        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }



}