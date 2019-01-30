package com.company;

public class Person
{
    String firstName, lastName;

    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        String fullName = lastName + ", " + firstName;
        return fullName;
    }
}
