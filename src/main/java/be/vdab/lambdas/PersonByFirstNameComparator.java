package be.vdab.lambdas;

import java.util.Comparator;

public class PersonByFirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getFirstName().compareTo(b.getFirstName());
    }
}
