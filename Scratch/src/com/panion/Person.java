package com.panion;

import java.time.LocalDate;
import java.time.Period;

//TODO: i have pictures that look like htey match Jays screen perfectly, but my code stopped working after
// i added getAge sout. Why? --fix!!

//an immutable class(misnomer); a class definition written in such a way that instances of it (person objects),
// once created, can't have their properties changed.  In this code, that simply means no public setters.
//string, bubble/wrapper objects are also immutable, datetime classes,
class Person {
    private final String name;
    private final LocalDate birthDate;
    private final int age;

    public Person(String name, LocalDate birthDate, int age) {
    this.name = name;
    this.birthDate = birthDate;
    this.age = age;
    }
// CONSTRUCTORS: start here
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("Person: name=%s, birthDate=%s\n", getName(), getBirthDate());
//        System.out.println("Done");

    }
}