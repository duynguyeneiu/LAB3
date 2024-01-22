/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
private int workingHour;
private float payRate;

    public PartTimeEmployee() {
       
    }

    public PartTimeEmployee(int workingHour, float payRate, String id, String name, int yearBirth, String address, String phone) {
        super(id, name, yearBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    @Override
    public void GetInfor() {
         System.out.println(getId()+"-"+getName()+"- Birth:"+getYearBirth()+"-Address:"+getAddress()+"-Phone:"+getPhone()+"-Working Hour:"+workingHour+"-Pay Rate:"+payRate);
    }

    @Override
    public float GetPayment() {
        return payRate*workingHour;
    }
    
}
