package Week20;
import java.util.*;
public class Course{
    private ArrayList<Module> moduleArrayList;

    public Course() {
        this.moduleArrayList = new ArrayList<>();
    }

    public void addModule(Module module) {
        moduleArrayList.add(module);
    }
}