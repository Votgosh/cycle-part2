package ru.netology.stats;

public class StatsService {

    public int calculateAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverageAllSales(int[] sales) {
        double sum = calculateAllSales(sales);
        double averageAllSales = sum / sales.length;
        return averageAllSales;
    }

    public int calculateMaxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxSalesMonth] <= sales[i]) {
                maxSalesMonth = i;
            }
        }
        maxSalesMonth += 1;
        return maxSalesMonth;
    }

    public int calculateMinSalesMonth(int[] sales) {
        int minSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minSalesMonth] >= sales[i]) {
                minSalesMonth = i;
            }
        }
        minSalesMonth += 1;
        return minSalesMonth;
    }


    public int calculateMonthlySalesBelowAverage(int[] sales) {
        int numberMonths = 0;
        double averageSum = calculateAverageAllSales(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                numberMonths += 1;
            }

        }
        return numberMonths;
    }

    public int calculateMonthlySalesAboveAverage(int[] sales) {
        int numberMonths = 0;
        double averageSum = calculateAverageAllSales(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                numberMonths += 1;
            }

        }
        return numberMonths;
    }
}
