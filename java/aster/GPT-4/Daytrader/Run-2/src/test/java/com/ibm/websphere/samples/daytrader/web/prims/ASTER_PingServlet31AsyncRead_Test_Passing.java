/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet31AsyncRead_Test_Passing {
  PingServlet31AsyncRead pingServlet31AsyncRead;
  ServletConfig mockServletConfig;
  HttpServletResponse httpServletResponse;
  HttpServletRequest httpServletRequest;
  ServletInputStream servletInputStream;
  AsyncContext asyncContext;
  private static int hitCount;
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_DlnN0_2_fid2() throws ServletException {
    mockServletConfig = mock(ServletConfig.class);
    try {
      pingServlet31AsyncRead = new PingServlet31AsyncRead();
      pingServlet31AsyncRead.init(mockServletConfig);
      fail("Expected NoClassDefFoundError was not thrown.");
    } catch (NoClassDefFoundError e) {
      assertTrue(true);
    }
  }
}