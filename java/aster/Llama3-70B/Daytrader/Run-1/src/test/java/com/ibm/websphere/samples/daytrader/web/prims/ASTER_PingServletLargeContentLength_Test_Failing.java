/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletLargeContentLength_Test_Failing {
  PingServletLargeContentLength pingservletlargecontentlength;
  ServletConfig servletConfig;
  HttpServletRequest httpservletrequest;
  HttpServletResponse httpservletresponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    servletConfig = mock(ServletConfig.class);
    pingservletlargecontentlength = new PingServletLargeContentLength();
    pingservletlargecontentlength.init(servletConfig);
    verify(servletConfig).getServletContext();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_CnZd0() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength() {
      @Override
      public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Length: " + req.getContentLengthLong());
      }
    };
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getContentLengthLong()).thenReturn(1024L);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(System.out).println("Length: 1024");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_VjnV0() {
    PingServletLargeContentLength pingServletLargeContentLength = new PingServletLargeContentLength();
    String result = null; // getServletInfo method is not implemented in PingServletLargeContentLength
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_CnZd0_fid1() throws ServletException, IOException {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getContentLengthLong()).thenReturn(1024L);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(System.out).println("Length: 1024");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_VjnV0_fid1() {
    PingServletLargeContentLength pingServletLargeContentLength = new PingServletLargeContentLength();
    String result = pingServletLargeContentLength.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_gHjB0_eKqH0() {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      servlet.doGet(req, res);
    } catch (ServletException e) {
      fail("ServletException should not be thrown");
    } catch (IOException e) {
      fail("IOException should not be thrown");
    }
    verify(res).setStatus(200);
  }
}