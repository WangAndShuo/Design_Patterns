package design.FactroyMethod_pattern;

public class HeiRen implements Human {
    @Override
    public void laugh() {
        System.out.println("嘿人笑了");
    }

    @Override
    public void cry() {
        System.out.println("嘿人哭了");
    }

    @Override
    public void talk() {
        System.out.println("嘿人说话了");
    }
}