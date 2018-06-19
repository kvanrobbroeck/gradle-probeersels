package be.vdab.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Janis", "Joplin", 27));
        people.add(new Person("Jimi", "Hendrix", 27));
        people.add(new Person("Kurt", "Cobain", 27));

        people.removeIf(p -> !p.getFirstName().startsWith("J"));

        // Using ANONYMOUS INNER CLASS
        Comparator<Person> c1 = new Comparator<Person>() {
            public int compare(Person a, Person b) {
                return a.getFirstName().compareTo(b.getFirstName());
            }
        };

        // Using LAMBDA (1)
        Comparator<Person> c2 = (Person a, Person b) -> {
            return a.getFirstName().compareTo(b.getFirstName());
        };

        // Using LAMBDA (2)
        Comparator<Person> c3 = (a, b) -> {
            return a.getFirstName().compareTo(b.getFirstName());
        };

        // Using LAMBDA (3)
        Comparator<Person> c4 = (a, b) -> a.getFirstName().compareTo(b.getFirstName());

        // Using LAMBDA (4)
        Comparator<Person> c5 = LambdaMain::blablayipperdepiep;

        people.sort(LambdaMain::blablayipperdepiep);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static int blablayipperdepiep(Person bla, Person bli) {
        return bla.getFirstName().compareTo(bli.getFirstName());
    }
}
