/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.io.PrintWriter;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSimple_Test_Failing {
  PingServletSimple pingServletSimple;
  ServletConfig mockServletConfig;
  HttpServletRequest request;
  HttpServletResponse response;
  PrintWriter printWriter;
  private static int hitCount;
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_etax0_1() throws ServletException {
    pingServletSimple = new PingServletSimple();
    mockServletConfig = mock(ServletConfig.class);
    pingServletSimple.init(mockServletConfig);
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_etax0_2() throws ServletException {
    pingServletSimple = new PingServletSimple();
    mockServletConfig = mock(ServletConfig.class);
    pingServletSimple.init(mockServletConfig);
    assertEquals(0, hitCount);
  }
}