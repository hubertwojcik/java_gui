package T01.T03_Patients;

public class ChoryNaGlowe extends Pacjent {
    ChoryNaGlowe(String name){
        super(name);
    }

    @Override
    public String choroba() {
        return "głowa";
    }

    @Override
    public String leczenie(){
        return "aspiryna";
    }
}
