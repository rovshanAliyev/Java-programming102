package day54_abstraction;

public class Pizza extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("stretch the dough and put topping and chesse then bake it");
    }

    @Override
    public void serve() {
        System.out.println("serce in a plate or in a box");
    }
}
