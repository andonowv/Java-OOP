package FirstAndReserveTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        //Asen Harizanoov is 44 years old.
        return this.firstName + " " + this.lastName + " is " + this.age + " years old.";
    }
}
