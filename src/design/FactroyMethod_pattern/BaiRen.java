package design.FactroyMethod_pattern;

public class BaiRen implements  Human {
    @Override
    public void laugh() {
        System.out.println("白人笑了");
    }

    @Override
    public void cry() {
        System.out.println("白人哭了");
    }

    @Override
    public void talk() {
        System.out.println("白人说话了");
    }
}
