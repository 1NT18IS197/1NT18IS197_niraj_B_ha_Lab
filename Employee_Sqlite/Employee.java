package com.example.employeesqlite;

public class Employee {
    private String empName;
    private String empDesig;
    private int empSalary;
    private String empPhone;
    private String empMail;
    public Employee(){

    }

    public Employee(String empName,String empDesig, int empSalary, String empPhone, String empMail){
        this.empName = empName;
        this.empDesig = empDesig;
        this.empSalary = empSalary;
        this.empPhone = empPhone;
        this.empMail = empMail;
    }
    public String getEmpName(){
        return empName;
    }
    public String getEmpDesig(){
        return empDesig;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesig(String empDesig) {
        this.empDesig = empDesig;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

}
