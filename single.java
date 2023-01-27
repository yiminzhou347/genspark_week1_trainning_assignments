package week1_trainning;

public class single {
    private static single instance = null;
    public String s;

    private single(){
        s="Hi I am created when you call the constructor!";
    }

    public static single getInstance(){
        if(instance == null){
//            return new single(); This is a wrong answer.
            instance = new single();
        }
        return instance;
    }

    public static void main(String[] args) {
        single x = single.getInstance();
        single y = single.getInstance();
        single z = single.getInstance();
        System.out.println("Hashcode of x is :"+x.hashCode());
        System.out.println("Hashcode of y is :"+y.hashCode());
        System.out.println("Hashcode of z is :"+z.hashCode());
        if(x==y&&y==z){
            System.out.println("Three obj is same,they point to the same memory location on the heap");
        }else{
            System.out.println("Three obj is different, they point to different memory location on the heap ");
        }

    }
}
