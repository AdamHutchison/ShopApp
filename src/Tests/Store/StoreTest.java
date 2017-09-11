package Tests.Store;
import Store.Store;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class StoreTest {

    @Test
    public void equalsTest(){

        Object input = new Object();
        boolean result = Store.getInstance().equals(input);
        assertEquals(false, result);
    }

    @Test
    public void hashCodeTest(){

        int input = Store.getInstance().hashCode();
        assertEquals(1,input);
    }
}
