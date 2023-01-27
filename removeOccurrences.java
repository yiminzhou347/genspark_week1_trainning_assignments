package week1_trainning;

import java.util.Arrays;

public class removeOccurrences {
    private static int[] removeOccurrences(int[] input, int key ){
        int len = input.length;
        int index= 0 ;

        for(int i=0;i<len;i++ ){
            if(input[i]!= key){
                input[index++]=input[i];
            }
        }
        return  Arrays.copyOf(input,index);

    }

    public static void main(String[] args) {
        int[] array = { 4, 6, 23, 3, 11, 23, 3, 3, 5 };
        int key = 3;
        array = removeOccurrences(array, key);
        System.out.println(Arrays.toString(array));
    }

}

