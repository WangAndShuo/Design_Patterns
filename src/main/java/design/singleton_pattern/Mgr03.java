package design.singleton_pattern;


/**
 * lazy Loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但是却带来了线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){}
    public static Mgr03 getInstance(){
        if(INSTANCE == null){
            try { Thread.sleep(1);} catch (InterruptedException e) { e.printStackTrace();}
            INSTANCE = new Mgr03();
            System.out.println("---------");
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i = 0; i< 20000; i++){
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }

    }
}
