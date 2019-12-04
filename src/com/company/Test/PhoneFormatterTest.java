package com.company.Test;

import com.company.PhoneFormatter;
import org.junit.jupiter.api.*;

class PhoneFormatterTest {

    PhoneFormatter number = new PhoneFormatter();

    @BeforeEach
    void setUp() {
        number.setNum("56564-4-2-_#$%^&*()");
    }

    @Test
    void test9nums() {
        Assertions.assertEquals("565-644-562", number.phoneFormat("56564-4-562-"));
    }

    @Test
    void test14nums() {
        Assertions.assertEquals("000-034-233-242-34", number.phoneFormat("00-003423 324234"));
    }

    @Test
    void testNegativeNums() {
        Assertions.assertEquals("565-644-564-56", number.phoneFormat("-56564-4-564-5-6-"));
    }

    @Test
    void test() {
        Assertions.assertEquals("565-644-564-56-77", number.phoneFormat("56564-4-564-5-6-77"));
    }

    @Test
    void test7nums() {
        Assertions.assertEquals("565-64-42", number.phoneFormat(number.getNum()));
    }
}