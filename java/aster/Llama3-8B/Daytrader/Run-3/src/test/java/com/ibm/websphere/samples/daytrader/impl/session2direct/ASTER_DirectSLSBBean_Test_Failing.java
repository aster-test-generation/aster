/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.Future;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Failing {
@Mock
    private TradeDirect tradeDirect;
private DirectSLSBBean directslsbbean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllQuotes_IdFs0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> quotes = directSLSBBean.getAllQuotes();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_pQgL0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<HoldingDataBean> holdings = directSLSBBean.getHoldings("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_QSki0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> orders = directSLSBBean.getOrders("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountData_UvCo0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean accountDataBean = directSLSBBean.getAccountData("userID");
        assertNotNull(accountDataBean);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_zwaH0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.logout("userID");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_mHPP0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> closedOrders = directSLSBBean.getClosedOrders("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_JNpg0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Future<OrderDataBean> result = directSLSBBean.completeOrderAsync(1, true);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetInSession_ReFj0_gzkt0() {
    DirectSLSBBean bean = new DirectSLSBBean();
    bean.setInSession(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLogin_uyZk0_iZJN0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        AccountDataBean accountDataBean = directSLSBBean.login("userID", "password");
        assertNull(accountDataBean);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompleteOrder_Eiov0_yHva0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Future<OrderDataBean> future = null;
    try {
        future = directSLSBBean.completeOrderAsync(1, true);
        OrderDataBean orderDataBean = future.get();
        assertNotNull(orderDataBean);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateQuotePriceVolume_DHaL0_UYNA0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        QuoteDataBean quoteDataBean = directSLSBBean.updateQuotePriceVolume("symbol", new BigDecimal("10.0"), 100.0);
        assertEquals("symbol", quoteDataBean.getSymbol());
        assertEquals(new BigDecimal("10.0"), quoteDataBean.getPrice());
        assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuote_clPB1_ENcb0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        QuoteDataBean quoteDataBean = directSLSBBean.getQuote("symbol");
        assertNotNull(quoteDataBean);
        assertEquals("symbol", quoteDataBean.getSymbol());
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateAccountProfile_Ikdc0_UItG0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    try {
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNull(updatedProfileData);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateQuote_Yyrc0_NQxQ0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "ABC";
    String companyName = "Company ABC";
    BigDecimal price = new BigDecimal("10.50");
    try {
        QuoteDataBean quoteDataBean = directSLSBBean.createQuote(symbol, companyName, price);
        assertNotNull(quoteDataBean);
        assertEquals(symbol, quoteDataBean.getSymbol());
        assertEquals(companyName, quoteDataBean.getCompanyName());
        assertEquals(price, quoteDataBean.getPrice());
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccountProfileData_pvLL0_Pobj0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        AccountProfileDataBean accountProfileDataBean = directSLSBBean.getAccountProfileData("userID");
        Assertions.assertNotNull(accountProfileDataBean);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuyAsync_KRuH1_dnRu0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(1, true);
    } catch (Exception e) {
        fail(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHolding_YiEK0_EqAi0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        HoldingDataBean holdingDataBean = directSLSBBean.getHolding(1);
        assertNotNull(holdingDataBean);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSellAsync_fryk1_LiRq0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        Future<OrderDataBean> orderDataBean = directSLSBBean.completeOrderAsync(1, true);
        assertNotNull(orderDataBean);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithException_OhWh1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.logout(null);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("userID cannot be null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLogin_uyZk0_iZJN0_fid1() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        AccountDataBean accountDataBean = directSLSBBean.login("userID", "password");
        assertNotNull(accountDataBean);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateAccountProfile_Ikdc0_UItG0_fid1() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    try {
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNotNull(updatedProfileData);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
}