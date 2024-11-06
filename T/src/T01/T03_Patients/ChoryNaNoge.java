package T01.T03_Patients;

public class ChoryNaNoge extends Pacjent {
    ChoryNaNoge(String name){
        super(name);
    }

    @Override
    public String choroba() {
        return "noga";
    }

    @Override
    public String leczenie(){
        return "gips";
    }
}
