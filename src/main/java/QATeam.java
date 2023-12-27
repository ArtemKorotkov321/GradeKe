import java.util.Objects;

public abstract class QATeam {
    private String name;
    private String team;

    private String grade;

    public QATeam(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return Objects.requireNonNullElse(grade, "Unknown");
    }

    public void sayAboutMe() {
        System.out.println("I'm " + name + " and i testing in " + team);
    }
}
