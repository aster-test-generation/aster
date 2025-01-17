/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeScenarioServlet_Coverage_Test_Passing {
  private TradeConfig tradeConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask9_wElE8() throws javax.servlet.ServletException, java.io.IOException {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask8_soxv7() throws javax.servlet.ServletException, java.io.IOException {
    TradeScenarioServlet servlet = mock(TradeScenarioServlet.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("n");
    servlet.performTask(req, resp);
    verify(req).setAttribute("action", 'n');
  }
}