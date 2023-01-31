package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain200() {
        int amount = 700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void testRemain1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
    @Test
    public void testRemain999() {
        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (actual, expected);
    }
}