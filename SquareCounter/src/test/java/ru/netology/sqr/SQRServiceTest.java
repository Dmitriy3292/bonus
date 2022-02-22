package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void squareСounter() {
        SQRService service = new SQRService();

        int expected = 21;

        int actual = service.squareСounter(100, 900);
        assertEquals(expected, actual);
    }
    @Test
    void squareСounterBordersLess() {
        SQRService service = new SQRService();

        int expected = 0;

        int actual = service.squareСounter(98, 99);
        assertEquals(expected, actual);
    }
    @Test
    void squareСounterBordersMore() {
        SQRService service = new SQRService();

        int expected = 0;

        int actual = service.squareСounter(9_802, 9_803);
        assertEquals(expected, actual);
    }
}