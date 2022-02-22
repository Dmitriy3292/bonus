public class BmiService {

    public double calculate(int weight, double growth) {


        double growthSquare = (growth * 2);

        double indexBody = weight / growthSquare;
        return indexBody;
    }
}
