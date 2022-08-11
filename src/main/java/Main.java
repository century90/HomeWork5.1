import jdk.jfr.Registered;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService ();
        int expected;
        int actual;
        long bonus = service.calculate (1000, true);
        System.out.println(bonus);
    }

}
