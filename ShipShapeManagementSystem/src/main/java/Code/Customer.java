/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Customer {
    private int cusNo;
    private String cus_name;
    private int []  OrderID;
    private String password;

    public Customer(int cusNo, String cus_name, String password) {
        this.cusNo = cusNo;
        this.cus_name = cus_name;
        this.password = password;
    }

    public void setOrderID(int[] OrderID) {
        this.OrderID = OrderID;
    }
    
    
}
