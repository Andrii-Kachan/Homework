public class Arrays {

    public void minValue() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min Index: " + minIndex);
    }

    public void maxValue() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("max value: " + maxValue);
        System.out.println("max Index: " + maxIndex);
    }

    public void sumOfOddElements() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("sum = " + sum);
    }

    public void mirrorArray() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%s ", array[i]);
        }

        System.out.println();
    }

    public void quantitiesOfOddElements() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};
        int quantities = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                quantities++;
            }
        }
        System.out.println("quantities = " + quantities);
    }

    public void bubbleSorted() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array));
    }

    public void selectSorted() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};

        for (int step = 0; step < array.length; step++) {
            System.out.println(java.util.Arrays.toString(array));
            int index = min(array, step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;

        }
    }

    private static int min(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void insertSort() {
        int[] array = new int[]{45, 24, 56, 34, 12, 5, 2};
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println(java.util.Arrays.toString(array));
    }


    public static void swapArray() {
        int[] array = new int[]{1, 2, 3, 4};
        int mid = array.length / 2;
        int secHalf = mid;
        int temp;
        for (int i = 0; i < mid; i++) {
            temp = array[i];
            array[i] = array[secHalf];
            array[secHalf] = temp;
            secHalf++;
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
