/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Supplier {
    private int Sup_no;
    private String Sup_name;
    private String Sup_product;
    private String password;

    public Supplier(int Sup_no, String Sup_name, String Sup_product, String password) {
        this.Sup_no = Sup_no;
        this.Sup_name = Sup_name;
        this.Sup_product = Sup_product;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSup_name() {
        return Sup_name;
    }

    public String getSup_product() {
        return Sup_product;
    }
    
    
}
