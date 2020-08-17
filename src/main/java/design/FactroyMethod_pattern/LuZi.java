package design.FactroyMethod_pattern;

public class LuZi {
    public Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  human;
    }

}
