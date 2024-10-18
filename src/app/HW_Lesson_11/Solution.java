package app.HW_Lesson_11;

public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 51, "Лікар");
        Person person2 = new Person("Kate", 22, "Мед.сестра");
        Person person3 = new Person("David", 34, "Водій");

        System.out.println("1. " + person1 + "\n   " + person2 + "\n   " + person3);
        Person person4 = new Person("Lucy", 25, "Секретар");
        System.out.println();
        System.out.println("2. " + person4);
        person4.profession = "Менеджер";
        System.out.println("   (Після оновлення професії)\n   " + person4);

    }
}
