package week1_trainning;

import java.util.Arrays;
import java.util.HashSet;

public class checkVowel {
    private static boolean isVowel(char c){
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
//        new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        if(hs.contains(c)){
            return true;
        }
        if(c=='y'|| c=='Y')return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }
}
