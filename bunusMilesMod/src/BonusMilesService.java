public class BonusMilesService {
    public int calculate(int amountTicket, int rub){

        int miles = amountTicket / rub;
        return miles;
    }
}
