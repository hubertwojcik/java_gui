package T03.T02;

import java.io.Serializable;
import java.util.*;

public class PencilCase implements Serializable {
    private List<Tool> tools;

    PencilCase(){
        this.tools = new ArrayList<>();
    }

    public void addToCase(Tool tool){
        this.tools.add(tool);
    }

    public List<Tool> getTools(){
        return tools;
    }

    public void showWhatIsInside(){
        for (Tool t : tools){
            System.out.println("PenilCase consists of: " + t.getName());
        }
    }
}
