package design.singleton_pattern;


/***
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {
    private Mgr07(){}

    private static class Mgr07Helper{
        static{
            System.out.println("加载了静态内部类");
        }
        private static Mgr07 INSTANCE = new Mgr07();
    }
    public static Mgr07 getInstance(){
        return Mgr07Helper.INSTANCE;
    }


    public static void main(String[] args) {
        for(int i = 0; i< 20; i++){
            new Thread(() -> {
//                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
