public class Wolf {

    private String gender = "male";
    private String nickname = "wild";
    private int weight = 23;
    private int age = 7;
    private String color = "grey";

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname (String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некоректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Волк идет");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public boolean howl() {
        System.out.println("Выть на луну");
        return true;
    }

    boolean hunt() {
        System.out.println("Поймал добычу");
        return true;
    }
}