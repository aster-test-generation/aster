/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.jms.Topic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_TradeDirect_Coverage_Test_Failing {
  private Topic tradeBrokerTopic;
  private AsyncOrderSubmitter asyncOrderSubmitter;
  private ResultSet rs;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_jdQw0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Integer orderID = 123;
    boolean twoPhase = true;
    when(asyncOrderSubmitter.submitOrder(orderID, twoPhase)).thenReturn(null);
    Future<OrderDataBean> result = tradeDirect.completeOrderAsync(orderID, twoPhase);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ruXT0_1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = tradeDirect.updateQuotePriceVolume("ABC", new BigDecimal("1.5"), 1000.0);
    Assertions.assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ruXT0_2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = tradeDirect.updateQuotePriceVolume("ABC", new BigDecimal("1.5"), 1000.0);
    Assertions.assertEquals("ABC", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ruXT0_3() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = tradeDirect.updateQuotePriceVolume("ABC", new BigDecimal("1.5"), 1000.0);
    Assertions.assertEquals(new BigDecimal("1.5"), quoteDataBean.getChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ruXT0_4() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = tradeDirect.updateQuotePriceVolume("ABC", new BigDecimal("1.5"), 1000.0);
    Assertions.assertEquals(1000.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_BbtG0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getOrders("userID");
    assertNotNull(orderDataBeans);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_lCLE0_1() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(100.0);
    QuoteDataBean quoteData = tradeDirect.createQuote(symbol, companyName, price);
    Assertions.assertNotNull(quoteData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_lCLE0_2() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(100.0);
    QuoteDataBean quoteData = tradeDirect.createQuote(symbol, companyName, price);
    Assertions.assertEquals(symbol, quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_lCLE0_3() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(100.0);
    QuoteDataBean quoteData = tradeDirect.createQuote(symbol, companyName, price);
    Assertions.assertEquals(companyName, quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_lCLE0_4() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(100.0);
    QuoteDataBean quoteData = tradeDirect.createQuote(symbol, companyName, price);
    Assertions.assertEquals(price, quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_1() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertNotNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_2() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertEquals(userID, accountData.getProfileID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_3() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertEquals(openBalance, accountData.getOpenBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_4() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertEquals(openBalance, accountData.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_5() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertEquals(1, accountData.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_6() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertEquals(0, accountData.getLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_7() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertNotNull(accountData.getCreationDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0_8() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertNotNull(accountData.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin1_MpJZ0() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertNotNull(accountData);
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin2_IswT1() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals("userID", accountData.getProfileID());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin3_KEJq2() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals("password", accountData.getProfile().getPassword());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin4_YjXV3() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getLoginCount());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin5_xMqP4() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getLogoutCount());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin6_GuUu5() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getHoldings().size());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin7_OlaP6() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getOrders().size());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin8_omYz7() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getBalance().intValue());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin9_ZDxu8() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getOpenBalance().intValue());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin10_fmKq9() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("userID", "password");
      Assertions.assertEquals(0, accountData.getCreationDate().getTime());
    } catch (Exception e) {
      Assertions.fail("Exception thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_getOrderFee_vGfJ10() throws Exception {
    OrderDataBean orderData = new OrderDataBean();
    BigDecimal orderFee = orderData.getOrderFee();
    Assertions.assertNotNull(orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ruXT0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = tradeDirect.updateQuotePriceVolume("ABC", new BigDecimal("1.5"), 1000.0);
    Assertions.assertNotNull(quoteDataBean);
    Assertions.assertEquals("ABC", quoteDataBean.getSymbol());
    Assertions.assertEquals(new BigDecimal("1.5"), quoteDataBean.getChange());
    Assertions.assertEquals(1000.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_lCLE0() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(100.0);
    QuoteDataBean quoteData = tradeDirect.createQuote(symbol, companyName, price);
    Assertions.assertNotNull(quoteData);
    Assertions.assertEquals(symbol, quoteData.getSymbol());
    Assertions.assertEquals(companyName, quoteData.getCompanyName());
    Assertions.assertEquals(price, quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister1_CMFb0() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "testUser";
    String password = "testPassword";
    String fullname = "testFullname";
    String address = "testAddress";
    String email = "testEmail";
    String creditcard = "testCreditcard";
    BigDecimal openBalance = new BigDecimal(1000);
    AccountDataBean accountData = tradeDirect.register(userID, password, fullname, address, email, creditcard, openBalance);
    assertNotNull(accountData);
    assertEquals(userID, accountData.getProfileID());
    assertEquals(openBalance, accountData.getOpenBalance());
    assertEquals(openBalance, accountData.getBalance());
    assertEquals(1, accountData.getLoginCount());
    assertEquals(0, accountData.getLogoutCount());
    assertNotNull(accountData.getCreationDate());
    assertNotNull(accountData.getLastLogin());
  }
}