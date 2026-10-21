package ua.opnu;

public class Lecturer extends Person{
    private String department;
    private double salary;

    public Lecturer(String lastName, String firstName, int age, String department, double salary){
        super(lastName, firstName, age);
        this.department = department;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return String.format("Викладач кафедри %s, %s %s, вік: %d. Зарплатня: %.2f", department, getLastName(), getFirstName(), getAge(), salary);
    }
}
