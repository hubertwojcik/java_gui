package T03.T02;

import java.io.Serializable;

public class Scissors extends Tool implements Serializable {
    private String sharpness;
    Scissors(String name,String sharpness){
        super(name);this.sharpness=sharpness;
    }

    public String getSharpness() {
        return sharpness;
    }
}
