public class WolfTest {
    public static void main(String[] args) {
        Wolf wild = new Wolf();

        wild.setGender("Male");
        wild.setNickname("Barbos");
        wild.setAge(11);
        wild.setWeight(27);
        wild.setColor("white");
        System.out.println(wild.getGender()); 
        System.out.println(wild.getNickname());
        System.out.println(wild.getAge());
        System.out.println(wild.getWeight());
        System.out.println(wild.getColor());
        System.out.println(wild.howl());
    }
}