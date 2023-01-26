import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import java.lang.*;// this is by default , no need to import

public class Main {
    public static void main(String[] args) {
//        System.out.println(biggest(4,5,3));
//        System.out.println(primeInN(100));
//        System.out.println(isVowel('b'));
//        System.out.println(factorialOfN(6);
//          System.out.println(generateMatrix(6));
//        System.out.println(BinaryToDecimal(1000));
//        input();
//        int a = 2 ;
//        int b =4;
//        int c = 5 ;
//        int res1 = a*b-c;
//        int res2 = a-b*c;
//        int res3 = a+b-c;
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);

        }

    //Q1:print biggest number without using if-else
    private static int  find_Biggest(int a, int b,int c ){
        return (a>b && a >c)?a:((b>c)?b:c);
    }


    //Q2:Display All Prime Numbers from 1 to N
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

    //Q3:Check whether input character is vowel or consonant
    private static boolean isVowel(char c){
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
//        new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        if(hs.contains(c)){
            return true;
        }
        if(c=='y'|| c=='Y')return true;
        return false;
    }

    //Q4:Find Factorial of a number
    private static int factorialOfN(int n){
            if (n == 0) return 1;
            int result = 1;
            while (n > 0) {
                result *= n;
                n--;
            }
            return result;
        }

    //Q5:Print Spiral Pattern of Numbers
    private static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int rowBegin=0;
        int rowEnd=n-1;
        int columnBegin=0;
        int columnEnd=n-1;
        int counter =1;

        while(rowBegin<=rowEnd && columnBegin<=columnEnd){

            for(int i =columnBegin;i<=columnEnd;i++){
                result[rowBegin][i]=counter++;
            }
            rowBegin++;


            for(int i = rowBegin;i<=rowEnd;i++){
                result[i][columnEnd]=counter++;
            }
            columnEnd--;

            if(rowBegin <= rowEnd && columnBegin <= columnEnd){
                for(int i = columnEnd;i>=columnBegin;i--){
                    result[rowEnd][i]=counter++;
                }
                rowEnd--;
            }
            if(rowBegin<= rowEnd && columnBegin<=columnEnd){
                for(int i = rowEnd;i>=rowBegin;i--){
                    result[i][columnBegin]=counter++;
                }
                columnBegin++;
            }
        }
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        return result;
    }

    //q6:Binary to Decimal Conversion
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


    // scanner example
    private static void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter here : ");
//        String output = scan.nextLine();
        int output = scan.nextInt();
        scan.close();
        switch(output){
            case 0:{
                System.out.println("you enter 0 !");break;
            }
            case 1:{
                System.out.println("You enter 1!");break;
            }
        }

        System.out.println("The content you entered is here: "+output);
    }
}