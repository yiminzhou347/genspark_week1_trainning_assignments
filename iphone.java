package week1_trainning;

public class iphone implements phone{
    @Override
    public void open() {
        System.out.println("iphone is openning!");
    }

    @Override
    public void close() {
        System.out.println("Iophone is shutting down!");
    }

    @Override
    public String showBrand() {
        return "This is iphone";
    }
}
