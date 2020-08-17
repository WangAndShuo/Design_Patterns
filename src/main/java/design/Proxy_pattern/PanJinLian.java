package design.Proxy_pattern;

import design.Proxy_pattern.Women;

public class PanJinLian implements Women {
    @Override
    public void lookOther() {
        System.out.println("潘金莲跟西门庆抛媚眼");
    }

    @Override
    public void happy() {
        System.out.println("潘金莲跟西门庆happy。。。。。");
    }
}
