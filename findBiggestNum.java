package week1_trainning;

public class findBiggestNum {
    private static int  find_Biggest(int a, int b,int c ){
        return (a>b && a >c)?a:((b>c)?b:c);
    }

    public static void main(String[] args) {
        System.out.println(find_Biggest(5,4,3));
    }

}
