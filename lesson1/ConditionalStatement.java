public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if(age > 20) {
            System.out.println("It`s not young man");

        } boolean isMale = true;
        if(isMale == true) {
            System.out.println("It`s male");

        } boolean isWoman = true;
        if(isWoman == !false) {
            System.out.println("This person is woman");

        } float height = 1.75f;
        if(height < 1.80f) {
            System.out.println("too small for volleyball");
        } else {
            System.out.println("suitable height");

        } char firstLetterName = 'J';
        if (firstLetterName == 'M') {
            System.out.println("Your name begin letter M");
        } else if (firstLetterName == 'I') {
            System.out.println("Your name begin letter I");
        } else {
            System.out.println("Your name begin another letter");
        }
    }
}

