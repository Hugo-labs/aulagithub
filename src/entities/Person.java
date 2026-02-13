package entities;

public class Person {
    
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ")
        .append(name)
        .append(", You're ")
        .append(age)
        .append(" years old and your salary is $ ")
        .append(String.format("%.2f", salary));

        return sb.toString();
    }


}
