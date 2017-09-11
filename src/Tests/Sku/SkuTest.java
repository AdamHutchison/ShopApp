package Tests.Sku;

import Sku.Sku;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class SkuTest {

    private Sku skuTestInstance = new Sku();
    private String testProductInfo = "54321\tdescriptionTest\t12345.98";

    @Test
    public void equalsTest(){

        Object input = new Object();
        boolean result = skuTestInstance.equals(input);
        assertEquals(false, result);
    }

    @Test
    public void hashCodeTest(){

        int input = skuTestInstance.hashCode();
        assertEquals(1,input);
    }

    @Test
    public void newSkuClassReturnTest(){

        Sku input = skuTestInstance.createNewSku(testProductInfo);
        assertEquals(Sku.class,input.getClass());
    }

    @Test
    public void newSkuSetProductCodeTest(){

        Sku input = skuTestInstance.createNewSku(testProductInfo);
        assertEquals("54321",input.getProductCode());
    }

    @Test
    public void newSkuSetDescriptionTest(){

        Sku input = skuTestInstance.createNewSku(testProductInfo);
        assertEquals("descriptionTest",input.getDescription());
    }
    @Test
    public void CreateNewSkuSetPriceTest(){

        BigDecimal expected = new BigDecimal("12345.98");
        Sku input = skuTestInstance.createNewSku(testProductInfo);
        assertEquals(expected,input.getPrice());
    }
}