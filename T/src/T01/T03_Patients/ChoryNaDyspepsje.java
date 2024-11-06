package T01.T03_Patients;


public class ChoryNaDyspepsje extends Pacjent {
    ChoryNaDyspepsje(String name){
        super(name);
    }

    @Override
    public String choroba() {
        return "dyspepsja";
    }

    @Override
    public String leczenie(){
        return "węgiel";
    }
}
