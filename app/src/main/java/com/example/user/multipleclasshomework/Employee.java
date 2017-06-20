package com.example.user.multipleclasshomework;

import java.util.IllegalFormatException;

/**
 * Created by user on 20/06/2017.
 */

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }



    public String getSsn() {
        return ssn;
    }

     public void raiseSalary(double salary) {
//         if (salary < 0) {
//             throw new IllegalFormatException("Negative salary not permitted!");
//         }
        this.salary = salary;
    }


//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }

//    public void setSsn(String ssn) {
//        this.ssn = ssn;
//    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

}