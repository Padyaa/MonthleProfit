import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sum(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverege() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.average(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSalesMonth(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSalesMonth(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.aboveAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.belowAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
