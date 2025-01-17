/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingManagedThread_Test_Passing {
  private static int hitCount;
  private static String initTime;
  private ManagedThreadFactory managedThreadFactory;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_iDFM0() throws ServletException, IOException {
    PingManagedThread pingManagedThread = new PingManagedThread();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    pingManagedThread.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("<html><head><title>Ping ManagedThread</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedThread<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR/><BR/></FONT>");
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ysbw0() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String servletInfo = pingManagedThread.getServletInfo();
    assertEquals("Tests a ManagedThread asynchronous servlet", servletInfo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_UxEf1_qPfu0() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String servletInfo = pingManagedThread.getServletInfo();
    assertNull(servletInfo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidString_YMmO4_PfYH0() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String servletInfo = pingManagedThread.getServletInfo();
    assertNotNull(servletInfo);
  }
}