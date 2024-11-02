package T01.T01_Bank;

public class Person {
    private String name;

    Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
