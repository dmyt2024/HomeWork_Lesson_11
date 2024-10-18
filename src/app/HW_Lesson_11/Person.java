package app.HW_Lesson_11;

public class Person {
    public String name;
    public int age;
    String profession;


    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void changeProfessional(String newProfession) {
        profession = newProfession;
    }

    @Override
    public String toString() {
        return
                "Імʼя: " + name +
                        ", Вік: " + age +
                        ", Профессія: " + profession
                ;
    }
}
