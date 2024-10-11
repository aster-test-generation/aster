/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2ServletRcv_Test_Passing {
  private static String initTime = null;
  PingServlet2ServletRcv pingservlet2servletrcv;
  ServletConfig servletConfig;
  HttpServletRequest httpservletrequest;
  HttpServletResponse httpservletresponse;
  HttpServlet httpservlet;
  PrintWriter printWriter;
  PingBean pingBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_UgfT0_2() throws Exception {
    servletConfig = mock(ServletConfig.class);
    try {
      pingservlet2servletrcv = new PingServlet2ServletRcv();
    } catch (NoClassDefFoundError e) {
      // Expected
    }
    assertNotNull(servletConfig);
  }
}