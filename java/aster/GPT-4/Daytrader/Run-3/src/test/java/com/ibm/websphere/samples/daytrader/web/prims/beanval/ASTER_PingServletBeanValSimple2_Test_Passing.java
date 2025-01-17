/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
public class Aster_PingServletBeanValSimple2_Test_Passing {
  private static LocalDateTime initTime;
  PingServletBeanValSimple2 pingServletBeanValSimple2;
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  PingServletBeanValSimple2 pingServlet;
  HttpServletRequest request;
  HttpServletResponse response;
  ServletOutputStream outputStream;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_dQpn0_fid1() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    // Mock the doGet method to do nothing when called
    doNothing().when(servlet).doGet(req, res);
    // Simulate the doPost method call
    servlet.doPost(req, res);
    // Verify that doGet was called exactly once during the doPost call
    verify(servlet, times(1)).doGet(req, res);
  }
}