/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuoteID_lrMv0() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertNotNull(quoteID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_CSmy0() {
        HoldingData holdingData = new HoldingData();
        String expectedGainHTML = FinancialUtils.printGainHTML(holdingData.getGain());
        String actualGainHTML = holdingData.getGainHTML();
        assertEquals(expectedGainHTML, actualGainHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMarketValue_IXuk0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = holdingData.getMarketValue();
        assertNotNull(marketValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingID_tCit0() {
        HoldingData holdingData = new HoldingData();
        Integer holdingID = holdingData.getHoldingID();
        assertNotNull(holdingID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetGain_oeeS0_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal expectedGain = BigDecimal.ZERO; // Replace with the expected value
        BigDecimal actualGain = holdingData.getGain();
        assertEquals(expectedGain, actualGain);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPurchasePrice_YemS0_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        Assertions.assertNotNull(purchasePrice);
    }
}