/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue_QCaM0() {
        QuoteDataBean bean = new QuoteDataBean("AAPL");
        assertTrue(bean.equals(bean));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject_ReturnsFalse_LQZR1() {
        QuoteDataBean bean = new QuoteDataBean("AAPL");
        assertFalse(bean.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse_xChz2() {
        QuoteDataBean bean = new QuoteDataBean("AAPL");
        assertFalse(bean.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameSymbol_ReturnsTrue_MCKk3() {
        QuoteDataBean bean1 = new QuoteDataBean("AAPL");
        QuoteDataBean bean2 = new QuoteDataBean("AAPL");
        assertTrue(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentSymbols_ReturnsFalse_PouN4() {
        QuoteDataBean bean1 = new QuoteDataBean("AAPL");
        QuoteDataBean bean2 = new QuoteDataBean("GOOG");
        assertFalse(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SymbolNull_ReturnsFalse_EOfO5() {
        QuoteDataBean bean1 = new QuoteDataBean("AAPL");
        QuoteDataBean bean2 = new QuoteDataBean(null);
        assertFalse(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SymbolNotEquals_ReturnsFalse_ssGS6_gWhd0_1() {
    QuoteDataBean bean1 = new QuoteDataBean("AAPL");
    QuoteDataBean bean2 = new QuoteDataBean("AAPL");
    QuoteDataBean bean3 = new QuoteDataBean("GOOG");
    assertTrue(bean1.equals(bean2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SymbolNotEquals_ReturnsFalse_ssGS6_gWhd0_2() {
    QuoteDataBean bean1 = new QuoteDataBean("AAPL");
    QuoteDataBean bean2 = new QuoteDataBean("AAPL");
    QuoteDataBean bean3 = new QuoteDataBean("GOOG");
    assertFalse(bean1.equals(bean3));}
}