package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {


        CashbackHackService service = new CashbackHackService();

        @Test
        public void amountLess1000() {

            int actual = service.remain(536);
            int expected = 464;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void amountMore1000() {

            int actual = service.remain(1536);
            int expected = 464;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void amount1000() {

            int actual = service.remain(1000);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void amountLittleLess1000() {

            int actual = service.remain(999);
            int expected = 1;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void amountLittleMore1000() {

            int actual = service.remain(2001);
            int expected = 999;

            Assert.assertEquals(actual, expected);
        }


    }