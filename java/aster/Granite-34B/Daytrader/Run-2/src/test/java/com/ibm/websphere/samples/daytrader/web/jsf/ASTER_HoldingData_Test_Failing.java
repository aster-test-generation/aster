/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBasis_bfNA0_1() {
        HoldingData holdingData = new HoldingData();
        holdingData.setBasis(null);
        BigDecimal expectedBasis = new BigDecimal("100.00");
        holdingData.setBasis(expectedBasis);
        assertNull(holdingData.getBasis());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithNullPurchasePrice_dnoQ3() {
        HoldingData holdingData = new HoldingData();
        holdingData.setPurchasePrice(null);
        assertNull(BigDecimal.ZERO);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_ooJv0_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal price = holdingData.getPrice();
        assertNotNull(price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPriceWithZeroValue_hxMn1_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal price = holdingData.getPrice();
        assertEquals(BigDecimal.ZERO, price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPriceWithPositiveValue_sgHC2_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal price = holdingData.getPrice();
        assertTrue(price.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPriceWithNegativeValue_DgPi3_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal price = holdingData.getPrice();
        assertTrue(price.compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMarketValue_VNkq0_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = holdingData.getMarketValue();
        assertNotNull(marketValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMarketValue_zeroValue_RJUI1_fid1() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = holdingData.getMarketValue();
        assertEquals(BigDecimal.ZERO, marketValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceWithNullPurchasePrice_dnoQ3_fid1() {
        HoldingData holdingData = new HoldingData();
        holdingData.setPurchasePrice(null);
        assertEquals(BigDecimal.ZERO, holdingData.getPurchasePrice());
    }
}