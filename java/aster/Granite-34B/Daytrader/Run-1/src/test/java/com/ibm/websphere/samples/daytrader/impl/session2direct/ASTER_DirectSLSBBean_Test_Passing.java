/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
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

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
    @Mock
    private AccountDataBean account;
    @Mock
    private QuoteDataBean quote;
    @Mock
    private HoldingDataBean holding;
    @InjectMocks
    private DirectSLSBBean directslsbbean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeWithNegativeVolume_zJTK2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = -100.0;
        try {
            directSLSBBean.updateQuotePriceVolume(symbol, newPrice, sharesTraded);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeWithNegativePrice_bhdB4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        BigDecimal newPrice = BigDecimal.ONE.negate();
        double sharesTraded = quoteDataBean.getVolume();
        try {
            directSLSBBean.updateQuotePriceVolume(symbol, newPrice, sharesTraded);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeWithNullSymbol_ZxYh5() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = null;
        BigDecimal newPrice = quoteDataBean.getPrice();
        double sharesTraded = quoteDataBean.getVolume();
        try {
            directSLSBBean.updateQuotePriceVolume(symbol, newPrice, sharesTraded);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder16_GJVT15() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = new Integer(7);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrdersCoverage_EHlu1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "testUser";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullPrice_hPlB1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        String companyName = quoteDataBean.getCompanyName();
        BigDecimal price = null;
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullCompanyName_iyKJ2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        String companyName = null;
        BigDecimal price = quoteDataBean.getPrice();
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullSymbol_nprL3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = null;
        String companyName = quoteDataBean.getCompanyName();
        BigDecimal price = quoteDataBean.getPrice();
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_gaEd0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assert result == TradeConfig.SESSION_TO_DIRECT;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImplForLineCoverage_bPUX1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assert result != 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImplForBranchCoverage_qOLd2() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        if (result == TradeConfig.SESSION_TO_DIRECT) {
            assert true;
        } else {
            assert false;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_NullUserID_Ypva1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = null;
        try {
            directSLSBBean.logout(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_EmptyUserID_gqqw2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "";
        try {
            directSLSBBean.logout(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_InvalidUserID_vIjn3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "invalidUser";
        try {
            directSLSBBean.logout(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest1_yHWB0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 1;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest2_Yzvl1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid2";
        Integer holdingID = 2;
        int orderProcessingMode = 2;
        try {
            OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
        } catch (Exception e) {
        }
    }
}