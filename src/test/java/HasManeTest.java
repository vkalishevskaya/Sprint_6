
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HasManeTest {



    private final String lionSex;
    private final boolean expected;

    public HasManeTest(String lionSex, boolean hasMane) {

        this.lionSex = lionSex;
        this.expected = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] lionSex(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

        @Test
        public void doesHaveMane() throws Exception  {
            Lion lion = new Lion(lionSex);
            boolean hasMane = lion.doesHaveMane();
            assertEquals(expected, hasMane);

        }
    }
