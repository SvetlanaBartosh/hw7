package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test//сумма всех продаж
    public void testSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test//средняя сумма продаж в месяц
    public void averageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test//номер месяца, в котором был пик продаж
    public void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test//номер месяца, в котором был минимум продаж
    public void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test//количество месяцев, в которых продажи были ниже среднего
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test//количество месяцев, в которых продажи были выше среднего
    public void salesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
