/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import java.math.BigDecimal;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FinancialUtils_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeHoldingsTotalNullInput_EbMY0() {
        Collection<?> holdingDataBeans = null;
        BigDecimal result = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
        assertEquals(new BigDecimal(0.0).setScale(FinancialUtils.SCALE), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeHoldingsTotalEmptyCollection_HyYU1() {
        Collection<?> holdingDataBeans = new ArrayList<>();
        BigDecimal result = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
        assertEquals(new BigDecimal(0.0).setScale(FinancialUtils.SCALE), result);
}
}