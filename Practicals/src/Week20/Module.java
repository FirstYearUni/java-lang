package Week20;

public class Module {
    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getCode() {
        return code;
    }

    private String name;
    private double grade;
    private String code;

    public Module(String name, double grade, String code) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }
    public String display(Module module){
        String strModule;
        strModule = String.format("%10s%6s%3s", module.getName(), module.getCode(), module.getGrade());
        return strModule;
    }
}
