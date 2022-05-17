public class HW_Z2_2_1 extends Student1HW2_1 {
    String achievement;

    @Override
    public String toString() {
        return "Имя = " + name + "\n" +
                "Возраст = " + age + "\n" +
                "Страна = " + country + "\n" +
                "Достижения = " + achievement + "\n";
    }

    public HW_Z2_2_1(String name, int age, String country, String achievement) {
        super(name, age, country);
        this.achievement = achievement;

    }
    public static void main(String[] args) {
        HW_Z2_2_1 studentA = new HW_Z2_2_1("Volodya", 18, "Russia", "Special military operation");
        HW_Z2_2_1 studentB = new HW_Z2_2_1("Adolf", 19, "Germany", "Conquered half of Europe");
        HW_Z2_2_1 studentC = new HW_Z2_2_1("Iosif", 20, "USSR", "Student, Komsomol, Athlete, and just handsome");

        System.out.println(studentA);
        System.out.println(studentB);
        System.out.println(studentC);


    }
}
