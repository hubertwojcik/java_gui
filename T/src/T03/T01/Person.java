package T03.T01;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private String dob;
    private String address;

    Person(String firstName,String lastName, String pesel, String dob, String address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.pesel=pesel;
        this.dob=dob;
        this.address=address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    };

    public String getPesel() {
        return pesel;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }
}
