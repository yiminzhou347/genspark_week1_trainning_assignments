package week1_trainning;

public class cat extends Pet{

     static void catchrat(){
        System.out.println("I can catch rats");
    }

    @Override
    public void speak() {
        System.out.println("Meo!! Meo!!");
    }

    @Override
    public void eat(){
        System.out.println("I am eating fish!");
    }


    public static void main(String[] args) {
        System.out.println(Pet.kind);
        cat.catchrat();
    }
}
