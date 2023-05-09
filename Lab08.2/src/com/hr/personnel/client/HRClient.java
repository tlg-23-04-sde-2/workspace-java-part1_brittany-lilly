/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

import javax.sound.midi.Soundbank;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1750.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 45.0, 20.0));
        dept.addEmployee(new SalariedEmployee("Logan", LocalDate.of(2012, 12, 12), 1250.0));
        dept.addEmployee(new HourlyEmployee("Amelia", LocalDate.of(2009,9,9), 25.0, 20.0));
        dept.addEmployee(new Executive("Jay", LocalDate.of(2022, 2, 2), 250_000.00));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay all Employees
        System.out.println("\nPay all employees");
        dept.payEmployees();

        //forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}