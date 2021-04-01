public class Wolf {

    String gender;
    String nickname;
    int weight;
    int age;
    String color;

    void go() {
        System.out.println("Волк идет");
    }

    void sit() {
        System.out.println("Волк сидит");
    }

    void run() {
        System.out.println("Волк бежит");
    }

    boolean howl() {
        System.out.println("Выть на луну");
        return true;
    }

    boolean hunt() {
        System.out.println("Поймал добычу");
        return true;
    }
}