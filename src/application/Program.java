package application;

import entities.Person;

public class Program {
    public static void main(String[] args) {
        
        Person person1 = new Person("Victor Hugo", 22, 2900.00);

        System.out.println(person1);

        System.out.println("End");
    }
}
