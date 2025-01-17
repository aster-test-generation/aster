/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_QuoteJSF_Test_Failing {
    @Mock
    private HttpSession httpSessionMock;
    private TradeServices tradeAction;
    private ExternalContext context;
    private HtmlDataTable dataTable;
    private Integer quantity = 100;
    @Mock
    private QuoteJSF quoteJSF;
    @Mock
    private HttpSession httpSession;
    @Mock
    private ExternalContext externalContext;
    @Mock
    private QuoteData quoteData;
    @Mock
    private OrderDataBean orderDataBean;
    @Mock
    private OrderData orderData;
    @Mock
    private TradeServices tradeServices;
    private String symbols = null;
    @Mock
    private TradeServices tradeActionMock;
    @Mock
    private ExternalContext externalContextMock;
    @Mock
    private Instance<TradeServices> services;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantity_NQSF0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        Integer quantity = quoteJSF.getQuantity();
        assertNotNull(quantity);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDataTable_hWVi0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        HtmlDataTable dataTable = quoteJSF.getDataTable();
        assertNotNull(dataTable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDataTable_OQVz0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        HtmlDataTable dataTable = new HtmlDataTable();
        quoteJSF.setDataTable(dataTable);
        assertEquals(dataTable, quoteJSF.getDataTable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuotes_tvnf0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        QuoteData[] quotes = quoteJSF.getQuotes();
        assertNotNull(quotes);
        assertTrue(quotes.length > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy_hqvS0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        String result = quoteJSF.buy();
        assertEquals("buy", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_ATbJ0() {
        services = mock(Instance.class);
        quoteJSF = new QuoteJSF(services);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_rLOv0() {
        QuoteJSF quoteJSF = new QuoteJSF(Mockito.mock(Instance.class));
        quoteJSF.setQuantity(1);
        Mockito.verify(quoteJSF, times(1)).setQuantity(Mockito.anyInt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuotes_tvnf0_1() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        QuoteData[] quotes = quoteJSF.getQuotes();
        assertNotNull(quotes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuotes_tvnf0_2() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        QuoteData[] quotes = quoteJSF.getQuotes();
        assertTrue(quotes.length > 0);
    }
}