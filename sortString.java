package week1_trainning;

import java.util.Arrays;

public class sortString {
    private static String sortString(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(sortString("ilOvecoding"));
    }
}
