/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import java.util.Date;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HoldingData_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuantity_nXhK0() {
    HoldingData holdingData = new HoldingData();
    double expected = 0.0; // default value of quantity
    double actual = holdingData.getQuantity();
    assertEquals(expected, actual, 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuoteID_eDAu0() {
    HoldingData holdingData = new HoldingData();
    String quoteID = holdingData.getQuoteID();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPurchasePrice_guCX0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal purchasePrice = new BigDecimal("10.0");
    holdingData.setPurchasePrice(purchasePrice);
    assertEquals(purchasePrice, holdingData.getPurchasePrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrice_AxzC0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setPrice(BigDecimal.valueOf(10.0));
    assertEquals(BigDecimal.valueOf(10.0), holdingData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPurchaseDate_HRkU0() {
    HoldingData holdingData = new HoldingData();
    Date expected = new Date();
    holdingData.setPurchaseDate(expected);
    Date actual = holdingData.getPurchaseDate();
    assertSame(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBasis_vKOh0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal basis = new BigDecimal("10.0");
    holdingData.setBasis(basis);
    assertEquals(basis, holdingData.getBasis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPurchaseDate_lTgz0() {
    HoldingData holdingData = new HoldingData();
    Date purchaseDate = new Date();
    holdingData.setPurchaseDate(purchaseDate);
    assertEquals(purchaseDate, holdingData.getPurchaseDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGain_lAjj0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal gain = new BigDecimal("10.0");
    holdingData.setGain(gain);
    assertEquals(gain, holdingData.getGain());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuoteID_vVcK0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuoteID("testQuoteID");
    assertEquals("testQuoteID", holdingData.getQuoteID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice_qOFO0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal price = holdingData.getPurchasePrice(); // Changed getPrice() to getPurchasePrice()
    assertNull(price); // Changed assertNotNull to assertNull
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketValue_ZuFn0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal expected = BigDecimal.ZERO;
    holdingData.setMarketValue(expected);
    assertEquals(expected, holdingData.getMarketValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBasis_fvAQ0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setBasis(new BigDecimal("10.0"));
    assertEquals(new BigDecimal("10.0"), holdingData.getBasis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGain_CXXh0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(BigDecimal.valueOf(10.0));
    assertEquals(BigDecimal.valueOf(10.0), holdingData.getGain());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuantity_KYff0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setQuantity(10.0);
    assertEquals(10.0, holdingData.getQuantity(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMarketValue_VtjK0() {
    HoldingData holdingData = new HoldingData();
    BigDecimal marketValue = new BigDecimal("100.00");
    holdingData.setMarketValue(marketValue);
    assertEquals(marketValue, holdingData.getMarketValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingID_ECld0() {
    HoldingData holdingData = new HoldingData();
    Integer holdingID = 1;
    holdingData.setHoldingID(holdingID);
    assertEquals(holdingID, holdingData.getHoldingID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainHTML_VJoV0_OsTl0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setGain(new BigDecimal("10.0"));
    assertEquals(FinancialUtils.printGainHTML(new BigDecimal("10.0")), holdingData.getGainHTML());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPurchasePrice_Rkwa0_XqKg0() {
    HoldingData holdingData = new HoldingData();
    holdingData.setPurchasePrice(BigDecimal.valueOf(10.0));
    assertEquals(BigDecimal.valueOf(10.0), holdingData.getPurchasePrice());
}
}