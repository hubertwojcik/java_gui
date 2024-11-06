package W02_inheritance;

public class Pracownik extends Osoba{
    public Pracownik(String imie, String naziwsko){
        super(imie,naziwsko);
    }

    @Override
    public String toString(){
        return "Pracownik "+ super.toString();
    }
}
