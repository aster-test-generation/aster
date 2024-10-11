/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2IncludeRcv_Test_Failing {
  PingServlet2IncludeRcv pingservlet2includercv;
  HttpServletRequest req;
  HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    pingservlet2includercv = new PingServlet2IncludeRcv();
    req = mock(HttpServletRequest.class);
    res = mock(HttpServletResponse.class);
    pingservlet2includercv.doPost(req, res);
    verify(pingservlet2includercv).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_DxOC0() throws ServletException, IOException {
    PingServlet2IncludeRcv pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2IncludeRcv.doPost(req, res);
    verify(req, times(1)).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    pingservlet2includercv = new PingServlet2IncludeRcv();
    req = mock(HttpServletRequest.class);
    res = mock(HttpServletResponse.class);
    pingservlet2includercv.doGet(req, res);
    verify(req, times(1)).getAttributeNames();
    verify(res, times(1)).setStatus(HttpServletResponse.SC_OK);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_iBsu0() {
    PingServlet2IncludeRcv pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      pingServlet2IncludeRcv.doGet(req, res);
    } catch (ServletException | IOException e) {
      fail();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_DxOC0() throws ServletException, IOException {
    PingServlet2IncludeRcv pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2IncludeRcv.doGet(req, res);
    verify(req, times(0)).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_iBsu0_fid1() {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      new PingServlet2IncludeRcv().doGet(req, res);
      assertTrue(true);
    } catch (ServletException | IOException e) {
      fail();
    }
  }
}