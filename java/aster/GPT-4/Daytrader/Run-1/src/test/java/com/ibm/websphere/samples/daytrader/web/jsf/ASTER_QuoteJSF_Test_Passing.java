/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_QuoteJSF_Test_Passing {
  private String symbols = null;
  @Mock
  private TradeServices tradeAction;
  @Mock
  private ExternalContext context;
  @Mock
  private HtmlDataTable dataTable;
  @Mock
  private HttpSession session;
  @InjectMocks
  private QuoteJSF quoteJSF;
  @Mock
  @Any
  Instance<TradeServices> servicesInstance;
  @Mock
  TradeServices tradeServices;
  @Mock
  private ExternalContext externalContext;
  @Mock
  private HttpSession httpSession;
  private Integer quantity = 100;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantity_jxIW0() {
    QuoteJSF quote = new QuoteJSF(null); // Assuming null is acceptable for the constructor
    Integer expected = 0; // Assuming default quantity is 0
    assertEquals(expected, quote.getQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDataTable_xVGy0() {
    QuoteJSF quoteJSF = new QuoteJSF(null); // Assuming null is acceptable for the constructor
    HtmlDataTable result = quoteJSF.getDataTable();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDataTable_OLqI0() {
    QuoteJSF quoteJSF = new QuoteJSF(null); // Assuming null is acceptable for Instance<TradeServices>
    HtmlDataTable dataTable = new HtmlDataTable();
    quoteJSF.setDataTable(dataTable);
    assertEquals(dataTable, quoteJSF.getDataTable());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuotesReturnsNotNull_fuBi0() {
    QuoteJSF quoteJSF = new QuoteJSF(null); // Assuming null can be passed if @Any Instance<TradeServices> is not used in the test
    QuoteData[] result = quoteJSF.getQuotes();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbols_hJaA0() {
    QuoteJSF quoteJSF = new QuoteJSF(null); // Assuming null is acceptable for the constructor
    String expected = null; // Assuming default value of symbols is null
    assertEquals(expected, quoteJSF.getSymbols());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbols_ZEDl0_UJQO0() {
    QuoteJSF quoteJSF = new QuoteJSF(null); // Assuming null is acceptable for the constructor
    String expectedSymbols = "AAPL,GOOGL,MSFT";
    quoteJSF.setSymbols(expectedSymbols);
    assertEquals(expectedSymbols, quoteJSF.getSymbols());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantity_JiXP0_VUkn0() {
    QuoteJSF quote = new QuoteJSF(null); // Assuming null is acceptable for Instance<TradeServices>
    quote.setQuantity(5);
    assertEquals(Integer.valueOf(5), quote.getQuantity());
  }
}