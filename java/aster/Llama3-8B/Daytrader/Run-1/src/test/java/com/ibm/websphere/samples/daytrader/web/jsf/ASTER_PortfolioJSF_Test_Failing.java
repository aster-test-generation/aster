/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

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
    @Mock
    private TradeServices tradeActionMock;
    @Mock
    private ExternalContext externalContextMock;
    @Mock
    private HttpSession httpSessionMock;
    private PortfolioJSF portfoliojsf;
    private HtmlDataTable dataTable;
    HttpSession httpsession;
    ExternalContext externalcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPortfolio_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        portfoliojsf = new PortfolioJSF(mock(Instance.class));
        when(externalContextMock.getSession(any())).thenReturn(httpSessionMock);
        when(httpSessionMock.getAttribute("uidBean")).thenReturn("uidBean");
        when(tradeActionMock.getHoldings("uidBean")).thenReturn(Arrays.asList(mock(HoldingDataBean.class)));
        when(tradeActionMock.getQuote(any())).thenReturn(mock(QuoteDataBean.class));
        portfoliojsf.getPortfolio();
        verify(tradeActionMock, times(1)).getHoldings("uidBean");
        verify(tradeActionMock, times(1)).getQuote(any());
        assertEquals(1, portfoliojsf.getNumberHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPortfolio_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        portfoliojsf = new PortfolioJSF(mock(Instance.class));
        when(externalContextMock.getSession(any())).thenReturn(httpSessionMock);
        when(httpSessionMock.getAttribute("uidBean")).thenReturn("uidBean");
        when(tradeActionMock.getHoldings("uidBean")).thenReturn(Arrays.asList(mock(HoldingDataBean.class)));
        when(tradeActionMock.getQuote(any())).thenReturn(mock(QuoteDataBean.class));
        portfoliojsf.getPortfolio();
        verify(tradeActionMock, times(1)).getHoldings("uidBean");
        verify(tradeActionMock, times(1)).getQuote(any());
        assertEquals(0.0, portfoliojsf.getTotalValue().doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPortfolio_3() throws Exception {
        MockitoAnnotations.initMocks(this);
        portfoliojsf = new PortfolioJSF(mock(Instance.class));
        when(externalContextMock.getSession(any())).thenReturn(httpSessionMock);
        when(httpSessionMock.getAttribute("uidBean")).thenReturn("uidBean");
        when(tradeActionMock.getHoldings("uidBean")).thenReturn(Arrays.asList(mock(HoldingDataBean.class)));
        when(tradeActionMock.getQuote(any())).thenReturn(mock(QuoteDataBean.class));
        portfoliojsf.getPortfolio();
        verify(tradeActionMock, times(1)).getHoldings("uidBean");
        verify(tradeActionMock, times(1)).getQuote(any());
        assertEquals(0.0, portfoliojsf.getTotalGain().doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPortfolio_4() throws Exception {
        MockitoAnnotations.initMocks(this);
        portfoliojsf = new PortfolioJSF(mock(Instance.class));
        when(externalContextMock.getSession(any())).thenReturn(httpSessionMock);
        when(httpSessionMock.getAttribute("uidBean")).thenReturn("uidBean");
        when(tradeActionMock.getHoldings("uidBean")).thenReturn(Arrays.asList(mock(HoldingDataBean.class)));
        when(tradeActionMock.getQuote(any())).thenReturn(mock(QuoteDataBean.class));
        portfoliojsf.getPortfolio();
        verify(tradeActionMock, times(1)).getHoldings("uidBean");
        verify(tradeActionMock, times(1)).getQuote(any());
        assertEquals(0.0, portfoliojsf.getTotalBasis().doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPortfolio() throws Exception {
        MockitoAnnotations.initMocks(this);
        portfoliojsf = new PortfolioJSF(mock(Instance.class));
        when(externalContextMock.getSession(any())).thenReturn(httpSessionMock);
        when(httpSessionMock.getAttribute("uidBean")).thenReturn("uidBean");
        when(tradeActionMock.getHoldings("uidBean")).thenReturn(Arrays.asList(mock(HoldingDataBean.class)));
        when(tradeActionMock.getQuote(any())).thenReturn(mock(QuoteDataBean.class));
        portfoliojsf.getPortfolio();
        verify(tradeActionMock, times(1)).getHoldings("uidBean");
        verify(tradeActionMock, times(1)).getQuote(any());
        assertEquals(1, portfoliojsf.getNumberHoldings());
        assertEquals(0.0, portfoliojsf.getTotalValue().doubleValue(), 0.0);
        assertEquals(0.0, portfoliojsf.getTotalGain().doubleValue(), 0.0);
        assertEquals(0.0, portfoliojsf.getTotalBasis().doubleValue(), 0.0);
    }
}