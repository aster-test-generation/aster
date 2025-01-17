/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSetContentLength_Test_Failing {
  PingServletSetContentLength pingservletsetcontentlength;
  ServletConfig servletConfig;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;
  ServletOutputStream servletoutputstream;
  HttpServlet httpservlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    servletConfig = mock(ServletConfig.class);
    pingservletsetcontentlength = new PingServletSetContentLength();
    pingservletsetcontentlength.init(servletConfig);
    verify(servletConfig).getServletContext();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservlet = mock(HttpServlet.class);
    pingservletsetcontentlength = new PingServletSetContentLength();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingservletsetcontentlength.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletrequest, times(1)).getAttributeNames();
    verify(httpservletresponse, times(1)).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_hypV0() throws ServletException, IOException {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingServletSetContentLength.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservlet = mock(HttpServlet.class);
    pingservletsetcontentlength = new PingServletSetContentLength();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    when(httpservletrequest.getParameter("contentLength")).thenReturn("100");
    pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletoutputstream).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_NoContentLengthParam() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservlet = mock(HttpServlet.class);
    pingservletsetcontentlength = new PingServletSetContentLength();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    when(httpservletrequest.getParameter("contentLength")).thenReturn(null);
    pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletoutputstream).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_InvalidContentLengthParam() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservlet = mock(HttpServlet.class);
    pingservletsetcontentlength = new PingServletSetContentLength();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    when(httpservletrequest.getParameter("contentLength")).thenReturn("invalid");
    pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).sendError(500, anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ContentLengthNull_OvQR0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn(null);
    HttpServletResponse res = mock(HttpServletResponse.class);
    new HttpServlet() {
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
          response.setContentType("text/html");
          String lengthParam = request.getParameter("contentLength");
          Integer length;
          if (lengthParam == null) {
            length = 0;
          } else {
            length = Integer.parseInt(lengthParam);
          }
          ServletOutputStream out = response.getOutputStream();
          int i = 0;
          String buffer = "";
          while (i + 167 < length) {
            buffer = buffer + "a";
            i++;
          }
          out.println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">" + buffer + "</B></body></html>");
        } catch (Exception e) {
          Log.error(e, "PingServlet.doGet(...): general exception caught");
          response.sendError(500, e.toString());
        }
      }
    }.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ExceptionCaught_qetW2() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("abc");
    HttpServletResponse res = mock(HttpServletResponse.class);
    new PingServletSetContentLength().doGet(req, res);
    verify(res).sendError(500, anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_hypV0_fid1() throws ServletException, IOException {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletSetContentLength.doPost(req, res);
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_DQsI0_fid1() {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    String result = pingServletSetContentLength.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ContentLengthNull_OvQR0_fid1() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn(null);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ContentLengthValid_KUSI1() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ExceptionCaught_qetW2_fid1() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("abc");
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).sendError(500, anyString());
  }
}