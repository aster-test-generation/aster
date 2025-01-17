/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSetContentLength_Test_Passing {
  @Mock
  PingServletSetContentLength pingservletsetcontentlength;
  @Mock
  HttpServlet httpservlet;
  @Mock
  HttpServletResponse httpservletresponse;
  @Mock
  HttpServletRequest httpservletrequest;
  @Mock
  ServletOutputStream servletoutputstream;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_BXkv0() {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    String expected = "Basic dynamic HTML generation through a servlet, with " + "contentLength set by contentLength parameter.";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).setContentType("text/html");
    verify(httpservletresponse, times(1)).getOutputStream();
    verify(servletoutputstream, times(1)).println(anyString());
  }
}