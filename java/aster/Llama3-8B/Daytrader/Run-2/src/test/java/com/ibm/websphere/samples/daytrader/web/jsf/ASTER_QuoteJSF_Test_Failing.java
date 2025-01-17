/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_QuoteJSF_Test_Failing {
    @Mock
    private ExternalContext externalContext;
    @Mock
    QuoteJSF quoteJSF;
    private Integer quantity = 100;
    private String symbols = null;
    @Mock
    private TradeServices tradeServices;
    @Mock
    ExternalContext externalcontext;
    @Mock
    HttpSession httpsession;
    QuoteJSF quotejsf;
    private HtmlDataTable dataTable;
    @Mock
    private HttpSession httpSession;
    private TradeServices tradeAction;
    private ExternalContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuantity_IItm0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        Integer quantity = quoteJSF.getQuantity();
        assertNotNull(quantity);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDataTable_cVmY0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        HtmlDataTable dataTable = quoteJSF.getDataTable();
        assertNotNull(dataTable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDataTable_GGJw0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        HtmlDataTable dataTable = new HtmlDataTable();
        quoteJSF.setDataTable(dataTable);
        assertEquals(dataTable, quoteJSF.getDataTable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllQuotes_ducw0() {
        QuoteJSF quoteJSF = new QuoteJSF(Mockito.mock(Instance.class));
        quoteJSF.getAllQuotes();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSymbols_AoFr1() {
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("symbols")).thenReturn(null);
        when(session.getAttribute("symbols")).thenReturn(null);
        quoteJSF.setSymbols(null);
        quoteJSF.setSymbols(null);
        quoteJSF.getQuotesBySymbols();
        verify(session, times(2)).getAttribute("symbols");
        verify(session, times(2)).setAttribute("symbols", quoteJSF.getSymbols());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidSymbols_gpLA2() {
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("symbols")).thenReturn("s:0,s:1,s:2,s:3,s:4");
        when(session.getAttribute("symbols")).thenReturn("s:0,s:1,s:2,s:3,s:4");
        quoteJSF.setSymbols("s:0,s:1,s:2,s:3,s:4");
        quoteJSF.setSymbols("s:0,s:1,s:2,s:3,s:4");
        quoteJSF.getQuotesBySymbols();
        verify(session, times(2)).getAttribute("symbols");
        verify(session, times(2)).setAttribute("symbols", quoteJSF.getSymbols());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSymbolsInSession_LpUC3() {
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("symbols")).thenReturn(null);
        quoteJSF.setSymbols(null);
        quoteJSF.getQuotesBySymbols();
        verify(session).getAttribute("symbols");
        verify(session).setAttribute("symbols", quoteJSF.getSymbols());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidSymbolsInSession_OxWn4() {
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("symbols")).thenReturn("s:0,s:1,s:2,s:3,s:4");
        quoteJSF.setSymbols("s:0,s:1,s:2,s:3,s:4");
        quoteJSF.getQuotesBySymbols();
        verify(session).getAttribute("symbols");
        verify(session).setAttribute("symbols", quoteJSF.getSymbols());
    }
}