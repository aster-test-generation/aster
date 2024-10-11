/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeServletAction_Coverage_Test_Passing {
  private static TradeServletAction tAction = null;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWelcome2_sLXU1() throws javax.servlet.ServletException, java.io.IOException {
    TradeServletAction action = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String status = "testStatus";
    action.doWelcome(ctx, req, resp, status);
    verify(req).setAttribute("results", status);
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.WELCOME_PAGE));
    verify(req).setAttribute("results", status);
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.WELCOME_PAGE));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_vhlT0() throws javax.servlet.ServletException, java.io.IOException {
    TradeServletAction action = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "test";
    action.doMarketSummary(ctx, req, resp, userID);
    verify(req).setAttribute("results", "test");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.MARKET_SUMMARY_PAGE));
    verify(req).setAttribute("results", "test");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.MARKET_SUMMARY_PAGE));
    verifyNoMoreInteractions(req);
    verifyNoMoreInteractions(ctx);
    verifyNoMoreInteractions(resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_UMIp3() throws Exception {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void doQuotesTest1_JPmj0() throws ServletException, IOException {
    TradeServletAction tAction = new TradeServletAction();
    ServletContext ctx = null;
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    String userID = "uid1";
    String symbols = "s1,s2,s3";
    try {
      tAction.doQuotes(ctx, req, resp, userID, symbols);
    } catch (ServletException e) {
      // Handle ServletException
    } catch (IOException e) {
      // Handle IOException
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void doQuotesTest5_AMPH4() throws ServletException, IOException {
    TradeServletAction tAction = new TradeServletAction();
    ServletContext ctx = null;
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    String userID = "uid5";
    String symbols = "s1,s2,s3";
    try {
      tAction.doQuotes(ctx, req, resp, userID, symbols);
      fail("Test5 failed"); // Replace with correct assertion
    } catch (ServletException e) {
      // Handle ServletException
    } catch (IOException e) {
      // Handle IOException
    }
  }
}