import java.util.Arrays;

public class Cycles {

    public void findSumOfEvenAndTheirQuantity() {
        int[] result = new int[2];
        int sum = 0;
        int quantity = 0;

        for (int x = 0; x < 100; x = x + 2) {
            sum += x;
            quantity++;
        }
        result[0] = sum;
        result[1] = quantity;

        System.out.println(Arrays.toString(result));
    }

    public void checkIsANumberSimple(int num) {
        String result = null;
        boolean isComposite = false;

        if (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                result = "Число составное";
            } else {
                result = "Число простое";
            }
        }
        System.out.println(result);
    }

    public void factorialNumber(int num) {
        int quantity = 1;

        for (int i = 1; i <= num; i++) {
            quantity *= i;
        }

        System.out.println("Факториал числа = " + quantity);
    }

    public void sqrBruteF(int num){
        if (num < 0){
            throw new IllegalArgumentException("Input value shouldn't be negative.");
        }
        else {
            int sqr;
            int i = 1;
            while (true) {
                sqr = i * i;
                if (sqr == num) {
                    System.out.println(i);
                    break;
                } else if (sqr > num) {
                    System.out.println(i - 1);
                    break;
                } else i++;

            }
        }
    }

    public void sumNumber(int num) {
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел = " + sum);
    }

    public void mirrorNumber(String a) {
        char[] arr = a.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%s", arr[i]);
        }
        System.out.println();
    }


}
