package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long cash = 0;
        for (long sale : sales) {
            cash += sale;
        }
        return cash;
    }

    public long average(long[] sales) {
        long ave = 0;
        for (long sale : sales) {
            ave += sale;
        }
        return ave / 12;
    }

    public int maxSalesMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1;
    }

    public int minSalesMonth(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;
    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        long ave = average(sales);
        for (long sale : sales) {
            if (sale > ave) {
                count++;
            }
        }
        return count;
    }

    public int belowAverage(long[] sales) {
        int count = 0;
        long ave = average(sales);
        for (long sale : sales) {
            if (sale < ave) {
                count++;
            }
        }
        return count;


    }
}

