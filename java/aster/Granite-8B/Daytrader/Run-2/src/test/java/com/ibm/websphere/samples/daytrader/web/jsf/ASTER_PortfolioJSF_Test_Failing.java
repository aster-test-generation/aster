/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PortfolioJSF_Test_Failing {
    private Integer numberHoldings;
    private TradeServices tradeAction;
    private BigDecimal totalValue = new BigDecimal(0.0);
    private ArrayList<HoldingData> holdingDatas;
    private ExternalContext context;
    private BigDecimal totalGain = new BigDecimal(0.0);
    private BigDecimal totalBasis = new BigDecimal(0.0);
    PortfolioJSF portfoliojsf;
    HttpSession httpsession;
    ExternalContext externalcontext;
    private HtmlDataTable dataTable;
    @Mock
    private PortfolioJSF portfolioJSF;
    @Mock
    private HttpSession httpSession;
    @Mock
    private ExternalContext externalContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDataTable_eRVG0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        HtmlDataTable dataTable = new HtmlDataTable();
        portfolioJSF.setDataTable(dataTable);
        assertEquals(dataTable, portfolioJSF.getDataTable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotalValue_NSCj0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal totalValue = BigDecimal.ZERO;
        portfolioJSF.setTotalValue(totalValue);
        assertEquals(totalValue, portfolioJSF.getTotalValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumOfCashHoldings_KLZe0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal sumOfCashHoldings = BigDecimal.ZERO;
        portfolioJSF.setSumOfCashHoldings(sumOfCashHoldings);
        assertEquals(sumOfCashHoldings, portfolioJSF.getSumOfCashHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumOfCashHoldingsWithNull_ndHY1() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        portfolioJSF.setSumOfCashHoldings(null);
        assertEquals(null, portfolioJSF.getSumOfCashHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumOfCashHoldingsWithPositiveValue_QcbC3() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal sumOfCashHoldings = BigDecimal.valueOf(100);
        portfolioJSF.setSumOfCashHoldings(sumOfCashHoldings);
        assertEquals(sumOfCashHoldings, portfolioJSF.getSumOfCashHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNumberHoldings_yYyy0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        Integer actual = portfolioJSF.getNumberHoldings();
        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingDatas_vvNc1_2() {
        ArrayList<HoldingData> expectedHoldingDatas = new ArrayList<>();
        expectedHoldingDatas.add(new HoldingData());
        expectedHoldingDatas.add(new HoldingData());
        ArrayList<HoldingData> actualHoldingDatas = portfolioJSF.getHoldingDatas();
        assertTrue(actualHoldingDatas.size() >= 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingDatas_vvNc1_3() {
        ArrayList<HoldingData> expectedHoldingDatas = new ArrayList<>();
        expectedHoldingDatas.add(new HoldingData());
        expectedHoldingDatas.add(new HoldingData());
        ArrayList<HoldingData> actualHoldingDatas = portfolioJSF.getHoldingDatas();
        assertEquals(expectedHoldingDatas, actualHoldingDatas);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotalGain_MIKp0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal totalGain = BigDecimal.ZERO;
        portfolioJSF.setTotalGain(totalGain);
        assertEquals(totalGain, portfolioJSF.getTotalGain());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalance_YXSe0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal openBalance = BigDecimal.ZERO;
        portfolioJSF.setOpenBalance(openBalance);
        assertEquals(openBalance, portfolioJSF.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal_iVCZ0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal holdingsTotal = new BigDecimal(100);
        portfolioJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, portfolioJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotalWithZero_ORKQ1() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal holdingsTotal = BigDecimal.ZERO;
        portfolioJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, portfolioJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotalWithNegativeValue_FLdB2() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal holdingsTotal = new BigDecimal(-100);
        portfolioJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, portfolioJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotalWithNull_bqOP3() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal holdingsTotal = null;
        portfolioJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, portfolioJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDataTable_tDHL0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        HtmlDataTable dataTable = portfolioJSF.getDataTable();
        assertNotNull(dataTable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBalance_oCfL0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal balance = portfolioJSF.getBalance();
        assertNotNull(balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBalanceWithZeroBalance_kAuD1() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(null);
        BigDecimal balance = portfolioJSF.getBalance();
        assertEquals(BigDecimal.ZERO, balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_gSWa0() {
        PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
        BigDecimal balance = BigDecimal.ONE;
        portfolioJSF.setBalance(balance);
        assertEquals(balance, portfolioJSF.getBalance());
    }
}