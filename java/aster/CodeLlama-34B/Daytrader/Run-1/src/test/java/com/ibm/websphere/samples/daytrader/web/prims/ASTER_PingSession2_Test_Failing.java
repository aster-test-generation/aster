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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession2_Test_Failing {
  private static int hitCount;
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_yobc0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_NullRequest_stGL1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_NullResponse_pKAe2() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    pingSession2.doPost(req, res);
    verify(req).getMethod();
    verify(res, never()).setStatus(HttpServletResponse.SC_OK);
    verify(res, never()).setContentType("text/html");
    verify(res, never()).getWriter();
    verify(res, never()).getOutputStream();
    verify(res, never()).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_InvalidMethod_iCgH3() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID");
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_InvalidContentType_imlP4() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(req.getContentType()).thenReturn("INVALID");
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_InvalidContentLength_iWWX5() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(req.getContentType()).thenReturn("application/json");
    when(req.getContentLength()).thenReturn(-1);
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_LENGTH_REQUIRED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_vZRC0() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "HTTP Session Key: Tests management of a read/write unique id";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_FuCD1() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = null;
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithEmptyString_sNDA2() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidString_DuqE3() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid string";
    String actual = pingSession2.getServletInfo();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithDifferentString_skcT5() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "HTTP Session Key: Tests management of a read/write unique id";
    String actual = pingSession2.getServletInfo();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServlet_zRrz8() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid servlet";
    String actual = pingSession2.getServletInfo();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServletConfig_VwSH13() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid servlet config";
    String actual = pingSession2.getServletInfo();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithValidServletConfig_YwDZ14() {
    PingSession2 pingSession2 = new PingSession2();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_yobc0_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_OK, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_NullRequest_stGL1_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_BAD_REQUEST, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_InvalidMethod_iCgH3_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID");
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_METHOD_NOT_ALLOWED, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_InvalidContentType_imlP4_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(req.getContentType()).thenReturn("INVALID");
    pingSession2.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).getOutputStream();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_FuCD1_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "PingSession2";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidString_DuqE3_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid string";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServlet_zRrz8_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid servlet";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServletConfig_VwSH13_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "Invalid servlet config";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithValidServletConfig_YwDZ14_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    assertNotNull(pingSession2);
  }
}