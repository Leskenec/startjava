public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++){
            System.out.println(i);

        } System.out.println("");
        int i = 6;
        while(i >= -6){
            System.out.println(i);
            i = i - 2;
        } System.out.println("");
          
          int a = 10;  // переменная i уже использовалась
          int sum = 0;
          do{
            if(a % 2==1) sum+=a; // sum = sum +a;
            a++;
          } while (a<=20);
          System.out.println(sum);
    }
}