/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingServlet2Session_Coverage_Test_Passing {
  private PingServlet2Session servlet;
  private HttpServletRequest mockReq;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_DrUC0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet2Session servlet = new PingServlet2Session();
    servlet.doPost(request, response);
    verify(servlet).doGet(request, response);
  }
}