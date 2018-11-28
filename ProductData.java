/*
ProductData.java

Design and Code a class for a generic product.

By Nathan Betz
*/

public class ProductData {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        System.out.println("Product Code: " + laptop.getProductCode());
        System.out.println("Description: " + laptop.getDescription());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Product Count: " + laptop.getProductCount());
         
        }

    }

}


public class Laptop {

    private Code ProductCode;
    private Description Description;
    private Price Price;
    private Count ProductCount;
