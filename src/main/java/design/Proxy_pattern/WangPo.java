package design.Proxy_pattern;


public class WangPo implements Women {
    private PanJinLian panJinLian;

    public WangPo(PanJinLian panJinLian) {
        this.panJinLian = panJinLian;
    }

    @Override
    public void lookOther() {
        panJinLian.lookOther();
    }

    @Override
    public void happy() {
        panJinLian.happy();
    }
}
