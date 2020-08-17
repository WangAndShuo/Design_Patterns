package design.singleton_pattern;

public class Mgr06 {
    private static volatile Mgr06 INSTANCE;
    private Mgr06(){}


    public static Mgr06 getInstance(){
        if(INSTANCE == null){
            //双重检测机制
            synchronized(Mgr06.class) {
                if(INSTANCE == null){
                    INSTANCE = new Mgr06();
                }
            }
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
