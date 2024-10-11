/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletCDI_Coverage_Test_Passing {
  private ServletConfig servletConfig;
  private PingServletCDI pingServletCDI;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_YiTk6_hyHC0() throws IOException {
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDI pingServletCDI = new PingServletCDI();
    pingServletCDI.doGet(request, response);
    verify(writer).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWriter_ueKl1_JaIw0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDI pingServletCDI = new PingServletCDI();
    pingServletCDI.doGet(request, response);
    verify(response, times(1)).getWriter();
  }
}