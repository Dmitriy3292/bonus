public class CreditService {
    public double calculate(int creditTerm) {
        int sumCredit = 1_000_000;
        double percent = 9.99;
//расчет месячного процента
        double monthlyRate = percent / 100 / 12;
// расчет участка формулы с возведением в степень
        double b = 1 + monthlyRate;
        double x = Math.pow(b, creditTerm);
        //делим формулу на верхнуюю и нижнюю часть
        double down = x - 1;
        double top = monthlyRate / down;
        double middle = monthlyRate + top;
        double payment = sumCredit * middle;
        return payment;
    }
}
