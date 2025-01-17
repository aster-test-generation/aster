/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletLargeContentLength_Test_Failing {
PingServletLargeContentLength pingservletlargecontentlength;
ServletConfig servletConfig;
HttpServlet httpservlet;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        servletConfig = mock(ServletConfig.class);
        httpservlet = mock(HttpServlet.class);
        pingservletlargecontentlength = new PingServletLargeContentLength();
        // when
        pingservletlargecontentlength.init(servletConfig);
        // then
        verify(httpservlet).init(servletConfig);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservletlargecontentlength = new PingServletLargeContentLength();
        pingservletlargecontentlength.doGet(httpservletrequest, httpservletresponse);
        verify(pingservletlargecontentlength).doPost(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_TzPA0() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getContentLengthLong()).thenReturn(1000L);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(System.out).println("Length: 1000");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_IVql0() {
    PingServletLargeContentLength pingServletLargeContentLength = new PingServletLargeContentLength();
    String result = pingServletLargeContentLength.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_yRtU0_tWlS0() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        servlet.doGet(req, res);
    } catch (ServletException e) {
        fail("ServletException was thrown");
    }
    verify(res).setStatus(200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_TzPA0_fid1() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength() {
        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            System.out.println("Length: " + req.getContentLengthLong());
        }
    };
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getContentLengthLong()).thenReturn(1000L);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(System.out).println("Length: 1000");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_IVql0_fid1() {
    PingServletLargeContentLength pingServletLargeContentLength = new PingServletLargeContentLength();
    String result = pingServletLargeContentLength.getClass().getAnnotation(javax.servlet.annotation.WebServlet.class).description();
    assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_yRtU0_tWlS0_fid1() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        servlet.init();
        servlet.doGet(req, res);
    } catch (ServletException e) {
        fail("ServletException was thrown");
    }
    verify(res).setStatus(200);
}
}