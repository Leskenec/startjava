public class WolfTest {
    public static void main(String[] args) {
        Wolf createObject = new Wolf();

        createObject.gender = "male";
        createObject.nickname = "wild";
        createObject.age = 5;
        createObject.weight = 23;
        createObject.color = "grey";
        System.out.println(createObject.age);
        System.out.println(createObject.gender);
        System.out.println(createObject.nickname);
        System.out.println(createObject.howl());
    }
}