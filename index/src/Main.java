public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double result = service.calculate(70, 1.83);
        System.out.println("Индекс массы тела " + result);

    }
}
