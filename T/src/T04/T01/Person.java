package T04.T01;

public class Person {
    private String firstName;
    private String lastName;

    Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " "+lastName;
    }
}
