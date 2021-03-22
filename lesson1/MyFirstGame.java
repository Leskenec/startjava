public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 45;
        int playerNumber = 20;

        do {
        if(playerNumber > compNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер!! ");
            playerNumber--;
        } else if(playerNumber < compNumber); {
            System.out.println("Введенное вами число меньше того, что загадал компьютер!! ");
            playerNumber++;
        }
        } while(playerNumber == compNumber);
            System.out.println("Вы угадали");
    }
}  

