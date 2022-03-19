package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException ("Age cannot be zero or negative integer");
        }else {
            this.age = age;
        }
    }
    public void setFirstName(String firstName){
        if (firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        if (lastName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }
    public void setSalary(double salary){
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
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
