/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FullTimeEmployee extends Employee {
    private float salary;

    public FullTimeEmployee() {
  
    }

    public FullTimeEmployee(float salary, String id, String name, int yearBirth, String address, String phone) {
        super(id, name, yearBirth, address, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public void InputEmployee(){
        super.InputEmployee();
        Scanner sc=new Scanner(System.in);
        salary=sc.nextFloat();
    }
    @Override
    public void GetInfor() {
        System.out.println(getId()+"-"+getName()+"- Birth:"+getYearBirth()+"-Address:"+getAddress()+"-Phone:"+getPhone()+"-Salary:"+salary);
    }

    @Override
    public float GetPayment() {
     return salary;
    }
    
}
