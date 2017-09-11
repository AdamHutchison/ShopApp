package Store;
import Sku.Sku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Store {

    private static Store uniqueInstance;
    public ArrayList<Sku> skuList = new ArrayList<>();

    private Store(){}

    public static Store getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Store();
        }
        return uniqueInstance;
    }

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

    }


