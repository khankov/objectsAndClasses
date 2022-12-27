package homeworkClasses;

public class Homework1 {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Author pyshkin = new Author("Александр", "Пушкин");
        Book nose = new Book("Нос", gogol, 1836);
        Book prophet = new Book("Пророк", pyshkin, 1841);
        nose.setAge(1900);
        System.out.println(nose);
        System.out.println(prophet);
    }
}
