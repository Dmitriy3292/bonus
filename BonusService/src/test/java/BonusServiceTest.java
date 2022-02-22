import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUnderLimitWithoutAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverLimitWithoutAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimitWithoutAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimitWithoutAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimitMinBonus() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100_00;
        boolean registered = false;
        long expected = 1;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}