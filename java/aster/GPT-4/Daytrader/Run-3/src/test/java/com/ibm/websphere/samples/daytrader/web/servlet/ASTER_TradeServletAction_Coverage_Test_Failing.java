/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeServletAction_Coverage_Test_Failing {
  private TradeServletAction tradeServletAction;
  private ServletContext ctx;
  private HttpServletRequest req;
  private HttpServletResponse resp;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithNullSymbols_eLbx7() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", null);
    verify(req).setAttribute(eq("quoteDataBeans"), any(Collection.class));
    verify(req, times(1)).setAttribute(eq("quoteDataBeans"), any(Collection.class));
  }
}