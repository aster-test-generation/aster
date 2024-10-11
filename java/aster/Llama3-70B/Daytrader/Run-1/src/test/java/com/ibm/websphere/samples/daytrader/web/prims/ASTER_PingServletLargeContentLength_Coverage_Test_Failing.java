/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingServletLargeContentLength_Coverage_Test_Failing {
  private HttpServletResponse response;
  private PingServletLargeContentLength pingServletLargeContentLength;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Dnco1_nGbx0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingServlet.doGet(request, response);
    verify(response).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Dnco1_nGbx0_fid1() throws Exception {
    PingServletLargeContentLength pingServletLargeContentLength = new PingServletLargeContentLength();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingServletLargeContentLength.doGet(request, response);
    verify(response).setStatus(200);
  }
}