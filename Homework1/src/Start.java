public class Start {

    public static void main(String[] args){

        ConditionalOperators cO = new ConditionalOperators();
        System.out.println("Условные операторы");
        System.out.println("Задача 1");
        cO.thisComparison(1, 2);
        System.out.println("Задача 2");
        cO.coordinateSystem(0,0);
        System.out.println("Задача 3");
        cO.sumOfPositiveNumbers(2, 7, 4);
        System.out.println("Задача 4");
        cO.maxABC(1, 2, 3 );
        System.out.println("Задача 5");
        cO.studentGradeRating(50);

        Cycles cycles = new Cycles();
        System.out.println("Циклы");
        System.out.println("Задача 1");
        cycles.findSumOfEvenAndTheirQuantity();
        System.out.println("Задача 2");
        cycles.checkIsANumberSimple(4);
        System.out.println("Задача 3");
        cycles.sqrBruteF(6);
        System.out.println("Задача 4");
        cycles.factorialNumber(5);
        System.out.println("Задача 5");
        cycles.sumNumber(5);
        System.out.println("Задача 6");
        cycles.mirrorNumber("123");

        Arrays arrays = new Arrays();
        System.out.println("Масивы");
        System.out.println("Задача 1, 3");
        arrays.minValue();
        System.out.println("Задача 2, 4");
        arrays.maxValue();
        System.out.println("Задача 5");
        arrays.sumOfOddElements();
        System.out.println("Задача 6");
        arrays.mirrorArray();
        System.out.println("Задача 7");
        arrays.quantitiesOfOddElements();
        System.out.println("Задача 8");
        arrays.swapArray();
        System.out.println("Задача 9");
        System.out.println("Сортировка пузырьком");
        arrays.bubbleSorted();
        System.out.println("Сортировка вставками");
        arrays.insertSort();
        System.out.println("Сортировка выбором");
        arrays.selectSorted();

    }
}
