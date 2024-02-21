package Lesson_7.Exp002;

public class ParametrizedWorker<E> {
    private E id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public ParametrizedWorker(E id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
