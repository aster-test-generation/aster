/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
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

public class Aster_PingServlet31Async_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_Vuby0() {
    PingServlet31Async servlet = new PingServlet31Async();
    String actual = servlet.getServletInfo();
    String expected = "Basic dynamic HTML generation through a servlet";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_mhKK0() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    try {
      servlet.doGet(request, response);
      verify(servlet, times(1)).doPost(request, response);
    } catch (ServletException | IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_YewG1() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    try {
      servlet.doPost(request, response);
    } catch (ServletException | IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_zBWf0() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    assertEquals("text/html", response.getContentType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test2_DkBX1() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    assertEquals(true, request.isAsyncStarted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test3_lhjf2() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    assertEquals(true, request.getInputStream() instanceof ServletInputStream);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test4_WNBo3() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet31Async servlet = new PingServlet31Async();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    assertEquals(true, request.getInputStream().isReady());
  }
}