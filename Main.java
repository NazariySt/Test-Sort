package TaskSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        Set<Person> listPersons = new TreeSet<>(personComparator);
        listPersons.add(new Person(6));
        listPersons.add(new Person(7));
        listPersons.add(new Person(2));
        listPersons.add(new Person(8));
        listPersons.add(new Person(1));
        for (Person person : listPersons) {
            System.out.println(person);
        }
        Person person = new Person(10);
        Person person1 = new Person(6);
        Person person2= new Person(4);
        Person person3 = new Person(11);

        List<Person> secondSet = new ArrayList<>();

        secondSet.add(person);
        secondSet.add(person1);
        secondSet.add(person2);
        secondSet.add(person3);
        Random random = new Random();
        System.out.println();
        for (Person personN :secondSet){
            System.out.println(personN);
        }
        }
    }



