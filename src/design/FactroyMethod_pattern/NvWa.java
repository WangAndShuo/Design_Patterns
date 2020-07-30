package design.FactroyMethod_pattern;

public class NvWa {


    public static void main(String[] args) {
        LuZi luZi = new LuZi();

        Human human = luZi.createHuman(BaiRen.class);
        human.cry();
        human.laugh();
        human.talk();

        Human human1 = luZi.createHuman(HeiRen.class);
        human1.cry();
        human1.laugh();
        human1.talk();

        Human human2 = luZi.createHuman(HuangRen.class);
        human2.cry();
        human2.laugh();
        human2.talk();
    }
}
