package W02_inheritance;

public class Main {
    public static void main(String[] args){
//        Pracownik p1 = new Pracownik("Jan","nowak");

//      Lambda wyrażenie
//        Show s = (str) -> System.out.println("Hello LW: " + str);
//        s.showHelloWithText("Ala");

        Samochod s1 = new Samochod();
        s1.showTypPojazdu();

        Pojazd p2 = new Pojazd() {
            @Override
            public void showTypPojazdu() {
                System.out.println("Type: Pojazd");
            }
        };
        p2.showTypPojazdu();
    }
}
