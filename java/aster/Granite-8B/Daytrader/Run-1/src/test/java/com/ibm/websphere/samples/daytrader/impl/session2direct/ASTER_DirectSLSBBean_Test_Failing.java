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
    private DirectSLSBBean directSLSBBean;
    private DirectSLSBBean tradeDirect = new DirectSLSBBean();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetAllQuotes_EBLn0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> allQuotes = directSLSBBean.getAllQuotes();
        assertNotNull(allQuotes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_fvsP0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "123";
        Collection<HoldingDataBean> holdings = directSLSBBean.getHoldings(userID);
        assertNotNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetInSession_aQUz0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.setInSession(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertNotNull(updatedQuote);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getCompanyName(), updatedQuote.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getPrice(), updatedQuote.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getOpen(), updatedQuote.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_5() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getLow(), updatedQuote.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_6() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getChange(), updatedQuote.getChange(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_7() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getHigh(), updatedQuote.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_8() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertEquals(quoteDataBean.getSymbol(), updatedQuote.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0_9() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertTrue(updatedQuote.getVolume() > quoteDataBean.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder_XyTS0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = 123;
        boolean twoPhase = true;
        directSLSBBean.cancelOrder(orderID, twoPhase);
        assertTrue(true); // Add assertion for expected behavior
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOrders_XdhB0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> orders = directSLSBBean.getOrders("user123");
        assertNotNull(orders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getCompanyName().equals("Company Name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getPrice().equals(new BigDecimal(100.00)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getOpen().equals(new BigDecimal(90.00)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_5() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getLow().equals(new BigDecimal(80.00)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_6() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getChange() == 10.00);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_7() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getHigh().equals(new BigDecimal(110.00)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_8() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getSymbol().equals("Symbol"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0_9() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertTrue(result.getVolume() == 1000.00);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuote_HxoY0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        String companyName = quoteDataBean.getCompanyName();
        BigDecimal price = quoteDataBean.getPrice();
        QuoteDataBean createdQuote = directSLSBBean.createQuote(symbol, companyName, price);
        assertNotNull(createdQuote);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_1() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNotNull(updatedProfileData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_2() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("user1", updatedProfileData.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_3() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("password1", updatedProfileData.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_4() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("John Doe", updatedProfileData.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_5() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("123 Main St", updatedProfileData.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_6() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("johndoe@example.com", updatedProfileData.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0_7() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertEquals("1234567890123456", updatedProfileData.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testPingTwoPhase_FyIQ0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        QuoteDataBean result = directSLSBBean.pingTwoPhase(quoteDataBean.getSymbol());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testPingTwoPhase_FyIQ0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        QuoteDataBean result = directSLSBBean.pingTwoPhase(quoteDataBean.getSymbol());
        assertEquals(quoteDataBean.getSymbol(), result.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testPingTwoPhase_FyIQ0_3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        QuoteDataBean result = directSLSBBean.pingTwoPhase(quoteDataBean.getSymbol());
        assertTrue(result.getChange() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_HPdv0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.orderCompleted("user1", 123);
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImpl_lQgV0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountProfileData_ZRzm0_BkvG0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean accountProfileDataBean = directSLSBBean.getAccountProfileData("123");
        assertNotNull(accountProfileDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountProfileData_ZRzm0_BkvG0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean accountProfileDataBean = directSLSBBean.getAccountProfileData("123");
        assertTrue(accountProfileDataBean.getUserID().length() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrder_wZkZ0_pVjd0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
        boolean twoPhase = true;
        OrderDataBean result = null;
        try {
            result = directSLSBBean.completeOrder(orderDataBean.getOrderID(), twoPhase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_adOq0_frOa0_1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
        int orderProcessingMode = 0; // Assuming 0 is a valid value for orderProcessingMode
        OrderDataBean result = directSLSBBean.sell("user1", 1, orderProcessingMode);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_adOq0_frOa0_2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
        int orderProcessingMode = 0; // Assuming 0 is a valid value for orderProcessingMode
        OrderDataBean result = directSLSBBean.sell("user1", 1, orderProcessingMode);
        assertEquals("open", result.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_CWql0_lzfM0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = 123;
        boolean twoPhase = true;
        Future<OrderDataBean> future = null;
        try {
            future = directSLSBBean.completeOrderAsync(orderID, twoPhase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(future);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_qerT0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = 100.0;
        QuoteDataBean updatedQuote = directSLSBBean.updateQuotePriceVolume(quoteDataBean.getSymbol(), newPrice, sharesTraded);
        assertNotNull(updatedQuote);
        assertEquals(quoteDataBean.getCompanyName(), updatedQuote.getCompanyName());
        assertEquals(quoteDataBean.getPrice(), updatedQuote.getPrice());
        assertEquals(quoteDataBean.getOpen(), updatedQuote.getOpen());
        assertEquals(quoteDataBean.getLow(), updatedQuote.getLow());
        assertEquals(quoteDataBean.getChange(), updatedQuote.getChange(), 0.0);
        assertEquals(quoteDataBean.getHigh(), updatedQuote.getHigh());
        assertEquals(quoteDataBean.getSymbol(), updatedQuote.getSymbol());
        assertTrue(updatedQuote.getVolume() > quoteDataBean.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_HFDm0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Company Name");
        quoteDataBean.setPrice(new BigDecimal(100.00));
        quoteDataBean.setOpen(new BigDecimal(90.00));
        quoteDataBean.setLow(new BigDecimal(80.00));
        quoteDataBean.setChange(10.00);
        quoteDataBean.setHigh(new BigDecimal(110.00));
        quoteDataBean.setSymbol("Symbol");
        quoteDataBean.setVolume(1000.00);
        QuoteDataBean result = directSLSBBean.getQuote("Symbol");
        assertNotNull(result);
        assertTrue(result.getCompanyName().equals("Company Name"));
        assertTrue(result.getPrice().equals(new BigDecimal(100.00)));
        assertTrue(result.getOpen().equals(new BigDecimal(90.00)));
        assertTrue(result.getLow().equals(new BigDecimal(80.00)));
        assertTrue(result.getChange() == 10.00);
        assertTrue(result.getHigh().equals(new BigDecimal(110.00)));
        assertTrue(result.getSymbol().equals("Symbol"));
        assertTrue(result.getVolume() == 1000.00);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_gcMy0() throws Exception {
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        profileData.setUserID("user1");
        profileData.setPassword("password1");
        profileData.setFullName("John Doe");
        profileData.setAddress("123 Main St");
        profileData.setEmail("johndoe@example.com");
        profileData.setCreditCard("1234567890123456");
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
        assertNotNull(updatedProfileData);
        assertEquals("user1", updatedProfileData.getUserID());
        assertEquals("password1", updatedProfileData.getPassword());
        assertEquals("John Doe", updatedProfileData.getFullName());
        assertEquals("123 Main St", updatedProfileData.getAddress());
        assertEquals("johndoe@example.com", updatedProfileData.getEmail());
        assertEquals("1234567890123456", updatedProfileData.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrder_fEbI0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.queueOrder(1, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testPingTwoPhase_FyIQ0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        QuoteDataBean result = directSLSBBean.pingTwoPhase(quoteDataBean.getSymbol());
        assertNotNull(result);
        assertEquals(quoteDataBean.getSymbol(), result.getSymbol());
        assertTrue(result.getChange() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_shWW0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> closedOrders = directSLSBBean.getClosedOrders("user123");
        assertNotNull(closedOrders);
    }
}