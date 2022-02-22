public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 100;


  /*      int bonus;
        if (replenishment > 1000) {
          bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int itog = balance + replenishment + bonus;
        System.out.println(itog);
    }
}
*/
        int bonus2 = replenishment > 1000 ? replenishment / 100 : 0;
        int itog = balance + replenishment + bonus2;
        System.out.println(itog);
    }
}