package ru.netology.stats;

//сумма всех продаж
public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / 12;
        return averageSales;
    }

    //номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / 12;
        int n = 0;
        int average = averageSales;
        for (int sale : sales) {
            if (sale < average) {
                n++;
            }
        }
        return n;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int salesAboveAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / 12;
        int n = 0;
        int average = averageSales;
        for (int sale : sales) {
            if (sale > average) {
                n++;
            }
        }
        return n;
    }
}
