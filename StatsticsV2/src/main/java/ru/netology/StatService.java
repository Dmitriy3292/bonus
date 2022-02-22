package ru.netology;

public class StatService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int avgMinSales(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < calcAvg(sales)) {
                month++;

            }

        }

        return month;
    }

    public int avgMaxSales(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale > calcAvg(sales)) {
                month++;

            }

        }

        return month;
    }
}
