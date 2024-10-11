/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.doThrow;

public class Aster_PingManagedExecutor_Coverage_Test_Passing {
  private PingManagedExecutor executor;
  private ServletConfig config;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_exception_azyP4() throws ServletException {
    doThrow(new ServletException()).when(config).getServletContext();
    try {
      executor.init(config);
      fail("Expected ServletException");
    } catch (ServletException e) {
      assertEquals("ServletException", e.getMessage());
    }
  }
}