/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingServletBeanValCDI_Coverage_Test_Failing {
  private ServletConfig config;
  private PingServletBeanValCDI pingServletBeanValCDI;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_GDwG1_HTbo0() throws ServletException, IOException {
    PingServletBeanValCDI servlet = new PingServletBeanValCDI();
    HttpServletRequest request = mock(HttpServletRequest.class);
    servlet.doPost(request, response);
    verify(response).sendError(HttpServletResponse.SC_BAD_REQUEST);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_rJoa0() {
    PingServletBeanValCDI servlet = new PingServletBeanValCDI();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}