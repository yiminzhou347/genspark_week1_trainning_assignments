package week1_trainning;

public class dog extends Pet{

    static void guardHouse(){
        System.out.println("I can guard house");
    }

    @Override
    public void speak() {
        System.out.println("Woaf !!!Woaf!!");
    }

    @Override
    public void eat() {
        System.out.println("I am eating bone!");
    }
}
