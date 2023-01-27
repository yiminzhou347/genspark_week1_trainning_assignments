package week1_trainning;

public abstract class Pet {
    static String kind ="I am an animal";
    String name="I am a pet";
    public abstract void speak();
    public void eat(){
        System.out.println("I am eating !!");
    }
    public void eat(String food){
        System.out.println("I am eating "+food+"!!!");
    }

    public static void main(String[] args) {
        System.out.println(kind);
    }
}

