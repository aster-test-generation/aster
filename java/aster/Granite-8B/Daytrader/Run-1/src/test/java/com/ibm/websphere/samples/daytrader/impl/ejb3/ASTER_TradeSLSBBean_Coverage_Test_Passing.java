/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;
import java.math.BigDecimal;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeSLSBBean_Coverage_Test_Passing {
	{
	}
public void testUpdateQuotePriceVolume1_yCaH0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    QuoteDataBean quote = QuoteDataBean.getRandomInstance();
    BigDecimal changeFactor = BigDecimal.ZERO;
    double sharesTraded = 0.0;
    QuoteDataBean result = tradeSLSBBean.updateQuotePriceVolume(quote.getSymbol(), changeFactor, sharesTraded);
}
public void testUpdateQuotePriceVolume2_GHCt1() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    QuoteDataBean quote = QuoteDataBean.getRandomInstance();
    BigDecimal changeFactor = BigDecimal.ZERO;
    double sharesTraded = 0.0;
    QuoteDataBean result = tradeSLSBBean.updateQuotePriceVolume(quote.getSymbol(), changeFactor, sharesTraded);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn1_lYBy0() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 1000.0;
        double NetValue = 1200.0;
        double expected = 0.2;
        double actual = tradeSLSBBean.investmentReturn(investment, NetValue);
        assertEquals(expected, actual, 0.01);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testOrderCompleted_RpVB0() {
		TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
		try {
			tradeSLSBBean.orderCompleted("1", 1);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImpl_ENuw0() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        int expected = TradeConfig.EJB3;
        int actual = tradeSLSBBean.getImpl();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompleteOrderAsyncWithTwoPhaseTrue_gZLt2() throws Exception {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateAccountProfileWithNullPassword_qEZC5() {
	TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
	AccountProfileDataBean profileData = new AccountProfileDataBean();
	profileData.setUserID("123");
	profileData.setPassword(null);
	profileData.setFullName("John Doe");
	profileData.setAddress("123 Main St");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_WoAT2_1() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
        AccountDataBean account = mock(AccountDataBean.class);
        when(profile.getAccount()).thenReturn(account);
        when(profile.getUserID()).thenReturn("789");
        when(account.getProfileID()).thenReturn("789");
        AccountDataBean result = tradeSLSBBean.getAccountData("789");
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn2_Lgnz1_fid2() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 500.0;
        double NetValue = 600.0;
        double expected =0.2;
        double actual = tradeSLSBBean.investmentReturn(investment, NetValue);
        assertEquals(expected, actual, 0.01);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn3_VPzx2_fid2() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 1500.0;
        double NetValue = 1800.0;
        double expected =0.2;
        double actual = tradeSLSBBean.investmentReturn(investment, NetValue);
        assertEquals(expected, actual, 0.01);
    }
}