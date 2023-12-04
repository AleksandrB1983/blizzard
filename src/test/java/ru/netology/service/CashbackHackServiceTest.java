package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void needToSpendToGetTheMinimumCashbackAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void theBorderValueIsOneUnitLessThanTheMinimumAmountToReceiveTheCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void borderValueIsEqualToTheValueOfTheMinimumAmountForReceivingCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void borderValueIsOneUnitHigherThanTheMinimumAmountToReceiveCashbackAndHowMuchYouHaveToPayToGetAdditionalCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

}