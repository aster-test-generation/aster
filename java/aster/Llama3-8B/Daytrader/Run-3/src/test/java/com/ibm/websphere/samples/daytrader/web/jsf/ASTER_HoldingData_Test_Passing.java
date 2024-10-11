/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HoldingData_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteID_fzhy0() {
        HoldingData holdingData = new HoldingData();
        String actual = holdingData.getQuoteID();
    assertNull(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice_EIlu0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = new BigDecimal("10.00");
        holdingData.setPurchasePrice(purchasePrice);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDate_wvoz0() {
        HoldingData holdingData = new HoldingData();
        Date date = new Date();
        holdingData.setPurchaseDate(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteID_FgKe0() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuoteID("TestQuoteID");
        assertEquals("TestQuoteID", holdingData.getQuoteID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_Vdim0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal expectedPrice = new BigDecimal("10.00");
        holdingData.setPrice(expectedPrice);
        BigDecimal actualPrice = holdingData.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketValue_ZySB0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal expectedMarketValue = new BigDecimal("100.00");
        holdingData.setMarketValue(expectedMarketValue);
        BigDecimal actualMarketValue = holdingData.getMarketValue();
        assertEquals(expectedMarketValue, actualMarketValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_ZWHe0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal expectedGain = new BigDecimal("10.0");
        holdingData.setGain(expectedGain);
        BigDecimal actualGain = holdingData.getGain();
        assertEquals(expectedGain, actualGain);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_Hhgg0() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(10.0);
        assertEquals(10.0, holdingData.getQuantity(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingID_WjMR0() {
        HoldingData holdingData = new HoldingData();
        Integer expected = null; // replace with your expected value
        Integer actual = holdingData.getHoldingID();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketValue_eXVO0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = new BigDecimal("100.00");
        holdingData.setMarketValue(marketValue);
        assertEquals(marketValue, holdingData.getMarketValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingID_uGfQ0() {
        HoldingData holdingData = new HoldingData();
        holdingData.setHoldingID(123);
        assertEquals(123, holdingData.getHoldingID());
    }
}