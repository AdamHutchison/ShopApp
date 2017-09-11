package Stock;

import Sku.Sku;
import Store.Store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Stock {


    @Override
    public boolean equals(Object obj){
        return false;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    @Override
    public String toString(){
        return "toString has been overridden!";
    }

    public void updateSkuList(Reader sourceFile) throws IOException {

        ArrayList<String> skusAsStringList = getSkusFromSourceFileAsString(sourceFile);
        for (String skuString: skusAsStringList) {
            Sku newSkuObject = new Sku();
            Store.getInstance().skuList.add(newSkuObject.createNewSku(skuString));
        }

    }

    public ArrayList<String> getSkusFromSourceFileAsString(Reader sourceFile) throws IOException {

        ArrayList<String> listOfSkusAsStings = new ArrayList<>();

        BufferedReader readSourceFile = new BufferedReader(sourceFile);
        String thisLine = null;
        while((thisLine = readSourceFile.readLine()) != null){
            listOfSkusAsStings.add(thisLine);
        }
        listOfSkusAsStings.remove(0);
        return listOfSkusAsStings;
    }

}
