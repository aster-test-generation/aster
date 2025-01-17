/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_UVxn0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expectedPrice = BigDecimal.ZERO; // Assuming default price is ZERO
    assertNull(expectedPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasis_lIMi0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default basis is ZERO, adjust as per actual default value
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_sXtD0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default gain is zero if not set
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchasePrice_vgEe0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default value is set to ZERO
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_vIuo0_JxNd0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expectedPrice = new BigDecimal("100.00");
    holdingData.setPrice(expectedPrice);
    assertNull(expectedPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainHTML_Dtex0_fid1() {
    HoldingData holdingData = new HoldingData();
    String result = holdingData.getGainHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_UVxn0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expectedPrice = BigDecimal.ZERO; // Assuming default price is ZERO
    assertEquals(expectedPrice, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketValue_NXmF0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = new BigDecimal("100.00");
    assertEquals(expected, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasis_lIMi0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default basis is ZERO, adjust as per actual default value
    assertEquals(expected, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_sXtD0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default gain is zero if not set
    assertEquals(expected, holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchasePrice_vgEe0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO; // Assuming default value is set to ZERO
    assertEquals(expected, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_vIuo0_JxNd0_fid1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expectedPrice = new BigDecimal("100.00");
    holdingData.setPrice(expectedPrice);
    assertEquals(expectedPrice, holdingData.getPurchasePrice());
  }
}