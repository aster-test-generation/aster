/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import com.ibm.websphere.samples.daytrader.web.prims.PingServlet;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletDrive_Test_Failing {
  private static String initTime;
  private static int hitCount;
  PingServletDrive pingservletdrive;
  ServletConfig servletConfig;
  HttpServletResponse httpservletresponse;
  ServletOutputStream servletoutputstream;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingservletdrive = new PingServletDrive();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingservletdrive.doPost(httpservletrequest, httpservletresponse);
    verify(pingservletdrive).doGet(httpservletrequest, httpservletresponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_tPzy0() throws ServletException, IOException {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletDrive.doPost(req, res);
    verify(req).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_cIJW0() {
    PingServletDrive pingServletDrive = new PingServletDrive();
    String result = pingServletDrive.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_tPzy0_fid1() throws ServletException, IOException {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_NIya0() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingservletdrive = new PingServletDrive();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingservletdrive.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletoutputstream).println(anyString());
  }
}