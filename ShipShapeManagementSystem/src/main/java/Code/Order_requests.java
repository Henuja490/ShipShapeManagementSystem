/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Order_requests {
    private int OrderID;
    private String Customer;
    private String Employee_responsible;
    private String Date;
    private String Order_type;
    private String status;

    public Order_requests(int OrderID, String Customer, String Date, String Order_type, String status) {
        this.OrderID = OrderID;
        this.Customer = Customer;
        this.Date = Date;
        this.Order_type = Order_type;
        this.status = status;
    }

    public void setEmployee_responsible(String Employee_responsible) {
        this.Employee_responsible = Employee_responsible;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
