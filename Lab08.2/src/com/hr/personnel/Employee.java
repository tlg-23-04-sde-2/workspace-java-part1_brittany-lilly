/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
//public abstract class Employee {   //Jay made this work & is in lab TODO. What am i missing? another abstract@Pay
    public class Employee {
//INSTANCE VARIABLES/FIELDS:
    private String name;
    private LocalDate hireDate;

    //CONSTRUCTORS:
    public Employee() {
    }

    public Employee(String name, LocalDate hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    //BUSINESS/ACTION METHODS:
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }
    //We declare all employees get paid, but can't implement it here. Subclasses have the information.
//    public abstract void pay() {  //Jay made this work. I am supposed to have abstract TODO: figure it out
//    }
    public void pay() {
    }

    //ACCESS METHODS:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    //ToSTRING:
    @Override
    public String toString() {
//        return "Employee: name=" + getName() + ", hireDate=" + getHireDate();
        return getClass().getSimpleName() + " name=" + getName() + ", hireDate=" + getHireDate();
    }
}