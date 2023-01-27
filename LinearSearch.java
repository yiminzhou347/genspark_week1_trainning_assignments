package week1_trainning;

public class LinearSearch {
    private static int LinearSearch(int[] input ,int target){
        for(int i =0 ; i < input.length;i++){
            if(input[i] == target ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,5,5,5,67,3,2,9,12,10};

        System.out.println(LinearSearch(input,67));
    }
}
