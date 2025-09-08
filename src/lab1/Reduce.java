package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = 0;

        count = reduce(100);

        System.out.println(count);
    }

    public static int reduce(int n) {
        int count = 0;
        
        while (n > 0) {
            if (n% 2 == 0) {
                n= n/ 2;
            } else {
                n-= 1;
            }
            count++;
        }
        return count;
    }

    public static int reduce() {
        return reduce(100);
    }
}
