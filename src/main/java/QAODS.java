public class QAODS extends QATeam {
    public QAODS(String name, String team) {
        super(name, team);
    }

    @Override
    public void sayAboutMe() {
        String name = getName();
        String grade = getGrade();
        System.out.println("Я " + name + " и мой грейд равен " + grade);
    }
}
