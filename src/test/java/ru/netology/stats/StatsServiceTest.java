package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void testGetSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 180;
        long actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetSalesAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 15;
        long actual = service.getSalesAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetMaximumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 8;
        long actual = service.getMaximumSalesMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetMinimumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 9;
        long actual = service.getMinimumSalesMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 5;
        long actual = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 5;
        long actual = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

}