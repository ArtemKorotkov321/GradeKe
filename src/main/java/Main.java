public class Main {
    public static void main(String[] args) {
        QATeam nelya = new QAODS("Неля", "ODS");
        QATeam artyom = new QAODS("Артём", "ODS");
        QATeam niyaz = new QAWMS("Нияз", "WMS");

        nelya.sayAboutMe();
        artyom.setGrade("M2");
        artyom.sayAboutMe();
        niyaz.sayAboutMe();
    }
}
