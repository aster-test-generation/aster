/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet30Async_Coverage_Test_Failing {
  private PingServlet30Async servlet;
  private ServletOutputStream servletOutputStream;
  private HttpServletRequest request;
  private HttpServletResponse response;
  private AsyncContext asyncContext;
  private ServletInputStream servletInputStream;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_dJjD0() {
    PingServlet30Async servlet = new PingServlet30Async();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetCallsDoPost_GWLS0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet30Async servlet = new PingServlet30Async();
    PingServlet30Async spyServlet = spy(servlet);
    spyServlet.doGet(request, response);
    verify(spyServlet).doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetContentType_IizG1() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(response).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStartAsync_iSKP2() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(request).startAsync();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStringBuilderInitialization_kjzl3() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(servletInputStream, atLeastOnce()).read(any(byte[].class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetInputStream_neve4() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(request).getInputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testByteInitialization_qvOF5() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(servletInputStream).read(any(byte[].class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInputStreamRead_Xvdu6() throws ServletException, IOException {
    when(servletInputStream.read(any(byte[].class))).thenReturn(3, -1);
    servlet.doPost(request, response);
    verify(servletInputStream, times(2)).read(any(byte[].class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStringDataAppend_ohat7() throws ServletException, IOException {
    when(servletInputStream.read(any(byte[].class))).thenReturn(3, -1);
    when(servletInputStream.read(new byte[1024], 0, 1024)).thenReturn(3).thenReturn(-1);
    servlet.doPost(request, response);
    verify(servletInputStream, atLeastOnce()).read(any(byte[].class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOutputStream_htgz8() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(response).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOutputStreamPrintln_KNRJ9() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(servletOutputStream).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAsyncContextComplete_dhHa10() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReadDataLoop_nvLV11() throws ServletException, IOException {
    when(servletInputStream.read(any(byte[].class))).thenReturn(5, 5, -1);
    servlet.doPost(request, response);
    verify(servletInputStream, times(3)).read(any(byte[].class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOutputHtmlContent_jUJf12() throws ServletException, IOException {
    servlet.doPost(request, response);
    verify(servletOutputStream).println(contains("<html>"));
    verify(servletOutputStream).println(contains("Ping Servlet 3.0 Async"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitCountIncrement_KgHZ13() throws ServletException, IOException {
    servlet.doPost(request, response);
    servlet.doPost(request, response);
    verify(servletOutputStream, times(2)).println(contains("Hit Count: 2"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReceivedDataOutput_LLwC14() throws ServletException, IOException {
    when(servletInputStream.read(any(byte[].class))).thenReturn("test".getBytes().length, -1);
    when(servletInputStream.read(new byte[1024], 0, 1024)).thenReturn("test".getBytes().length).thenReturn(-1);
    servlet.doPost(request, response);
    verify(servletOutputStream).println(contains("Data Received: test"));
  }
}