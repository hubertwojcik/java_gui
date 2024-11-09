package T02.Singer;

public abstract class Singer {
    private static int counter = 1;
    private final String name;
    private final int number;
    Singer(String name){
        this.name=name;
        this.number=counter++;
    }

    @Override
    public String toString(){
        return "(" + number +") " + name +": " + sing();
    }
    public abstract String sing();

    public static Singer loudest(Singer[] singers){
        Singer loudest = null;
        int maxCapitalLetters = 0;

        for (Singer singer : singers){
            int capitalLetters = countUpperCase(singer.sing());
            if (capitalLetters > maxCapitalLetters){
                maxCapitalLetters = capitalLetters;
                loudest = singer;
            }
        };
        return loudest;
    };

    public static int countUpperCase(String text){
        int count= 0;
        for (char c : text.toCharArray()){
            if(Character.isUpperCase((c))){
                count++;
            }
        }
        return count;
    }
}
