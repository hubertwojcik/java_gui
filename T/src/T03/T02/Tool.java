package T03.T02;

import java.io.Serializable;

public abstract class Tool implements Serializable {
    private String name;

    Tool(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
