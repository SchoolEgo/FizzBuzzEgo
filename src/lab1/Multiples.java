package lab1;

public class Multiples {
    public static void main(String[] args) {
        int multOf3 = 0, multOf5 = 0;

        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0){
                multOf3++;
            }
            if (i % 5 == 0){
                multOf5++;
            }
        }

        System.out.println(multOf3);
        System.out.println(multOf5);
    }
}
