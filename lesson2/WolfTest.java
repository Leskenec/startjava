public class WolfTest {
    public static void main(String[] args) {
        Wolf wild = new Wolf();

        wild.gender = "male";
        wild.nickname = "wild";
        wild.age = 5;
        wild.weight = 23;
        wild.color = "grey";
        System.out.println(wild.age);
        System.out.println(wild.gender);
        System.out.println(wild.nickname);
        System.out.println(wild.howl());
    }
}