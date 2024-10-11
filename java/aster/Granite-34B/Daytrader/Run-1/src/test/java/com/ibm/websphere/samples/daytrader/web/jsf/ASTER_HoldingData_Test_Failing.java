/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuantityWithNegativeValue_nKtO2() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(-100.0);
        double actual = holdingData.getQuantity();
        double expected = -100.0;
        assertEquals(expected, actual, -100.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteID_DgZu0() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertEquals(quoteID, "expectedValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithBoundaryValues_xQvn6() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertNotNull(quoteID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithException_Jnqb7() {
        HoldingData holdingData = new HoldingData();
        try {
            String quoteID = holdingData.getQuoteID();
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("java.lang.Exception", e.getClass().getName());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuantityWithNegativeValue_nKtO2_fid1() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(-100.0);
        double actual = holdingData.getQuantity();
        double expected = 0.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithEmpty_cBAK2_fid1() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertEquals("", quoteID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithValidValue_sRjG3_fid1() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertEquals("12345", quoteID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithMultipleValues_laPD5() {
        HoldingData holdingData1 = new HoldingData();
        String quoteID1 = holdingData1.getQuoteID();
        HoldingData holdingData2 = new HoldingData();
        String quoteID2 = holdingData2.getQuoteID();
        assertNotEquals(quoteID1, quoteID2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteIDWithBoundaryValues_xQvn6_fid1() {
        HoldingData holdingData = new HoldingData();
        String quoteID = holdingData.getQuoteID();
        assertTrue(quoteID.length() >= 0 && quoteID.length() <= 255);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDate_afbo0() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = holdingData.getPurchaseDate();
        assertNotNull(purchaseDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getGainHTMLTest_ZAmw3() {
        HoldingData hd = new HoldingData();
        hd.setGain(null);
        String actual = hd.getGainHTML();
        String expected = FinancialUtils.printGainHTML(null);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBasisWithNegativeValue_IFZU2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal basis = new BigDecimal("-100.00");
        try {
            holdingData.setBasis(basis);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Basis cannot be negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDLength_eurO3() {
        HoldingData holdingData = new HoldingData();
        String quoteID = "12345678901234567890123456789012345678901234567890";
        holdingData.setQuoteID(quoteID);
        assertEquals(quoteID.substring(0, 30), holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDInvalid_WuhZ4() {
        HoldingData holdingData = new HoldingData();
        String quoteID = "Invalid ID";
        try {
            holdingData.setQuoteID(quoteID);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid quote ID format", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMarketValue_EdZY0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = holdingData.getMarketValue();
        assertNotNull(marketValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMarketValue_zeroValue_Tcbr1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = holdingData.getMarketValue();
        assertEquals(BigDecimal.ZERO, marketValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBasis_jwPA0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getBasis();
        assertEquals(new BigDecimal(100), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBasis_zeroBasis_FmMN1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getBasis();
        assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBasis_negativeBasis_ecLX2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getBasis();
        assertEquals(new BigDecimal(-100), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_WHQP0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getGain();
        assertEquals(new BigDecimal("100.00"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainWithZeroGain_bSLU2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getGain();
        assertEquals(new BigDecimal("0.00"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainWithNegativeGain_DhGK3() {
        HoldingData holdingData = new HoldingData();
        BigDecimal result = holdingData.getGain();
        assertEquals(new BigDecimal("-100.00"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingIDWithNullObject_Pneg1() {
        HoldingData holdingData = null;
        Integer actual = holdingData.getHoldingID();
        Integer expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePrice_zjvy0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertNotNull(purchasePrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithZeroValue_BvTa1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertEquals(BigDecimal.ZERO, purchasePrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithNegativeValue_rBvY2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertTrue(purchasePrice.compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithPositiveValue_ooll3() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertTrue(purchasePrice.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithMaxPositiveValue_nBFc4() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertEquals(new BigDecimal("9999999999999999999999999999999999999999"), purchasePrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithMinNegativeValue_FwDz5() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertEquals(new BigDecimal("-9999999999999999999999999999999999999999"), purchasePrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithRandomValue_ncqb6_1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertTrue(purchasePrice.compareTo(new BigDecimal("10000000000000000000000000000000000000000")) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithRandomValue_ncqb6_2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertTrue(purchasePrice.compareTo(new BigDecimal("-10000000000000000000000000000000000000000")) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithRandomValue_ncqb6() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
        assertTrue(purchasePrice.compareTo(new BigDecimal("10000000000000000000000000000000000000000")) < 0);
        assertTrue(purchasePrice.compareTo(new BigDecimal("-10000000000000000000000000000000000000000")) > 0);
    }
}