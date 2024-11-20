package T03.T02;

import java.io.Serializable;

public class BallpointPen extends Tool implements Serializable {
    private String type;
    BallpointPen(String name,String type){
        super(name);
        this.type=type;
    }

    public String getType() {
        return type;
    }

}
