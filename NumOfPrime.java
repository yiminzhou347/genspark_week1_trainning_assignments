package week1_trainning;

import java.util.ArrayList;

public class NumOfPrime {
    private static ArrayList<Integer> primeInN(int n){
        ArrayList<Integer> result = new ArrayList<>();
        if(n==1){
            result.add(1);
            return result;
        }

        for(int i =2;i<=n;i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }
    private static boolean isPrime(int n){
        if(n==1) return false;
        int sr= (int)Math.sqrt(n);
        for(int i =2;i<=sr;i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeInN(100));
    }

}
