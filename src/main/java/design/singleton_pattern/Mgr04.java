package design.singleton_pattern;

/**
 * lazy Loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但是却带来了线程不安全的问题
 * 可以通过synchronized解决，但是也带来效率下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){}


    public static synchronized Mgr04 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i = 0; i< 1000; i++){
            new Thread(() -> {
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
