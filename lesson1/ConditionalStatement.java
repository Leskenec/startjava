public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if(age > 20) {
            System.out.println("It`s not young man");
        } 
            System.out.println("");
        boolean isMale = true;
        if(isMale) {
            System.out.println("It`s male");
        }
            System.out.println("");
        if(isMale = !true) {
            System.out.println("This person is woman");
        }
            System.out.println("");
        float height = 1.75f;
        if(height < 1.80f) {
            System.out.println("too small for volleyball");
        } else {
            System.out.println("suitable height");
        }
        System.out.println(""); 
        char firstLetterName = 'J';
        if (firstLetterName == 'M') {
            System.out.println("Your name begin letter M");
        } else if(firstLetterName == 'I') {
            System.out.println("Your name begin letter I");
        } else {
            System.out.println("Your name begin another letter");
        }
    }
}

