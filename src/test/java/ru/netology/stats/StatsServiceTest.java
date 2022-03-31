package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {

    @Test
    void shouldCalculateAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = (int) service.calculateAverageAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthlySalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthlySalesBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthlySalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthlySalesAboveAverage(sales);
        assertEquals(expected, actual);
    }
}