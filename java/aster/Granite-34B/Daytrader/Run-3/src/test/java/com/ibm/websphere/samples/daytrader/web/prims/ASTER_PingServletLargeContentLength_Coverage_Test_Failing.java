/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServletLargeContentLength_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_dJrw0() throws javax.servlet.ServletException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    ServletConfig config = new MockServletConfig();
    servlet.init(config);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_YAEU0() {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    String expected = "Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_kWAh0() throws ServletException, IOException {
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    servlet.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_1_pWUi0() throws javax.servlet.ServletException, java.io.IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      servlet.doPost(request, response);
    } catch (ServletException | IOException e) {
      e.printStackTrace();
    }
    System.out.println("Length: " + request.getContentLengthLong());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_2_BbLt1() throws javax.servlet.ServletException, java.io.IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      servlet.doPost(request, response);
    } catch (ServletException | IOException e) {
      e.printStackTrace();
    }
  }
}