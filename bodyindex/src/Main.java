public class Main {
    public static void main(String[] args) {

       BmiService service = new BmiService();
       int wight = 68;
       double height = 3.3;
       double bmi = service.calculate(68,3.3);
        System.out.println(bmi);
    }
}
