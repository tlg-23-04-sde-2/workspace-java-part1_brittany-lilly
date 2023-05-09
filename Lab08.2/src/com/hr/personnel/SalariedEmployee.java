package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //INSTANCE VARIABLES/FIELDS:
    private double salary;

    //CONSTRUCTORS:
    public SalariedEmployee() {
        super();
        //above line is redundant but suggested for training (remembering) -e.g. constructor chaining.
    }    //super(); is already automatically called when i do not call any constructors for a class

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //pretend calling upon pretend method" enrollIn401k"
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {   //3 argument constructor
        this(name, hireDate);             //delegate to ctor above for name/hire date
        setSalary(salary);                 //delegate to setters for any validation/conversion

    }

    //BUSINESS/ACTION METHODS:
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());  //inherited getName from 'employee'
    }

    //ACCESSOR METHODS:
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //ToSTRING:                      // doing + for this lab, instead of %s, we will find out y later
    @Override     // I don't have to say this to do it, but Jay wants us to anyway
    public String toString() {       //overriding method in employee, if we don't write here, 'employee' toString runs
//        return "SalariedEmployee: name= " + getName() + ", hireDate= " + getHireDate() + ", salary= " + getSalary();
        return super.toString() + ", salary= " +getSalary();
    }

}