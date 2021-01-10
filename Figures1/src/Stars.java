public class Stars {
    int num = 7;
    int k = num-1;
    int b = k;
    int c = b;
    int a = num/2;


    public void figures1(){
        for (int i=0 ; i<num ; i++){
            for (int j=0 ; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void figures2(){
        for (int i=0 ; i<num ; i++){
            for (int j=0 ; j<num; j++){
                if (i == 0 || i == k) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j == k) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures3(){
        for (int i=num-1 ; i>=0 ; i--){
            for (int j=0 ; j<=i; j++){
                if (i == 0 || i == k) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j ==i) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures4(){
        for (int i=0 ; i<num ; i++){
            for (int j=0 ; j<=i; j++){
                if (i == 0 || i == k) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j ==i) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures5(){
        for (int i=0 ; i<num ; i++){
            for (int j=k ; j>=0; j--){
                if (i == num-1) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j ==i) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures6(){
        for (int i=0 ; i<num ; i++){
            for (int j=0 ; j<num; j++){
                if (j==i || j== k){
                    System.out.print("*");
                    continue;
                }
                if (i==0){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures7(){
        for (int i=0 ; i<num ; i++, k--){
            for (int j=0 ; j<num; j++){
                if (j==i || j==k){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures8(){
        for (int i=0 ; i<num ; i++, b--){
            for (int j=0 ; j<num; j++){
                if (i<=a) {
                    if (j == i || j == b) {
                        System.out.print("*");
                        continue;
                    }
                    if (i==0){
                        System.out.print("*");
                        continue;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void figures9(){
        for (int i=0 ; i<num ; i++, c--){
            for (int j=0 ; j<num; j++){
                if (i>=a) {
                    if (j == i || j == c) {
                        System.out.print("*");
                        continue;
                    }
                    if (i==num-1){
                        System.out.print("*");
                        continue;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
