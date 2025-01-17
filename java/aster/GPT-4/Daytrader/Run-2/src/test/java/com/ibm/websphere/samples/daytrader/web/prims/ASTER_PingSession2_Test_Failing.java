/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession2_Test_Failing {
  @Mock
  private ServletConfig mockConfig;
  @InjectMocks
  private static String initTime;
  private static int hitCount;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_cjYy0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingSession2 pingSession = new PingSession2();
    pingSession.doPost(request, response);
    verify(request, atLeastOnce()).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Btbs0() {
    PingSession2 session = new PingSession2();
    String result = session.getServletInfo();
    assertEquals("HTTP Session Key: Tests management of a read/write unique id", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Btbs0_fid1() {
    PingSession2 session = new PingSession2();
    String result = session.getServletInfo();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_lhrj0_fid2() throws Exception {
    HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
    HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
    HttpSession httpSession = mock(HttpSession.class);
    when(httpServletRequest.getSession(true)).thenReturn(httpSession);
    when(httpSession.getAttribute("sessiontest.counter")).thenReturn(null);
    PrintWriter printWriter = mock(PrintWriter.class);
    when(httpServletResponse.getWriter()).thenReturn(printWriter);
    PingSession2 pingSession2 = new PingSession2();
    pingSession2.doGet(httpServletRequest, httpServletResponse);
    verify(httpServletRequest, times(1)).getSession(true);
    verify(httpSession, times(1)).getAttribute("sessiontest.counter");
    verify(httpSession, times(1)).setAttribute(eq("sessiontest.counter"), any());
    verify(httpServletResponse).setContentType("text/html");
    verify(httpServletResponse).setHeader(eq("SessionTrackingTest-counter"), anyString());
    verify(printWriter).println(anyString());
  }
}