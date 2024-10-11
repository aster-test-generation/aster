/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletInputStream;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet31AsyncRead_Test_Passing {
  ServletInputStream servletinputstream;
  private static int hitCount;
  HttpServlet httpservlet;
  private static String initTime;
  PingServlet31AsyncRead pingservlet31asyncread;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletinputstream = mock(ServletInputStream.class);
    httpservlet = mock(HttpServlet.class);
    pingservlet31asyncread = new PingServlet31AsyncRead();
    when(httpservletrequest.getInputStream()).thenReturn(servletinputstream);
    pingservlet31asyncread.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).setStatus(200);
  }
}