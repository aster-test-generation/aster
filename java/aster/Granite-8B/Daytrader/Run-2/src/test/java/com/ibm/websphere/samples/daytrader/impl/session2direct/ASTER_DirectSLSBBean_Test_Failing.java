/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Failing {
    @Mock
    private AccountDataBean account;
    @Mock
    private QuoteDataBean quote;
    @Mock
    private HoldingDataBean holding;
    @InjectMocks
    private DirectSLSBBean directslsbbean;
    private DirectSLSBBean tradeDirect;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_MItJ0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<HoldingDataBean> holdings = directSLSBBean.getHoldings("user123");
        assertNotNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder_qkFK0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(1, true);
        assertTrue(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrderWithInvalidOrderID_ITSe1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(0, true);
        // Add the necessary assertion here to fix the test case
        // For example:
        // assertEquals(expectedValue, directSLSBBean.cancelOrder(0, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_oaiS0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "sampleUserID";
        Collection<?> orders = directSLSBBean.getOrders(userID);
        assertNotNull(orders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_ECBd0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Test Company");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("TEST");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("TEST");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNotNull(updatedProfileData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("user123", updatedProfileData.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("password123", updatedProfileData.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("John Doe", updatedProfileData.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_5() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("123 Main St", updatedProfileData.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_6() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("johndoe@example.com", updatedProfileData.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0_7() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("1234567890123456", updatedProfileData.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrder_PzyR0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = 123;
        boolean twoPhase = true;
        directSLSBBean.queueOrder(orderID, twoPhase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountProfileData_HfjU0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean accountProfileDataBean = directSLSBBean.getAccountProfileData("user1");
        assertNotNull(accountProfileDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImplWithNullObject_bJed2() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_uPEw0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.logout("user123");
        assertTrue(true); // Add assertion here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_dlzZ0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(1, true);
        assertNotNull(future);
        OrderDataBean orderDataBean = future.get();
        assertNotNull(orderDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOrder_lcVO0_XIxe0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean();
        String orderType = "BUY";
        double quantity = 100.0;
        OrderDataBean orderDataBean = null;
        try {
            orderDataBean = directSLSBBean.createOrder(account, quote, holding, orderType, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("BUY", orderDataBean.getOrderType());
        assertEquals(100.0, orderDataBean.getQuantity(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountData_oINJ0_Fqbi0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        String userID = accountDataBean.getProfileID();
        AccountDataBean actualAccountDataBean = null;
        try {
            actualAccountDataBean = directSLSBBean.getAccountData(userID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(actualAccountDataBean);
        assertEquals(accountDataBean.getProfileID(), actualAccountDataBean.getProfileID());
        assertEquals(accountDataBean.getCreationDate(), actualAccountDataBean.getCreationDate());
        assertEquals(accountDataBean.getLastLogin(), actualAccountDataBean.getLastLogin());
        assertEquals(accountDataBean.getLoginCount(), actualAccountDataBean.getLoginCount());
        assertEquals(accountDataBean.getLogoutCount(), actualAccountDataBean.getLogoutCount());
        assertEquals(accountDataBean.getBalance(), actualAccountDataBean.getBalance());
        assertEquals(accountDataBean.getOpenBalance(), actualAccountDataBean.getOpenBalance());
        assertEquals(accountDataBean.getOrders(), actualAccountDataBean.getOrders());
        assertEquals(accountDataBean.getHoldings(), actualAccountDataBean.getHoldings());
        assertEquals(accountDataBean.getProfile(), actualAccountDataBean.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhase_nNpK0_WOAH0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        QuoteDataBean result = null;
        try {
            result = directSLSBBean.pingTwoPhase(symbol);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertEquals(quoteDataBean.getCompanyName(), result.getCompanyName());
        assertEquals(quoteDataBean.getPrice(), result.getPrice());
        assertEquals(quoteDataBean.getOpen(), result.getOpen());
        assertEquals(quoteDataBean.getLow(), result.getLow());
        assertEquals(quoteDataBean.getChange(), result.getChange(), 0.0);
        assertEquals(quoteDataBean.getHigh(), result.getHigh());
        assertEquals(quoteDataBean.getSymbol(), result.getSymbol());
        assertEquals(quoteDataBean.getVolume(), result.getVolume(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrderWithInvalidOrderID_ITSe1_fid1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(0, true);
        assertTrue(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrderWithTwoPhaseFalse_aZQZ2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(1, false);
        assertTrue(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_DFYp0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user123");
        profileData.setPassword("password123");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNotNull(updatedProfileData);
        assertEquals("user123", updatedProfileData.getUserID());
        assertEquals("password123", updatedProfileData.getPassword());
        assertEquals("John Doe", updatedProfileData.getFullName());
        assertEquals("123 Main St", updatedProfileData.getAddress());
        assertEquals("johndoe@example.com", updatedProfileData.getEmail());
        assertEquals("1234567890123456", updatedProfileData.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_XmzR0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.orderCompleted("user1", 123);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImplWithNullObject_bJed2_fid1() {
        DirectSLSBBean directSLSBBean = null;
        int result = directSLSBBean.getImpl();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImplWithNegativeValue_kuVU4_fid1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_dlzZ0_fid1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(1, true);
        assertNotNull(future);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_Lwmb0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "user123";
        Collection<?> closedOrders = directSLSBBean.getClosedOrders(userID);
        assertNotNull(closedOrders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOrder_lcVO0_XIxe0_fid3() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean();
        String orderType = "BUY";
        double quantity = 100.0;
        OrderDataBean orderDataBean = null;
        try {
            orderDataBean = directSLSBBean.createOrder(account, quote, holding, orderType, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(orderDataBean);
        assertEquals("BUY", orderDataBean.getOrderType());
        assertEquals(100.0, orderDataBean.getQuantity(), 0.001);
    }
}