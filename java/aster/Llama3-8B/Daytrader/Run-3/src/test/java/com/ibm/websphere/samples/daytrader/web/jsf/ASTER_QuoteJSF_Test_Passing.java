/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import javax.enterprise.inject.Instance;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_QuoteJSF_Test_Passing {
private TradeServices tradeAction;
private ExternalContext context;
private HtmlDataTable dataTable;
private Integer quantity = 100;
QuoteJSF quotejsf;
HttpSession httpsession;
ExternalContext externalcontext;
TradeServices tradeServices;
private String symbols = null;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetAllQuotes_mpaG0() throws Exception {
    HttpSession httpSession = mock(HttpSession.class);
    ExternalContext externalContext = mock(ExternalContext.class);
    Instance<TradeServices> tradeServicesInstance = mock(Instance.class);
    TradeServices tradeServices = mock(TradeServices.class);
    when(tradeServicesInstance.get()).thenReturn(tradeServices);
    QuoteJSF quotejsf = new QuoteJSF(tradeServicesInstance);
    when(externalContext.getSession(any())).thenReturn(httpSession);
    quotejsf.getQuotesBySymbols();
    verify(tradeServices, times(1)).getQuote(anyString());
}
}