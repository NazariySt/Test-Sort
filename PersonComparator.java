package TaskSort;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        if (a.getAge() > b.getAge()) return 1;
        else if (a.getAge() < b.getAge()) return -1;
        else return 0;
    }
}
