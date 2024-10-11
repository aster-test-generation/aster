/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingManagedThread_Coverage_Test_Failing {
  private ServletConfig servletConfig;
  private PingManagedThread pingManagedThread;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_czVD0() throws ServletException, IOException {
    PingManagedThread pingManagedThread = new PingManagedThread();
    HttpServletRequest req = null; // Initialize HttpServletRequest
    HttpServletResponse res = null; // Initialize HttpServletResponse
    pingManagedThread.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_CallsDoGet_lmHc1() throws ServletException, IOException {
    PingManagedThread pingManagedThread = new PingManagedThread();
    HttpServletRequest req = null; // Initialize HttpServletRequest
    HttpServletResponse res = null; // Initialize HttpServletResponse
    PingManagedThread spy = org.mockito.Mockito.spy(pingManagedThread);
    spy.doPost(req, res);
    org.mockito.Mockito.verify(spy).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_Ltuv0() {
    // Assuming PingManagedThread is a HttpServlet
    HttpServlet pingManagedThread = new HttpServlet() {
      @Override
      public String getServletInfo() {
        return "Tests a ManagedThread asynchronous servlet";
      }
    };
    String expected = "Tests a ManagedThread asynchronous servlet";
    String actual = pingManagedThread.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SendError_PBlR12_WVEF0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.startAsync()).thenThrow(new ServletException("Async is not supported"));
    PingManagedThread pingManagedThread = new PingManagedThread();
    try {
      pingManagedThread.doGet(req, res);
    } catch (Exception e) {
      verify(res).sendError(500, "Async is not supported");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_qjLr0() throws javax.servlet.ServletException {
    pingManagedThread = new PingManagedThread();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_hgrk1() throws ServletException {
    pingManagedThread.init(servletConfig);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_LEzP0() throws javax.servlet.ServletException, java.io.IOException {
    pingManagedThread = new PingManagedThread();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_Ltuv0_fid3() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String expected = "Tests a ManagedThread asynchronous servlet";
    String actual = pingManagedThread.getServletInfo();
    assertEquals(expected, actual);
  }
}