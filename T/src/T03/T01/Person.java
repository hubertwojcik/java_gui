package T03.T01;

import java.io.Serializable;

public class Person  implements Serializable {
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
