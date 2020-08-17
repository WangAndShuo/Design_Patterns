package design.singleton_pattern;

public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){}


    public static  Mgr05 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(Mgr05.class) {
                INSTANCE = new Mgr05();
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
