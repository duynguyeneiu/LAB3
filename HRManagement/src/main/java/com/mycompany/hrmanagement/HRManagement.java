/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hrmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class HRManagement {

    public ArrayList<FullTimeEmployee> fullTime= new ArrayList<>();
    public ArrayList<PartTimeEmployee> partTime;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int command;
        do {
            System.out.println("1. Add Full-time Employee \n"
                    + "2. Add Part-time Employee \n"
                    + "3. Show all Full-time Employee\n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id\n"
                    + "7. Delete Employee by Id\n"
                    + "8. Edit Employee information by Id\n"
                    + "9. Search Employee by payment\n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.\n"
                    + "11. Exit \n"
                    + "Enter a command number:");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;

            }
        } while (command != 11);
    }
    public static void AddFulltimeEmployee(ArrayList<FullTimeEmployee> fulltime){
        
        
    }
}
