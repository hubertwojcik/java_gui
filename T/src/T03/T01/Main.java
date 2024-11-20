package T03.T01;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println(System.getProperty("user.dir"));
        Person person = getPersonData();

        System.out.println("Zapis binarny");
        try{
            binarySave(person);
            bufferedSave(person);

        }catch (IOException e){
            System.out.println("IO EXPCETION");
        }catch (Exception e ){
            System.out.println("Exception");
        }

    }

    public static Person getPersonData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter pesel: ");
        String pesel = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        String dob = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        Person person = new Person(firstName,lastName,pesel,dob,address);
        return person;
    }

    public static void binarySave(Person person) throws IOException{
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream(System.getProperty("user.dir")+"/src/T03/T01/binary_saved.txt");

            fos.write(person.getFirstName().getBytes());
            fos.write(System.lineSeparator().getBytes());
            fos.write(person.getLastName().getBytes());
            fos.write(System.lineSeparator().getBytes());
            fos.write(person.getPesel().getBytes());
            fos.write(System.lineSeparator().getBytes());
            fos.write(person.getDob().getBytes());
            fos.write(System.lineSeparator().getBytes());
            fos.write(person.getAddress().getBytes());

        }

        finally {
            if(fos != null){
                    fos.close();
            }
        }
    }

//    public Person binaryRead(){

//    }
    public static void bufferedSave(Person person) throws Exception{
        BufferedWriter br = null;
                try{
                    br = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/src/T03/T01/buffered_saved.txt"));
                    br.write(person.getFirstName());
                    br.newLine();
                    br.write(person.getLastName());
                    br.newLine();
                    br.write(person.getPesel());
                    br.newLine();
                    br.write(person.getDob());
                    br.newLine();
                    br.write(person.getAddress());
                    br.newLine();
                }finally {
                    if(br != null){
                        br.close();
                    }
                }
    }

}
