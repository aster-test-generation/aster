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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletDrive_Coverage_Test_Failing {
  private ServletConfig servletConfig;
  private PingServletDrive pingServletDrive;

  private int getHitCount(PingServletDrive pingServletDrive) throws Exception {
    return (int) PingServletDrive.class.getDeclaredField("hitCount").get(pingServletDrive);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_DiDd0() throws Exception {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletDrive.doPost(req, res);
    verify(req).getMethod(); // This will fail if doGet is not called
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_NoException_MAwz1() throws Exception {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletDrive.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_qaoH0() {
    PingServletDrive pingServletDrive = new PingServletDrive();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = pingServletDrive.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  public void testDoGet_ToGx0() throws ServletException, IOException {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingServletDrive.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_qaoH0_fid1() {
    PingServlet pingServlet = new PingServlet();
    String actual = pingServlet.getServletInfo();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_hjWq1_fid1() {
    PingServlet pingServlet = new PingServlet();
    String expected = "PingServlet/1.0";
    String actual = pingServlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_PbQM0() throws javax.servlet.ServletException {
    pingServletDrive = new PingServletDrive();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_vELd0() throws javax.servlet.ServletException, java.io.IOException {
    pingServletDrive = new PingServletDrive();
  }
}