package Sku;

import java.math.BigDecimal;

public class Sku implements java.io.Serializable{

   private String productCode;
   private String description;
   private BigDecimal price;

    public void setProductCode(String instanceProductCode){
        productCode = instanceProductCode;
    }


    public void setDescription(String instanceDescription){
        description = instanceDescription;
    }


    public void setPrice(BigDecimal instancePrice){
        price = instancePrice;
    }

    public String getProductCode(){
        return productCode;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
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

    public Sku createNewSku(String productInfo){

       //parsing inputted string into string array
       String[] productInfoArray =  productInfo.split("\t+");

       //assigning relevant array values to variables to ensure that code is readable
       String instanceCode = productInfoArray[0];
       String instanceDescription = productInfoArray[1];
       BigDecimal instancePrice = new BigDecimal(productInfoArray[2]);
       this.setProductCode(instanceCode);
       this.setDescription(instanceDescription);
       this.setPrice(instancePrice);
       return this;
    }
}
