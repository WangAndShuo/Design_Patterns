package design.singleton_pattern;


/**
 * 饿汉式
 * 类加载到内存后，就是实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点，不管用到与否，类装载时就完成实例化(就是你不用还装我干啥)
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

}
