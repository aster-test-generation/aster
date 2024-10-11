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

public class Aster_HoldingData_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchaseDate_qSmw0() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = holdingData.getPurchaseDate();
    assertNotNull(purchaseDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchaseDateWithValidDate_JOsk3() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = holdingData.getPurchaseDate();
    assertNull(new Date(123456789));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_fzoY0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = holdingData.getGain();
    assertNull(BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithPositiveValue_PQMY1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = holdingData.getGain();
    assertNull(BigDecimal.valueOf(100));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchaseDateWithValidDate_JOsk3_fid2() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = holdingData.getPurchaseDate();
    assertEquals(new Date(123456789), purchaseDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_fzoY0_fid2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = holdingData.getGain();
    assertEquals(BigDecimal.ZERO, gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithPositiveValue_PQMY1_fid2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = holdingData.getGain();
    assertEquals(BigDecimal.valueOf(100), gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithNegativeValue_xoTc2_fid2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = holdingData.getGain();
    assertEquals(BigDecimal.valueOf(-100), gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketValue_TmMy0_fid2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = holdingData.getMarketValue();
    assertEquals(new BigDecimal(100.0), marketValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingID_wrvD0() {
    HoldingData holdingData = new HoldingData();
    Integer holdingID = holdingData.getHoldingID();
    assertNotNull(holdingID);
    assertEquals(holdingID, 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchasePrice_JsKt0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = holdingData.getPurchasePrice();
    assertEquals(BigDecimal.ZERO, purchasePrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPurchasePriceWithValidValue_isDj4() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = holdingData.getPurchasePrice();
    assertEquals(BigDecimal.valueOf(100), purchasePrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_NaNInput_YLqZ6() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = new BigDecimal(Double.NaN);
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_InfinityInput_ZuOP7() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = new BigDecimal(Double.POSITIVE_INFINITY);
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_NegativeInfinityInput_YAHg8() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = new BigDecimal(Double.NEGATIVE_INFINITY);
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithInvalidValue_EftS4() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal(100.0);
    holdingData.setGain(gain);
    assertNotEquals(gain, holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_NaN_Zzqi7() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal(Double.NaN);
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_Infinity_HVBl8() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal(Double.POSITIVE_INFINITY);
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_NegativeInfinity_BXGK9() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal(Double.NEGATIVE_INFINITY);
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_Invalid_lbli11() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal(100);
    holdingData.setBasis(basis);
    assertNotEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasis_qcqm0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertNotNull(basis);
    assertEquals(BigDecimal.ZERO, basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasisWithPositiveValue_rxXB1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertNotNull(basis);
    assertEquals(BigDecimal.valueOf(100), basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasisWithNegativeValue_xLHa2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertNotNull(basis);
    assertEquals(BigDecimal.valueOf(-100), basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithInfinity_tUvm6() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(Double.POSITIVE_INFINITY);
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithNaN_YnIv7() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(Double.NaN);
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithInfinityAndNaN_STEw9() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(Double.POSITIVE_INFINITY);
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
    marketValue = new BigDecimal(Double.NaN);
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingID_wrvD0_1_fid3() {
    HoldingData holdingData = new HoldingData();
    Integer holdingID = holdingData.getHoldingID();
    assertNotNull(holdingID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingID_wrvD0_2() {
    HoldingData holdingData = new HoldingData();
    Integer holdingID = holdingData.getHoldingID();
    assertEquals(holdingID, 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasis_qcqm0_1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertNotNull(basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasis_qcqm0_2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertEquals(BigDecimal.ZERO, basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasisWithPositiveValue_rxXB1_2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertEquals(BigDecimal.valueOf(100), basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBasisWithNegativeValue_xLHa2_2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = holdingData.getBasis();
    assertEquals(BigDecimal.valueOf(-100), basis);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithInfinityAndNaN_STEw9_1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(Double.POSITIVE_INFINITY);
    holdingData.setMarketValue(marketValue);
    marketValue = new BigDecimal(Double.NaN);
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteID_WqPa1_upDc0_1() {
    HoldingData holdingData = new HoldingData();
    String quoteID = holdingData.getQuoteID();
    assertNotNull(quoteID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteID_WqPa1_upDc0_2() {
    HoldingData holdingData = new HoldingData();
    String quoteID = holdingData.getQuoteID();
    assertEquals("", quoteID);
  }
}