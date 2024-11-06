package W02_inheritance;

public class MyClass implements Show{
    @Override
    public void showHelloWithText(String text) {
        System.out.println("Hello " + text);
    }

//    @Override
//    public void showText(String text) {
//        System.out.println( text);
//    }
}
