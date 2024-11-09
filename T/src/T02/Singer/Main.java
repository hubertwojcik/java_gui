package T02.Singer;

public class Main {
    public static void main(String[] args){
        Singer s1 = new Singer("Eminem") {
            @Override
            public String sing() {
                return "Sing";
            }
        };

        Singer s2 = new Singer("Eagles") {
            @Override
            public String sing() {
                return "HotelCalifornia";
            }
        };

        Singer s3 = new Singer("Dżem") {
            @Override
            public String sing() {
                return "WehikulCzasu";
            }
        };

        Singer[] singers = {s1,s2,s3};

        for(Singer singer: singers){
            System.out.println(singer.toString());
        }

        System.out.println(Singer.loudest(singers));
    }

}
