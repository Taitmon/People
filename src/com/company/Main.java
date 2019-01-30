package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Person person = new Person("Taitmon", "Lynch");
        System.out.println(person.getFullName(person.firstName, person.lastName));
    }
}
