/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Employee {
    private int empNo;
    private String Emp_name;
    private String skill;
    private String workin;
    private boolean Emp_avalability;
    private String password;

    public Employee(int empNo, String skill, String workin,String Emp_name,String password) {
        this.empNo = empNo;
        this.skill = skill;
        this.workin = workin;
        this.Emp_name = Emp_name;
        this.password = password;
        Emp_avalability = true;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public String getSkill() {
        return skill;
    }

    public boolean isEmp_avalability() {
        return Emp_avalability;
    }

    public void setEmp_avalability(boolean Emp_avalability) {
        this.Emp_avalability = Emp_avalability;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
}
