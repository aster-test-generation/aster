/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
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
public class Aster_PingServletSimple_Test_Failing {
  private static String initTime;
  private static int hitCount;
  PingServletSimple pingservletsimple;
  HttpServlet httpservlet;
  HttpServletRequest httpservletrequest;
  HttpServletResponse httpservletresponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    initTime = "2022-01-01";
    hitCount = 0;
    pingservletsimple = new PingServletSimple();
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    when(httpservletrequest.getParameter("initTime")).thenReturn(initTime);
    when(httpservletrequest.getParameter("hitCount")).thenReturn(String.valueOf(hitCount));
    pingservletsimple.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).getWriter();
    verify(httpservletresponse, times(1)).getWriter().write(any(String.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void doGet_should_write_html_content_to_response_when_request_is_valid_ytOe0() throws IOException, ServletException {
    PingServletSimple servlet = new PingServletSimple();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    servlet.doGet(request, response);
    verify(writer).write("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B><br>" + "<img src='images/graph.gif'>" + "</body></html>");
  }
}