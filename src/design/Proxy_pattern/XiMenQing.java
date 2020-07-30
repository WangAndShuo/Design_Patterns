package design.Proxy_pattern;

public class XiMenQing {



    public static void main(String[] args) {
        WangPo wangPo = new WangPo(new PanJinLian());
        wangPo.lookOther();
        wangPo.happy();
    }


}
