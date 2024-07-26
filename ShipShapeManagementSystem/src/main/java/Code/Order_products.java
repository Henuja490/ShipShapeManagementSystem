/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Order_products {
    private int OrderID;
    private String Customer;
    private String product[];
    private String Date;
    private String status;

    public Order_products(int OrderID, String Customer, String[] product, String Date) {
        this.OrderID = OrderID;
        this.Customer = Customer;
        this.product = product;
        this.Date = Date;
        status = "Preparing";
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
    
}
