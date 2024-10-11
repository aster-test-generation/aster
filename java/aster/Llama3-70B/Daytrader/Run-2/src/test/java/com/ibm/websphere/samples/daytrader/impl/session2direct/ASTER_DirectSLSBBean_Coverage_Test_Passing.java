/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.math.BigDecimal;
import java.util.Collection;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DirectSLSBBean_Coverage_Test_Passing {
private TradeDirect tradeDirect;
private DirectSLSBBean directSLSBBean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllQuotes_SetInSession_OWNg0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.getAllQuotes();
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_SetInSession_ABLz0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.register("userID", "password", "fullname", "address", "email", "creditcard", BigDecimal.ZERO);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_ReturnAccountDataBean_ZBzz1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        AccountDataBean accountDataBean = mock(AccountDataBean.class);
        when(tradeDirect.register("userID", "password", "fullname", "address", "email", "creditcard", BigDecimal.ZERO)).thenReturn(accountDataBean);
        directSLSBBean.tradeDirect = tradeDirect;
        AccountDataBean result = directSLSBBean.register("userID", "password", "fullname", "address", "email", "creditcard", BigDecimal.ZERO);
        assertEquals(accountDataBean, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummary_SetInSessionTrue_cBiM0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.getMarketSummary();
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummary_ReturnMarketSummary_djio1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        MarketSummaryDataBean marketSummaryDataBeanMock = mock(MarketSummaryDataBean.class);
        when(tradeDirectMock.getMarketSummary()).thenReturn(marketSummaryDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        MarketSummaryDataBean result = directSLSBBean.getMarketSummary();
        assertEquals(marketSummaryDataBeanMock, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_setsInSessionToTrue_xnam0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.login("userID", "password");
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_callsTradeDirectLogin_zZtC1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        AccountDataBean accountDataBean = mock(AccountDataBean.class);
        when(tradeDirect.login("userID", "password")).thenReturn(accountDataBean);
        directSLSBBean.tradeDirect = tradeDirect;
        AccountDataBean result = directSLSBBean.login("userID", "password");
        assertEquals(accountDataBean, result);
        verify(tradeDirect).login("userID", "password");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_SetInSession_jzNq0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect; // assuming tradeDirect is a field in DirectSLSBBean
        directSLSBBean.getHoldings("someUserID");
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_ReturnHoldings_FkxM1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect; // assuming tradeDirect is a field in DirectSLSBBean
        Collection<HoldingDataBean> expectedHoldings = mock(Collection.class);
        when(tradeDirect.getHoldings("someUserID")).thenReturn(expectedHoldings);
        Collection<HoldingDataBean> actualHoldings = directSLSBBean.getHoldings("someUserID");
        assertEquals(expectedHoldings, actualHoldings);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_setsInSessionToTrue_mSQk0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.updateQuotePriceVolume("symbol", BigDecimal.valueOf(10), 10);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_returnsUpdatedQuoteDataBean_PGwS1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        QuoteDataBean quoteDataBean = mock(QuoteDataBean.class);
        when(tradeDirect.updateQuotePriceVolume("symbol", BigDecimal.valueOf(10), 10)).thenReturn(quoteDataBean);
        QuoteDataBean result = directSLSBBean.updateQuotePriceVolume("symbol", BigDecimal.valueOf(10), 10);
        assertEquals(quoteDataBean, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_SetInSession_wspZ0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect; // assuming tradeDirect is a field in DirectSLSBBean
        directSLSBBean.getOrders("someUserID");
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrder_SetInSession_LcVl0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.completeOrder(1, true);
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrder_ReturnOrderDataBean_EqyC1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        OrderDataBean orderDataBeanMock = mock(OrderDataBean.class);
        when(tradeDirectMock.completeOrder(1, true)).thenReturn(orderDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        OrderDataBean result = directSLSBBean.completeOrder(1, true);
        assertNotNull(result);
        verify(tradeDirectMock).completeOrder(1, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuote_setsInSessionToTrue_AAWQ0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.createQuote("symbol", "companyName", BigDecimal.valueOf(10.0));
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuote_returnsQuoteDataBean_cSBh1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        QuoteDataBean quoteDataBean = mock(QuoteDataBean.class);
        when(tradeDirect.createQuote("symbol", "companyName", BigDecimal.valueOf(10.0))).thenReturn(quoteDataBean);
        directSLSBBean.tradeDirect = tradeDirect;
        QuoteDataBean result = directSLSBBean.createQuote("symbol", "companyName", BigDecimal.valueOf(10.0));
        assertEquals(quoteDataBean, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_SetInSession_Uwkw0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.getQuote("symbol");
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuote_ReturnQuote_gWcY1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        QuoteDataBean quoteDataBeanMock = mock(QuoteDataBean.class);
        when(tradeDirectMock.getQuote("symbol")).thenReturn(quoteDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        QuoteDataBean result = directSLSBBean.getQuote("symbol");
        assertEquals(quoteDataBeanMock, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrder_SetInSession_DpoN0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.queueOrder(1, true);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrder_QueueOrder_IHCN1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.queueOrder(1, true);
        verify(tradeDirect).queueOrder(1, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountData_SetInSession_FIhW0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.getAccountData("someUserID");
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountData_ReturnAccountData_qCIy1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        AccountDataBean accountDataBeanMock = mock(AccountDataBean.class);
        when(tradeDirectMock.getAccountData("someUserID")).thenReturn(accountDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        AccountDataBean result = directSLSBBean.getAccountData("someUserID");
        assertEquals(accountDataBeanMock, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_SetInSession_NrBN0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        directSLSBBean.updateAccountProfile(profileData);
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_ReturnValue_IBIm1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        AccountProfileDataBean returnValue = new AccountProfileDataBean();
        when(tradeDirectMock.updateAccountProfile(profileData)).thenReturn(returnValue);
        AccountProfileDataBean result = directSLSBBean.updateAccountProfile(profileData);
        assertEquals(returnValue, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_setInSession_OibV0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.orderCompleted("userID", 1);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_orderCompleted_EWxo1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.orderCompleted("userID", 1);
        verify(tradeDirect).orderCompleted("userID", 1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_SetInSession_TCwH0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.logout("userID");
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_Logout_VBfs1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.logout("userID");
        verify(tradeDirect).logout("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_NoException_JGNm2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.logout("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountProfileData_SetInSession_naXI0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.getAccountProfileData("someUserID");
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_setInSession_qBHR0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect; // assuming tradeDirect is a field in DirectSLSBBean
        directSLSBBean.getClosedOrders("userID");
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHolding_SetInSession_fSWB0() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        directSLSBBean.getHolding(1);
        verify(tradeDirectMock).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHolding_ReturnHolding_zLaT1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        HoldingDataBean holdingDataBeanMock = mock(HoldingDataBean.class);
        when(tradeDirectMock.getHolding(1)).thenReturn(holdingDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        HoldingDataBean result = directSLSBBean.getHolding(1);
        assertEquals(holdingDataBeanMock, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy_SetInSessionTrue_ZZSW0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.buy("userID", "symbol", 10.0, TradeConfig.SYNCH);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy_OrderDataBeanReturned_rUas1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.buy("userID", "symbol", 10.0, TradeConfig.SYNCH)).thenReturn(orderDataBean);
        OrderDataBean result = directSLSBBean.buy("userID", "symbol", 10.0, TradeConfig.SYNCH);
        assertEquals(orderDataBean, result);
    }
@Test
public void testGetClosedOrders_uxrV0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    TradeDirect tradeDirect = mock(TradeDirect.class);
    when(tradeDirect.getClosedOrders("userID")).thenReturn(new ArrayList<>());
    directSLSBBean.tradeDirect = tradeDirect;
    Collection<?> result = directSLSBBean.getClosedOrders("userID");
    assertNotNull(result);
    verify(tradeDirect).setInSession(true);
    verify(tradeDirect).getClosedOrders("userID");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
            public void setTradeDirect(TradeDirect tradeDirect) {
                this.tradeDirect = tradeDirect;
            }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountProfileData_ReturnAccountProfileData_oShK1() throws Exception {
        TradeDirect tradeDirectMock = mock(TradeDirect.class);
        AccountProfileDataBean accountProfileDataBeanMock = mock(AccountProfileDataBean.class);
        when(tradeDirectMock.getAccountProfileData("someUserID")).thenReturn(accountProfileDataBeanMock);
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect = tradeDirectMock;
        AccountProfileDataBean result = directSLSBBean.getAccountProfileData("someUserID");
        assertEquals(accountProfileDataBeanMock, result);
    }
}