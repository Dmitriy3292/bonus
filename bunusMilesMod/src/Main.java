public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(100,20);
        System.out.println(miles);
    }
}