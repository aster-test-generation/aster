/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingData_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuantityTest_VOQj0() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100.0);
    double actual = hd.getQuantity();
    double expected = 100.0;
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPurchaseDate_oHsi0() {
    HoldingData hd = new HoldingData();
    Date purchaseDate = hd.getPurchaseDate();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchaseDate_ZxZW0() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = new Date();
    holdingData.setPurchaseDate(purchaseDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchaseDateWithNullParameter_kXkr1() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = null;
    holdingData.setPurchaseDate(purchaseDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getMarketValue_uHbl0() {
    HoldingData holdingData = new HoldingData();
    assertEquals(null, holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getMarketValue2_kwlF1() {
    HoldingData holdingData = new HoldingData();
    holdingData.setMarketValue(new BigDecimal(100));
    assertEquals(new BigDecimal(100), holdingData.getMarketValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingID_HwDC0() {
    HoldingData holdingData = new HoldingData();
    Integer holdingID = 1;
    holdingData.setHoldingID(holdingID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_OFae0() {
    HoldingData hd = new HoldingData();
    hd.setPrice(new BigDecimal("100.00"));
    assertEquals(new BigDecimal("100.00"), hd.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceZeroValue_tEDS1() {
    HoldingData hd = new HoldingData();
    hd.setPrice(new BigDecimal("0.00"));
    assertEquals(new BigDecimal("0.00"), hd.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_RtwM0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal("1.00");
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_zeroValue_bLEy1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = BigDecimal.ZERO;
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBasis_nullValue_EPdI2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = null;
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPurchasePrice_Eheo0() {
    HoldingData hd = new HoldingData();
    hd.setPurchasePrice(new BigDecimal("100.00"));
    assertEquals(new BigDecimal("100.00"), hd.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPurchasePrice_null_pdAu1() {
    HoldingData hd = new HoldingData();
    hd.setPurchasePrice(null);
    assertNull(hd.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_csrQ0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = new BigDecimal(100.0);
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPriceWithNull_iKcH1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = null;
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPriceWithNegativeValue_jcNO2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = new BigDecimal(-100.0);
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPriceWithZeroValue_xTmO3() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = BigDecimal.ZERO;
    holdingData.setPrice(price);
    assertEquals(price, holdingData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValue_pLLu0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(100.0);
    holdingData.setMarketValue(marketValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithZeroValue_rXeU1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = BigDecimal.ZERO;
    holdingData.setMarketValue(marketValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketValueWithNegativeValue_czaF2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal(-100.0);
    holdingData.setMarketValue(marketValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithZeroInput_pUpk1() {
    HoldingData holdingData = new HoldingData();
    holdingData.setHoldingID(0);
    Integer result = holdingData.getHoldingID();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNegativeInput_LloQ2() {
    HoldingData holdingData = new HoldingData();
    holdingData.setHoldingID(-1);
    Integer result = holdingData.getHoldingID();
    assertEquals(-1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_pTOQ0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("ABC123");
    String actual = holdingData.getQuoteID();
    String expected = "ABC123";
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_nullValue_returnsNull_djlU1() {
    HoldingData holdingData = new HoldingData();
    String actual = holdingData.getQuoteID();
    org.junit.jupiter.api.Assertions.assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_emptyValue_returnsEmpty_kXXf2() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("");
    String actual = holdingData.getQuoteID();
    org.junit.jupiter.api.Assertions.assertEquals("", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_specialCharValue_returnsSpecialChar_iHBJ4() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("^&*@#$%");
    String actual = holdingData.getQuoteID();
    org.junit.jupiter.api.Assertions.assertEquals("^&*@#$%", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_length20Value_returnsLength20_WfWQ6() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("12345678901234567890");
    String actual = holdingData.getQuoteID();
    org.junit.jupiter.api.Assertions.assertEquals("12345678901234567890", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getQuoteID_length21Value_returnsLength20_WTRc7() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("123456789012345678901");
    String actual = holdingData.getQuoteID();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchasePrice_HeXK0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = new BigDecimal("100.00");
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchasePriceWithZeroValue_nxSK2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = BigDecimal.ZERO;
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchasePriceWithNegativeValue_aJWE3() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = new BigDecimal("-100.00");
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchasePriceWithNull_cZgb7() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = null;
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPurchasePriceWithMaxValue_QqIH12() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = BigDecimal.valueOf(Long.MAX_VALUE);
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGain_LvtV0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("100.00");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithZeroGain_ftbx1() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = BigDecimal.ZERO;
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNullGain_Bhdd2() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = null;
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNegativeGain_nbkH3() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("-100.00");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithMaxGain_CONC5() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = BigDecimal.valueOf(Long.MAX_VALUE);
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithMinGain_qgfy6() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = BigDecimal.valueOf(Long.MIN_VALUE);
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithDecimalGain_inUl7() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("100.50");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNegativeDecimalGain_vYXh8() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("-100.50");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithScientificNotationGain_gRet9() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("1.0E+10");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNegativeScientificNotationGain_wZvy10() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("-1.0E+10");
    holdingData.setGain(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_caez0() {
    HoldingData holdingData = new HoldingData();
    assertEquals(null, holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain1_FkDy1() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(0));
    assertEquals(new BigDecimal(0), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain2_VQfb2() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(1));
    assertEquals(new BigDecimal(1), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain3_XLkN3() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(10));
    assertEquals(new BigDecimal(10), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain4_EQrM4() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(100));
    assertEquals(new BigDecimal(100), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain5_TOVd5() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(1000));
    assertEquals(new BigDecimal(1000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain6_TpWu6() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(10000));
    assertEquals(new BigDecimal(10000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain7_fgER7() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(100000));
    assertEquals(new BigDecimal(100000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain8_sfWi8() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(1000000));
    assertEquals(new BigDecimal(1000000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain9_vrSx9() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(10000000));
    assertEquals(new BigDecimal(10000000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain10_hbRq10() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(100000000));
    assertEquals(new BigDecimal(100000000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain11_OkRp11() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(1000000000));
    assertEquals(new BigDecimal(1000000000), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain12_UBrK12() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(10000000000L));
    assertEquals(new BigDecimal(10000000000L), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain13_cLRF13() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(100000000000L));
    assertEquals(new BigDecimal(100000000000L), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain14_qwEB14() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(1000000000000L));
    assertEquals(new BigDecimal(1000000000000L), holdingData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithPositiveValue_zXbz0() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100.0);
    assertEquals(100.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithZeroValue_vnYX1() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(0.0);
    assertEquals(0.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithNegativeValue_jSHO2() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(-100.0);
    assertEquals(-100.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithPositiveDoubleValue_YivW3() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100.5);
    assertEquals(100.5, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithNegativeDoubleValue_jORv4() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(-100.5);
    assertEquals(-100.5, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithPositiveFloatValue_gjPj5() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100.5f);
    assertEquals(100.5, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithNegativeFloatValue_wJTg6() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(-100.5f);
    assertEquals(-100.5, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithPositiveLongValue_URFx7() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100L);
    assertEquals(100.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithNegativeLongValue_cesX8() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(-100L);
    assertEquals(-100.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithPositiveIntValue_CuVm9() {
    HoldingData hd = new HoldingData();
    hd.setQuantity(100);
    assertEquals(100.0, hd.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_withPositiveGain_TWFu0_EGyz0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal("100.0"));
    assertTrue(holdingData.getGainHTML().contains("100.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_withZeroGain_kgJP2_EPIt0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal(0.0));
    assertTrue(holdingData.getGainHTML().contains("0.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_withNegativeGain_DfHR1_OWaM0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(BigDecimal.valueOf(-50.0));
    assertTrue(holdingData.getGainHTML().contains("-50.0"));
  }
}