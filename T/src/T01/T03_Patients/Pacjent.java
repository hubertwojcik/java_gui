package T01.T03_Patients;

public abstract class Pacjent {
    private String nazwisko;
    Pacjent(String nazwisko){
        this.nazwisko=nazwisko;
    }

    public String nazwisko(){
        return nazwisko;
    }

    public abstract String leczenie();
    public abstract String choroba();
}
