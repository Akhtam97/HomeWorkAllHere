public class Student1HW2_1 {
    String name;
    int age;
    String country;

    @Override
    public String toString() {
        return "Имя = " + name + "\n" +
                "Возраст = " + age + "\n" +
                "Страна = " + country + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student1HW2_1(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;

    }

    public static void main(String[] args) {
        Student1HW2_1 student1 = new Student1HW2_1("Volodya",18,"Russia");
        Student1HW2_1 student2 = new Student1HW2_1("Adolf", 19, "Germany");
        Student1HW2_1 student3 = new Student1HW2_1("Iosif", 20, "USSR");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
