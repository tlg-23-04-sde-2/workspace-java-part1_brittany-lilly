package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //INSTANCE VARIABLES/FIELDS:
    private double rate;
    private double hours;


    //CONSTRUCTORS:
    public HourlyEmployee() {
        super();    //this line is redundant but suggested for training (remembering) -e.g. constructor chaining.
    }
    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);   //delegate to superclass constructor for name/hire date
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {  //4 argument constructor
        this(name, hireDate);   //delegate to 'neighboring' ctor above for name/hire date
        setRate(rate);           //delegate to setters for any validation/conversion
        setHours(hours);         //delegate to setters for any validation/conversion
    }
    // BUSINESS/ACTION METHODS:
    public void pay() {
        System.out.println(getName() + "is paid hourly at rate: " + getRate());
        System.out.println("Payment=" + getRate()*getHours());
    }


    //ACCESS METHODS:
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    //ToSTRING:
    @Override
    public String toString() {
//        return "HourlyEmployee: name= " + getName() + ", hireDate= " + getHireDate()
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}