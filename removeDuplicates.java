package week1_trainning;

import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicates {
    private static  int[] removeDuplicates(int[] input){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : input ){
            hs.add(i);
        }
        int [] result = new int[hs.size()];
        Iterator value =hs.iterator();
        int i = 0 ;

        while(value.hasNext()){
            result[i]=(int)value.next();
            i++;

        }
        return result;
    }

    public static void main(String[] args) {

        int [] p = removeDuplicates(new int[] {1123123,442,2,2,3});
        for(int i = 0 ;i <p.length;i++){
            System.out.println(p[i]);
        }
    }
}
