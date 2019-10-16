package TaskSort;

public class Person {
    public int getAge() {
        return age;
    }

    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
