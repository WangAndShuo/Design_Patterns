package design.strategy_pattern;

public class JinNang {

    private FangFa fangFa;

    public JinNang(FangFa fangFa) {
        this.fangFa = fangFa;
    }

    public  void  sleeve(){
        fangFa.sleeve();
    }
}
