package GroupIdTask1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void reverseTest(){
        String normal = "Test 123";
        String reverse = "321 tseT";
        assertEquals(reverse,ReverseString.reverse(normal));
        //testendring
    }
}
