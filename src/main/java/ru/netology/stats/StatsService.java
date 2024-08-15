package ru.netology.stats;

//сумма всех продаж
public class StatsService {
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long averageSales = sum / 12;
        return averageSales;
    }

    //номер месяца, в котором был пик продаж
    public long maxSales(long[] sales) {
        long maxMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж
    public long minSales(long[] sales) {
        long minMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public long salesBelowAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long averageSales = sum / 12;
        long n = 0;
        long average = averageSales;
        for (long sale : sales) {
            if (sale < average) {
                n++;
            }
        }
        return n;
    }

    //количество месяцев, в которых продажи были выше среднего
    public long salesAboveAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long averageSales = sum / 12;
        long n = 0;
        long average = averageSales;
        for (long sale : sales) {
            if (sale > average) {
                n++;
            }
        }
        return n;
    }
}
