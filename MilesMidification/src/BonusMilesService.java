public class BonusMilesService {
    public int calculate(int price)

    {
        int rub = 20;

        int miles = (price / rub);
        return miles;
    }
}