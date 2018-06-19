package be.vdab;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {


        Map<String, Person> map = new HashMap<>();

        Person p = new Person("Jimi", "Hendrix", 27);

        map.put("cool", p);
        map.put("great", new Person("Janis", "Hendrix", 27));
        map.put("sweet", new Person("Amy", "Hendrix", 27));


        Person cool = map.get("cool");


    }
}

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person that) {
        int stage1 = this.firstName.compareTo(that.firstName);
        if(stage1 == 0) {
            return this.lastName.compareTo(that.lastName);
        } else {
            return stage1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}