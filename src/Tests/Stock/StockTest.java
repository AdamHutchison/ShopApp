package Tests.Stock;

import Sku.Sku;
import Stock.Stock;
import Store.Store;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StockTest {


    @Test
    public void equalsTest(){

        Object input = new Object();
        Stock stockTestInstance = new Stock();
        boolean result = stockTestInstance.equals(input);
        assertEquals(false, result);
    }

    @Test
    public void hashCodeTest(){

        Stock stockTestInstance = new Stock();
        int input = stockTestInstance.hashCode();
        assertEquals(1,input);
    }

    @Test
    public void getSkusFromSourceFileAsStringTest() throws IOException {

        StringReader sampleFileData = new StringReader("Product code\tDescription\tPrice\nH57\tTin o Beans\t1.23");
        Stock stockTestInstance = new Stock();
        List input = stockTestInstance.getSkusFromSourceFileAsString(sampleFileData);
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("H57\tTin o Beans\t1.23");
        assertEquals(expectedOutput,input);
    }

    @Test
    public void updateSkuListTest() throws IOException {
        //create 3 Sku object
        Sku skuItem1 = new Sku();
        Sku skuItem2 = new Sku();
        Sku skuItem3 = new Sku();

        //create 3 new Sku objects from strings using createNewSku method
        Sku item1 = skuItem1.createNewSku("H57\tTin o Beans\t1.23");
        Sku item2 = skuItem2.createNewSku("C330\tFruity drink\t0.54");
        Sku item3 = skuItem3.createNewSku("BR7\tSliced loaf\t1.54");


        List<Sku> expectedSkuList = new ArrayList<>();
        expectedSkuList.add(item1);
        expectedSkuList.add(item2);
        expectedSkuList.add(item3);

        List<Sku> test = new ArrayList<>();
        test.addAll(expectedSkuList);

        StringReader sampleFileData = new StringReader("Product code\tDescription\tPrice\nH57\tTin o Beans\t1.23\nC330\tFruity drink\t0.54\nBR7\tSliced loaf\t1.54");

        Stock input = new Stock();
        input.updateSkuList(sampleFileData);

        assertEquals(test,Store.getInstance().skuList);
    }


}

