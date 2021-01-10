import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber1 {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        int numberOfAttempts = 7;
        enterNumber(randomNumber, numberOfAttempts);

    }

    public static void enterNumber(int randomNumber, int numberOfAttempts) {
       // System.out.println(randomNumber);
        int prevChoise = 0;
        int usedAttempts = 0;
        System.out.println("Введите число от 0 до 100");

        Scanner sc = new Scanner(System.in);

        while (usedAttempts != numberOfAttempts) {

            int userNumber = sc.nextInt();

            if (userNumber < 1 || 100 < userNumber){
                System.out.println("Число должно попадать в диапазон от 0 до 100");
                continue;
            }

            if (userNumber == randomNumber) {
                if (numberOfAttempts == 1){
                    System.out.println("Вы угадали!!! *");
                }
                if (numberOfAttempts == 2){
                    System.out.println("Вы угадали!!! * *");
                }
                if (numberOfAttempts >= 3){
                    System.out.println("Вы угадали!!! * * *");
                }
                break;
            }

            if (prevChoise == 0){
                if (userNumber > randomNumber) {
                    System.out.println("Ваше число больше заданного, попыток осталось " + --numberOfAttempts);
                } else {
                    System.out.println("Ваше число меньше заданного, повыток осталось " + --numberOfAttempts);
                }
            }
            else if (Math.abs(randomNumber - prevChoise) > Math.abs(randomNumber - userNumber)){
                System.out.println("Теплее! У вас осталось " + --numberOfAttempts + " попыток");
            }
            else {
                System.out.println("Холоднее! У вас осталось " + --numberOfAttempts + " попыток");
            }
            prevChoise = userNumber;
        }
    }
}
