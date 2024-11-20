package T03.T02;

import java.io.Serializable;

public class Pencil extends Tool implements Serializable {
    private String color;
    Pencil(String name,String color){
        super(name);
        this.color=color;
    }

    public String getColor() {
        return color;
    }
}
