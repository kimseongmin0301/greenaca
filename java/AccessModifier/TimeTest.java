package AccessModifier;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(1,10,10);
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}
