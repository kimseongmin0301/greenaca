package inheritance;

public class Tvtest {
    public static void main(String[] args) {
        CaptionTv t = new CaptionTv();
        t.channel=10;
        t.chUp();
        System.out.println(t.channel);
        t.displayCaption("자막봄1");
        t.caption=true;
        t.displayCaption("자막봄2");
    }
}
