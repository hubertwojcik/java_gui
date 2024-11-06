package W02_inheritance;
@FunctionalInterface
public interface Show {
    default void showText(String text){
        System.out.println(text);
    }

    void showHelloWithText(String text);

}
