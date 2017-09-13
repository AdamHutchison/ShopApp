package Store;
import Sku.Sku;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static Store uniqueInstance;
    public List<Sku> skuList = new ArrayList<>();

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


