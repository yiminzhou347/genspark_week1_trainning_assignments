package week1_trainning;

public class Factorial {
    private static int factorialOfN(int n){
        if (n == 0) return 1;
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfN(6));
    }

}
