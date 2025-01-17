/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_QuoteJSF_Test_Failing {
  private HtmlDataTable dataTable;
  private TradeServices tradeAction;
  private String symbols = null;
  private ExternalContext context;
  private Integer quantity = 100;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithInvalidTradeServices_ysJr6() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    int quantity = quoteJSF.getQuantity();
    assertEquals(0, quantity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDataTableWithNullTradeServices_uYuO4() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    HtmlDataTable dataTable = quoteJSF.getDataTable();
    assertNull(dataTable);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolsWithNullTradeServices_oeSC5() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    String symbols = quoteJSF.getSymbols();
    assertNull(symbols);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolsWithEmptySymbolAndNullTradeServices_dnzn10() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    String symbols = quoteJSF.getSymbols();
    assertNotNull(symbols);
    assertEquals("", symbols);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolsWithEmptySymbolAndNullTradeServices_dnzn10_1() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    String symbols = quoteJSF.getSymbols();
    assertNotNull(symbols);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolsWithEmptySymbolAndNullTradeServices_dnzn10_2() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    String symbols = quoteJSF.getSymbols();
    assertEquals("", symbols);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDataTableWithNullTradeServices_uYuO4_fid2() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    HtmlDataTable dataTable = quoteJSF.getDataTable();
    assertNotNull(dataTable);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolsWithNullTradeServices_oeSC5_fid2() {
    QuoteJSF quoteJSF = new QuoteJSF(null);
    String symbols = quoteJSF.getSymbols();
    assertEquals(null, symbols);
  }
}