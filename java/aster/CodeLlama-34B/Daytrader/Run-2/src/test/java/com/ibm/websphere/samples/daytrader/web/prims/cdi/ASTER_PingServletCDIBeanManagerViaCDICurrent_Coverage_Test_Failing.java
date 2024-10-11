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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletCDIBeanManagerViaCDICurrent_Coverage_Test_Failing {
  private ServletConfig servletConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ZtHn0() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequest_jChG1() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = null;
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithResponse_ppyn2() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequestAndResponse_ClaA3() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequestAndPrintWriter_hSGV5_exmW0() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    servlet.doGet(request, response);
    assertEquals("PingServletCDIBeanManagerViaCDICurrent", servlet.getServletName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_qRQs8_HIeW0() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    doThrow(new IOException()).when(pw).write(anyString());
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithRequestAndPrintWriter_hSGV5_exmW0_fid2() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_qRQs8_HIeW0_fid2() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent servlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    PrintWriter pw = mock(PrintWriter.class);
    doThrow(new IOException()).when(pw).write(anyString());
    servlet.doGet(request, response);
  }
}