/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletBeanValCDI_Coverage_Test_Passing {
  private HttpServletResponse res;
  private PingServletBeanValCDI pingServletBeanValCDI;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetOutputStream_NdUD2_qwjB0() throws IOException, ServletException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletOutputStream outputStream = mock(ServletOutputStream.class);
    when(response.getOutputStream()).thenReturn(outputStream);
    PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
    pingServletBeanValCDI.doGet(request, response);
    verify(response, times(1)).getOutputStream();
  }
}