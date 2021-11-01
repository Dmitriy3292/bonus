import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1200;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = (replenishment / 100) ;
        }
        System.out.println(balance = balance + replenishment + bonus);
        System.out.println("Бонус: " + bonus);

    }



}
