/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple2_Test_Failing {
  private static LocalDateTime initTime;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_pPym0() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_mKcB1() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullRequest_UeUs2() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullResponse_Nmae3() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullOutputStream_oydl4() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_ygIw2_sNkS0() {
    String expected = null;
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_mKcB1_fid2() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "java.io.IOException");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullOutputStream_oydl4_fid2() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
    // Fix the assertion
    assertEquals(null, res.getOutputStream());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_ygIw2_sNkS0_fid2() {
    String expected = null;
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    String actual = servlet.getServletInfo();
    assertNull(actual);
  }
}