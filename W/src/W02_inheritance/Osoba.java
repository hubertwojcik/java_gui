package W02_inheritance;

public class Osoba {
    public String imie;
    public String nazwisko;

    Osoba(String imie,String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko;

    }
}
