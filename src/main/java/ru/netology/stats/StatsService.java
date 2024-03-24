package ru.netology.stats;

public class StatsService {
    public long getSalesAmount(long[] sales) {
        long salesAmount = 0; // переменная для суммы всех продаж

        for (int i = 0; i < sales.length; i++) {
            salesAmount = salesAmount + sales[i]; // прибавляем значение следующей ячейки
        }
        return salesAmount; // возвращаем значение суммы всех продаж
    }


    public long getSalesAverage(long[] sales) {
        long salesAverage = getSalesAmount(sales) / sales.length; // переменная для средней суммы продаж в месяц
        return salesAverage; // возвращаем значение средней суммы продаж в месяц
    }


    public int getMaximumSalesMonth(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int getMinimumSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int getMonthsBelowAverage(long[] sales) {
        int monthsBelowAverage = 0; // кол-во месяцев ниже среднего

        for (long s : sales) {
            if (s < getSalesAverage(sales)) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }


    public int getMonthsAboveAverage(long[] sales) {
        int monthsAboveAverage = 0; // кол-во месяцев выше среднего

        for (long s : sales) {
            if (s > getSalesAverage(sales)) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
