/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    //INSTANCE VARIABLES/FIELDS:
    private String name;
    private String location;
    private final Employee[] employees = new Employee[100];    //this is a has-a, collection in english/array
    private int currentIndex = 0;  // for dealing with the array

    //CONSTRUCTORS:
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    //BUSINESS/ACTION METHODS:
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);        // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }
    //TODO: fix red pay -- can't be resolved in 'employee.j'
    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }
    //"forced holiday break" f/hrly, 'takeVacation' f/salaried
    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            // if employees @ i = salaried, downcast emp ref to salaried emp --MUST verify type b4 downcast
            if (employees[i] instanceof SalariedEmployee) {  //getclass would also work
                SalariedEmployee semp = (SalariedEmployee) employees[i]; //this is downcasting
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {  //emp is a REFERENCE to an object--why we can addEmployee for salary& Hrly
        employees[currentIndex++] = emp;
    }

    //ACCESS METHODS:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //ToSTRING:
    //I don't have to say @Overriding bc the one in 'object' (HR Client/"Seattle") itself is inherently called
    @Override
    public String toString() {
//        return "Department: name=" + getName() + ", location=" + getLocation();
        return getClass().getSimpleName() + ", name=" + ", location=" + getLocation();
    }
}