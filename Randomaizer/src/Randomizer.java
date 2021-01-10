import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    Scanner scanner;
    Random random;

    public Randomizer(){
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void start(){
        System.out.println("Введите минимальное значение:");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное значение:");
        int max = scanner.nextInt();
        int[] array = new int[max - min +1];
        int count = 0;

        while (true){
            System.out.println("Введите команду");
            String userCommand = scanner.nextLine();
            
            if (userCommand.equalsIgnoreCase("exit")){
                System.out.println("Вы покинули генератор");
                System.exit(0);
            }
            if (userCommand.equalsIgnoreCase("help")){
                System.out.println("Вам доступны следующие команды\n" +
                        "generate - генерирует рандомное число\n" +
                        "exit - покинуть генерацию");

            }
            if (userCommand.equalsIgnoreCase("generate")){
                if (array.length == count){
                    System.out.println("Уникальные числа закончились");
                    System.exit(0);
                }
                while(true){
                    int randomValue = random.nextInt((max - min) + 1) + min;
                    if (array[randomValue - min] == 0){
                        array[randomValue - min] = randomValue;
                        System.out.println(randomValue);
                        count++;
                        break;
                    }
                }
            }
        }
    }
}
