package entities;

public class Person {
    
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ")
        .append(name)
        .append(", You're ")
        .append(age)
        .append(" years old");

        return sb.toString();
    }
}
