package week1_trainning;

public class binearySearch {
    private static int bs(int[] input ,int target){
        int start = 0 ;
        int end = input.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(input[mid]== target ) return mid;
            else if(input[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1 ;

    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,5,5,5,67,100,200,209,1200,100000};

        System.out.println(bs(input,209));
    }
}
