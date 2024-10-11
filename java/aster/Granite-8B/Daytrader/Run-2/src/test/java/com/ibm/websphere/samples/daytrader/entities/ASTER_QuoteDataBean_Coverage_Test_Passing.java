/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_VOCt0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setSymbol("symbol");
    int hash = quoteDataBean.hashCode();
    assertEquals(0, hash);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode2_AJue1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 0.0, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, 0.0);
    int hash = quoteDataBean.hashCode();
    assertEquals(0, hash);
}
}