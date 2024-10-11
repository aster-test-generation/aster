/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExplicitGC_Test_Failing {
  private static int hitCount;
  private static String initTime;
  ExplicitGC explicitgc;
  HttpServlet httpservlet;
  HttpServletResponse httpservletresponse;
  ServletOutputStream servletoutputstream;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    httpservlet = mock(HttpServlet.class);
    explicitgc = new ExplicitGC();
    when(httpservlet.getServletConfig()).thenReturn(mock(ServletConfig.class));
    explicitgc.init(httpservlet.getServletConfig());
    assertEquals(0, hitCount);
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservlet = mock(HttpServlet.class);
    explicitgc = new ExplicitGC();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    explicitgc.doPost(null, httpservletresponse);
    verify(httpservletresponse, times(1)).getOutputStream();
    verify(servletoutputstream, times(1)).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    explicitgc = new ExplicitGC();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    explicitgc.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).getOutputStream();
    verify(servletoutputstream, times(1)).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getServletInfoTest_VOio0() {
    ExplicitGC explicitGC = new ExplicitGC();
    String actual = explicitGC.getServletInfo();
    assertEquals("Generate Explicit GC to VM", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    explicitgc = new ExplicitGC();
    when(httpservlet.getServletConfig()).thenReturn(mock(ServletConfig.class));
    explicitgc.init(httpservlet.getServletConfig());
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    explicitgc = new ExplicitGC();
    when(httpservlet.getServletConfig()).thenReturn(mock(ServletConfig.class));
    explicitgc.init(httpservlet.getServletConfig());
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_hJHB0_uvOV0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ExplicitGC obj = new ExplicitGC();
    obj.doGet(req, res);
    assertNotNull(obj);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_hJHB0_uvOV0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ExplicitGC obj = new ExplicitGC();
    obj.doGet(req, res);
  }
}