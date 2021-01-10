public class ConditionalOperators {

    public void thisComparison(int x, int y) {
        if (x % 2 == 0) {
            System.out.println(x * y);
        }
        System.out.println(x + y);
    }

    public void coordinateSystem(int x, int y){
        String result = "";
        if (x > 0 && y > 0) {
            result = ("Вы находитесь в I-й четверти");
        } else if (x > 0 && y == 0){
            result = ("Вы находитесь в I-й и IV-й четверти");
        } else if (x < 0 && y > 0){
            result = ("Вы находитесь в II-й четверти");
        } else if (x < 0 && y == 0){
            result = ("Вы находитесь в II-й и III-й четверти");
        } else if (x < 0 && y < 0){
            result = ("Вы находитесь в III-й четверти");
        } else if (x == 0 && y > 0){
            result = ("Вы находитесь в I-й и II-й четверти");
        } else if (x > 0 && y < 0){
            result = ("Вы находитесь в IV-й четверти");
        } else if (x == 0 && y < 0){
            result = ("Вы находитесь в III-й и IV-й четверти");
        } else {
            result = ("Вы находитесь в 0-й точке");
        }
        System.out.println(result);
    }

    public void sumOfPositiveNumbers(int a, int b, int c){

        if (a >= 0 && b >= 0 && c >= 0){
            System.out.println(a + b + c);
        } else if (a >= 0 && b >= 0){
            System.out.println(a + b);
        } else if (b >= 0 && c >= 0){
            System.out.println(b + c);
        } else if (a >= 0 && c >= 0){
            System.out.println(a + c);
        } else if (a >= 0){
            System.out.println(a);
        } else if (b >= 0){
            System.out.println(b);
        } else if (c >= 0){
            System.out.println(c);
        }else{
            System.out.println(0);
        }
    }

    public void maxABC (int a, int b, int c){
        int derivative = a * b * c;
        int sum = a + b + c;

        if (derivative > sum){
            System.out.println(derivative + 3);
        }
        System.out.println(sum + 3);
    }

    public void studentGradeRating(int a) {
        String result = "";
        if (a >= 0 && a <= 19) {
            result = ("Оценка F");
        } else if (a <= 39) {
            result = ("Оценка E");
        } else if (a <= 59) {
            result = ("Оценка D");
        } else if (a <= 74) {
            result = ("Оценкаа C");
        } else if (a <= 89) {
            result = ("Оценка B");
        } else if (a <= 100) {
            result = ("Оценка A");
        } else {
            result = ("Ваша оценка находиться за пределами рейтинга");
        }
        System.out.println(result);

    }
}
