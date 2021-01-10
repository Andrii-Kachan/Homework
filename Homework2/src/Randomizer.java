import java.util.Random;

public class Randomizer {
    Random random;

    public Randomizer(){
        random = new Random();
    }

    public void start1(){
        int randomValue = random.nextInt();
        System.out.println(randomValue);
    }

    public void start2(){
        for (int i = 0 ; i < 10 ; i++){
            int randomValue = random.nextInt();
            System.out.println(randomValue);
        }
    }

    public void start3(){
        int min = 0;
        int max = 10;

        for (int i = 0 ; i < 10 ; i++){
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println(randomValue);
        }
    }

    public void start4(){
        int min = 20;
        int max = 50;

        for (int i = 0 ; i < 10 ; i++){
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println(randomValue);
        }
    }

    public void start5(){
        int min = -10;
        int max = 10;

        for (int i = 0 ; i < 10 ; i++){
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println(randomValue);
        }
    }

    public void start6(){
        int randomMin = 3;
        int randomMax = 15;
        int min = -10;
        int max = 35;

        int randomAttempts = random.nextInt((randomMax - randomMin) + 1) + randomMin;
        System.out.println("Количество выводимых чисел " + randomAttempts);

        for (int i = 0 ; i < randomAttempts ; i++){
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println(randomValue);
        }
    }
}
