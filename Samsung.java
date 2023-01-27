package week1_trainning;

public class Samsung implements phone{
    @Override
    public void open() {
        System.out.println("Samsung is opening!");
    }

    @Override
    public void close() {
        System.out.println("Samsung is shutting down!");
    }

    @Override
    public String showBrand() {
        return "this is Samsung!";
    }
}
