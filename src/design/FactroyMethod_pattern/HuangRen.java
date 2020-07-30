package design.FactroyMethod_pattern;

public class HuangRen implements  Human {
    @Override
    public void laugh() {
        System.out.println("黄人笑了");
    }

    @Override
    public void cry() {
        System.out.println("黄人哭了");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话了");
    }
}