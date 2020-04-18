package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfamountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfamountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn900IfamountIs1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfAmountIs0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cashbackHackService.remain(amount);
        });
    }
}