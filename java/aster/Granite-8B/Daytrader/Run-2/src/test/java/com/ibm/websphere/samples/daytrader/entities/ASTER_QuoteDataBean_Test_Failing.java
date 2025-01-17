/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_IWLu0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 123.45, new BigDecimal("100.00"), new BigDecimal("90.00"), new BigDecimal("80.00"), new BigDecimal("110.00"), 10.00);
        String expected = "\n\tQuote Data for: symbol1\n\t\t companyName: companyName1\n\t\t      volume: 123.45\n\t\t       price: 100.00\n\t\t        open1: 90.00\n\t\t         low: 80.00\n\t\t        high: 110.00\n\t\t      change1: 10.00";
        assertEquals(expected, quoteDataBean.toString());
    }
}