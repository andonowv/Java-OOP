package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (age < 30){
           salary =  salary +  salary * bonus / 100 / 2;
        }else {
            salary = salary * bonus / 100 + salary;
        }
    }

    @Override
    public String toString() {
        //Asen Ivanov gets 2640.0 leva
        return this.firstName + " " + this.lastName + " gets " + this.salary + " leva";
    }
}
