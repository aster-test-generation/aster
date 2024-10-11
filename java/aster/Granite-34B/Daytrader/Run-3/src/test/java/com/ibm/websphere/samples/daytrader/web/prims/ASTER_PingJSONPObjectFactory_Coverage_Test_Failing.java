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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingJSONPObjectFactory_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_bOwv0() {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    String expected = "Basic JSON generation and parsing in a servlet";
    assertEquals(expected, pingJSONPObjectFactory.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_JdMn0() throws javax.servlet.ServletException, java.io.IOException {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    try {
      pingJSONPObjectFactory.doPost(req, res);
    } catch (ServletException | IOException e) {
      assertEquals("Error", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_htGn0() throws ServletException, IOException {
    PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    factory.doGet(req, res);
    verify(res, times(1)).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_lOOY1() throws ServletException, IOException {
    PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    factory.doGet(req, res);
    verify(res, times(1)).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet3_MXrw2() throws ServletException, IOException {
    PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    factory.doGet(req, res);
    verify(res, times(1)).sendError(500, "error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet13_mmba12() throws ServletException, IOException {
    PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
  }
}