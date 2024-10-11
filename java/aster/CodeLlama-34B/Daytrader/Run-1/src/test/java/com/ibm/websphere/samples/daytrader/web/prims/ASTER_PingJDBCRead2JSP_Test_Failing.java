/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJDBCRead2JSP_Test_Failing {
  private PingJDBCRead2JSP servlet;
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_dwTM0() {
    when(servlet.getServletInfo()).thenReturn("Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class");
    String actual = servlet.getServletInfo();
    assertEquals("Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_Qxyb0_CiUg0() {
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    ServletConfig config = mock(ServletConfig.class);
    try {
      servlet.init(config);
    } catch (ServletException e) {
      e.printStackTrace();
    }
    assertTrue(servlet.getServletConfig() == config);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullConfig_ETHm1_mPCy0() {
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    try {
      servlet.init(null);
    } catch (ServletException e) {
      e.printStackTrace();
    }
    assertNull(servlet.getServletConfig());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithInvalidConfig_mWAc2_LaPm0() {
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameter("ping.jdbc.read.2.jsp")).thenReturn(null);
    try {
      servlet.init(config);
    } catch (ServletException e) {
      e.printStackTrace();
    }
    assertNull(servlet.getServletConfig());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_Qxyb0_CiUg0_fid1() {
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    ServletConfig config = mock(ServletConfig.class);
    try {
      servlet.init(config);
    } catch (ServletException e) {
      e.printStackTrace();
    }
    assertTrue(servlet.getServletConfig() != null);
  }
}