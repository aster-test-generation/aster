/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

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

public class Aster_PingServletSimple_Coverage_Test_Passing {
  private PingServletSimple pingServletSimple;
  private ServletConfig servletConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_PrintWriterCreation_qsmb1_opev0() throws Exception {
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    PrintWriter writer = mock(PrintWriter.class);
    PingServletSimple pingServletSimple = new PingServletSimple();
    when(resp.getWriter()).thenReturn(writer);
    pingServletSimple.doGet(req, resp);
    verify(resp, times(1)).getWriter();
  }
}