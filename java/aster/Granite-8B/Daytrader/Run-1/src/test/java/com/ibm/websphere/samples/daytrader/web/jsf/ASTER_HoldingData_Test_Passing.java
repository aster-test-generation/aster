/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantity_uhEy0() {
        HoldingData holdingData = new HoldingData();
        double quantity = holdingData.getQuantity();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantityWithZeroQuantity_yTsX1() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(0);
        double quantity = holdingData.getQuantity();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantityWithNegativeQuantity_TjbF2() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(-10);
        double quantity = holdingData.getQuantity();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantityWithPositiveQuantity_BPdC3() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(10);
        double quantity = holdingData.getQuantity();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice_GYZY0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = new BigDecimal(100.0);
        holdingData.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingData.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_ndtG0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal price = new BigDecimal("100.00");
        holdingData.setPrice(price);
        assertEquals(price, holdingData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDate_qFFA0() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date();
        holdingData.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holdingData.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithNullPurchaseDate_UAYM1() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = null;
        holdingData.setPurchaseDate(purchaseDate);
        assertNull(holdingData.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithFuturePurchaseDate_vbYp2_1() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() + 86400000); // 1 day from now
        holdingData.setPurchaseDate(purchaseDate);
        assertNotNull(holdingData.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithFuturePurchaseDate_vbYp2_2() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() + 86400000); // 1 day from now
        holdingData.setPurchaseDate(purchaseDate);
        assertTrue(holdingData.getPurchaseDate().after(new Date()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithPastPurchaseDate_DNkc3_1() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() - 86400000); // 1 day ago
        holdingData.setPurchaseDate(purchaseDate);
        assertNotNull(holdingData.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithPastPurchaseDate_DNkc3_2() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() - 86400000); // 1 day ago
        holdingData.setPurchaseDate(purchaseDate);
        assertTrue(holdingData.getPurchaseDate().before(new Date()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBasis_Tnal0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal basis = new BigDecimal(100);
        holdingData.setBasis(basis);
        assertEquals(basis, holdingData.getBasis());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDate_KJCk0() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date();
        holdingData.setPurchaseDate(purchaseDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGain_xenu0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal gain = new BigDecimal("100.00");
        holdingData.setGain(gain);
        assertEquals(gain, holdingData.getGain());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainWithZeroGain_Pvyj2() {
        HoldingData holdingData = new HoldingData();
        BigDecimal gain = BigDecimal.ZERO;
        holdingData.setGain(gain);
        assertEquals(gain, holdingData.getGain());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainWithNegativeGain_zZmA3() {
        HoldingData holdingData = new HoldingData();
        BigDecimal gain = new BigDecimal("-100.00");
        holdingData.setGain(gain);
        assertEquals(gain, holdingData.getGain());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainWithNullGain_RcZk4() {
        HoldingData holdingData = new HoldingData();
        BigDecimal gain = null;
        holdingData.setGain(gain);
        assertEquals(gain, holdingData.getGain());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetGain_oeeS0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal expectedGain = BigDecimal.ZERO; // Replace with the expected value
        BigDecimal actualGain = holdingData.getGain();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketValue_uuvY0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal marketValue = new BigDecimal(100);
        holdingData.setMarketValue(marketValue);
        assertEquals(marketValue, holdingData.getMarketValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingID_ElSU0() {
        HoldingData holdingData = new HoldingData();
        Integer holdingID = 1;
        holdingData.setHoldingID(holdingID);
        assertEquals(holdingID, holdingData.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPurchasePrice_YemS0() {
        HoldingData holdingData = new HoldingData();
        BigDecimal purchasePrice = holdingData.getPurchasePrice();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithLargeValue_mSsK3_kHvj0() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(10000000000.5);
        assertEquals(10000000000.5, holdingData.getQuantity(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithSmallValue_MIxC4_aQkD0() {
        HoldingData holdingData = new HoldingData();
        holdingData.setQuantity(0.00000000001);
        assertEquals(0.00000000001, holdingData.getQuantity(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithFuturePurchaseDate_vbYp2() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() + 86400000); // 1 day from now
        holdingData.setPurchaseDate(purchaseDate);
        assertNotNull(holdingData.getPurchaseDate());
        assertTrue(holdingData.getPurchaseDate().after(new Date()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateWithPastPurchaseDate_DNkc3() {
        HoldingData holdingData = new HoldingData();
        Date purchaseDate = new Date(System.currentTimeMillis() - 86400000); // 1 day ago
        holdingData.setPurchaseDate(purchaseDate);
        assertNotNull(holdingData.getPurchaseDate());
        assertTrue(holdingData.getPurchaseDate().before(new Date()));
    }
}