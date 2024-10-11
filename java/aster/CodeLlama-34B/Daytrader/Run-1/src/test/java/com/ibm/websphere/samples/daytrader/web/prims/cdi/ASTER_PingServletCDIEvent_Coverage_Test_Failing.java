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

public class Aster_PingServletCDIEvent_Coverage_Test_Failing {
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_wYYt0() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequest_nxkF1() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = null;
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithResponse_UaGS2() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequestAndResponse_VBLX3() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_SefO4() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenThrow(new IOException());
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithPrintWriter_LxWD5() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(pw);
    pingServletCDIEvent.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithPrintWriterAndException_ucnG6_Vgwn0() throws IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(pw);
    doThrow(new IOException()).when(pw).write(anyString());
    pingServletCDIEvent.doGet(request, response);
  }
}