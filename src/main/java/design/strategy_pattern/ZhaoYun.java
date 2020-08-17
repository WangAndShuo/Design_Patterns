package design.strategy_pattern;

public class ZhaoYun {
    public static void main(String[] args) {
        System.out.println("第一次遇到危险打开了第一个方法");
        JinNang jinNang   = new JinNang(new Sleeve1());
        jinNang.sleeve();
        System.out.println("=============================");

        System.out.println("第一次遇到危险打开了第2个方法");
        JinNang jinNang1   = new JinNang(new Sleeve2());
        jinNang1.sleeve();
        System.out.println("=============================");

        System.out.println("第一次遇到危险打开了第3个方法");
        JinNang jinNang2   = new JinNang(new Sleeve3());
        jinNang2.sleeve();
        System.out.println("=============================");
    }
}
