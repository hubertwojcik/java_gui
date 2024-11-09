package T02.Devices;

public class Mobilephone extends Device implements Calling,Texting{
    private boolean hasSim;
    Mobilephone(String producent, double price,boolean hasSim){
        super(producent,price);
        this.hasSim=hasSim;
    }

    @Override
    public void call() {
        if(hasSim){
            System.out.println("Mobile phone is calling...");

        }else{
            System.out.println("Cannot call, No SIM card");
        }
    }

    @Override
    public void text() {
        if(hasSim){
            System.out.println("Mobile phoen is texting");


        }else{
            System.out.println("Cannot text, No SIM card");
        }
    }

    @Override
    public String toString() {
        return "Mobile phone: "+ super.toString();
    }
}
