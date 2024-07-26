/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Product {
    private int productID;
    private String productName;
    private String product_supplier;
    private int Stock;

    public Product(int productID, String productName, String product_supplier, int Stock) {
        this.productID = productID;
        this.productName = productName;
        this.product_supplier = product_supplier;
        this.Stock = Stock;
    }

    public String getProductName() {
        return productName;
    }

    public String getProduct_supplier() {
        return product_supplier;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    
}
