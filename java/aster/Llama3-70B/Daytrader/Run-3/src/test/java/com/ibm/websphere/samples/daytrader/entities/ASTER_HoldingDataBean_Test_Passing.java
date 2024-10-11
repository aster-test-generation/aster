/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HoldingDataBean_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuoteID_QuoteNotNull_wJiA0() {
    QuoteDataBean quote = new QuoteDataBean("symbol");
    HoldingDataBean holding = new HoldingDataBean(0, BigDecimal.ZERO, new Date(), null, quote);
    assertEquals("symbol", holding.getQuoteID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuoteID_QuoteNull_pBFs1() {
    HoldingDataBean holding = new HoldingDataBean(1, BigDecimal.ONE, new Date(), null, null);
    holding.setQuoteID("quoteID");
    assertEquals("quoteID", holding.getQuoteID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuote_ktQM0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("10.0"), new Date(), account, quote);
    QuoteDataBean result = holding.getQuote();
    assertEquals(quote, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccount_NWyK0() {
    HoldingDataBean holding = new HoldingDataBean();
    AccountDataBean account = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    holding.setAccount(account);
    Assertions.assertEquals(account, holding.getAccount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPurchaseDate_wHGd0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    Date purchaseDate = new Date();
    holdingDataBean.setPurchaseDate(purchaseDate);
    assertEquals(purchaseDate, holdingDataBean.getPurchaseDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPurchasePrice_IhSZ0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    BigDecimal purchasePrice = new BigDecimal("10.0");
    holdingDataBean.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuantity_XZbq0() {
    AccountDataBean account = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("50.0"), new BigDecimal("40.0"), new BigDecimal("30.0"), new BigDecimal("20.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("50.0"), new Date(), account, quote);
    assertEquals(10.0, holding.getQuantity(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_PXyZ0() {
    AccountDataBean account = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("50.0"), new BigDecimal("50.0"), new BigDecimal("50.0"), new BigDecimal("50.0"), 0.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("50.0"), new Date(), account, quote);
    String expected = "\n\tHolding Data for holding: " + holding.getHoldingID() + "\n\t\t      quantity:" + holding.getQuantity() + "\n\t\t purchasePrice:" + holding.getPurchasePrice() + "\n\t\t  purchaseDate:" + holding.getPurchaseDate() + "\n\t\t       quoteID:" + holding.getQuote().getSymbol();
    assertEquals(expected, holding.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuantity_uEEM0() {
    HoldingDataBean holding = new HoldingDataBean();
    holding.setQuantity(10.0);
    assertEquals(10.0, holding.getQuantity(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingID_lbEH0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setHoldingID(1);
    assertEquals(1, holdingDataBean.getHoldingID().intValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPurchaseDate_wfkM0() {
    AccountDataBean account = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("50.0"), new BigDecimal("40.0"), new BigDecimal("30.0"), new BigDecimal("20.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("50.0"), new Date(), account, quote);
    assertEquals(new Date(), holding.getPurchaseDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_1() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_2() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding.getHoldingID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_3() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertTrue(holding.getQuantity() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_4() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding.getPurchasePrice());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_5() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding.getPurchaseDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0_6() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding.getQuoteID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrint_Qmrq0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("10.0"), new Date(), account, quote);
    holding.print();
    assertEquals("HoldingDataBean[quantity=10.0, purchasePrice=10.0, purchaseDate=" + holding.getPurchaseDate() + ", account=" + holding.getAccount().toString() + ", quote=" + holding.getQuote().toString() + "]", holding.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuote_NamD0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    holdingDataBean.setQuote(quoteDataBean);
    assertSame(quoteDataBean, holdingDataBean.getQuote());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuoteID_kWFS0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setQuoteID("ABC");
    assertEquals("ABC", holdingDataBean.getQuoteID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccount_bSRL0_1() {
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(10.0), new BigDecimal(9.0), new BigDecimal(8.0), new BigDecimal(11.0), 1.0);
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal(10.0), new Date(), account, quote);
    AccountDataBean result = holding.getAccount();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccount_bSRL0_2() {
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(10.0), new BigDecimal(9.0), new BigDecimal(8.0), new BigDecimal(11.0), 1.0);
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal(10.0), new Date(), account, quote);
    AccountDataBean result = holding.getAccount();
    assertEquals(account.getProfileID(), result.getProfileID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPurchasePrice_QNiN0() {
    AccountDataBean account = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("50.0"), new BigDecimal("40.0"), new BigDecimal("30.0"), new BigDecimal("20.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("50.0"), new Date(), account, quote);
    assertEquals(new BigDecimal("50.0"), holding.getPurchasePrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToHTML_wdlP0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100, new BigDecimal(100), new BigDecimal(100), new BigDecimal(100), new BigDecimal(100), 1);
    HoldingDataBean holding = new HoldingDataBean(10, new BigDecimal(100), new Date(), account, quote);
    String expected = "<BR>Holding Data for holding: " + holding.getHoldingID() + "</B>" + "<LI>      quantity:" + holding.getQuantity() + "</LI>" + "<LI> purchasePrice:" + holding.getPurchasePrice() + "</LI>" + "<LI>  purchaseDate:" + holding.getPurchaseDate() + "</LI>" + "<LI>       quoteID:" + holding.getQuoteID() + "</LI>";
    assertEquals(expected, holding.toHTML());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withoutHoldingID_YAdo1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    int expected = 0;
    int actual = holdingDataBean.hashCode();
    assert expected == actual;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_lIJb0() {
    HoldingDataBean holding = new HoldingDataBean();
    assertTrue(holding.equals(holding));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_FhpN1() {
    QuoteDataBean quote = new QuoteDataBean("symbol");
    HoldingDataBean holding = new HoldingDataBean();
    assertFalse(holding.equals(quote));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_bEBX2() {
    HoldingDataBean holding1 = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), new AccountDataBean(1, 1, 1, new Date(), new Date(), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), "profileID"), new QuoteDataBean("symbol"));
    HoldingDataBean holding2 = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), new AccountDataBean(1, 1, 1, new Date(), new Date(), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), "profileID"), new QuoteDataBean("symbol"));
    assertTrue(holding1.equals(holding2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHoldingID_lmmx0_ijQF0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal("10.0"), new Date(), account, quote);
    assertEquals(null, holding.getHoldingID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_tdoC0() {
    HoldingDataBean holding = HoldingDataBean.getRandomInstance();
    assertNotNull(holding);
    assertNotNull(holding.getHoldingID());
    assertTrue(holding.getQuantity() > 0);
    assertNotNull(holding.getPurchasePrice());
    assertNotNull(holding.getPurchaseDate());
    assertNotNull(holding.getQuoteID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccount_bSRL0() {
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(10.0), new BigDecimal(9.0), new BigDecimal(8.0), new BigDecimal(11.0), 1.0);
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
    HoldingDataBean holding = new HoldingDataBean(10.0, new BigDecimal(10.0), new Date(), account, quote);
    AccountDataBean result = holding.getAccount();
    assertNotNull(result);
    assertEquals(account.getProfileID(), result.getProfileID());
}
}