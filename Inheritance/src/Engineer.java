import java.util.Arrays;

public class Engineer extends Employee {
    String[] skills;

    public Engineer(String name, String department, double salary, String[] string) {
        super(name, department, salary);
        this.skills = string;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Engineering skills= " + Arrays.toString(skills);
    }

}
