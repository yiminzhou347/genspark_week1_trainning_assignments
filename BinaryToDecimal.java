package week1_trainning;

public class BinaryToDecimal {
    private static int BinaryToDecimal(int n){
        int decimal=0; int i =0;
        while(n>0){
            int reminder = n%10;
            n=n/10;
            decimal = decimal + reminder * (int)Math.pow(2, i);
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal(11));
    }

}
