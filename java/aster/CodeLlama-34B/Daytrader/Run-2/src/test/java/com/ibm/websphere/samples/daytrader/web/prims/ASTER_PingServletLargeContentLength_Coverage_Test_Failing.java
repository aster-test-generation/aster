/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_PingServletLargeContentLength_Coverage_Test_Failing {
  private ServletConfig config;
  private PingServletLargeContentLength servlet;
  private HttpServletResponse response;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_tUuc0() throws Exception {
    servlet = new PingServletLargeContentLength();
    config = mock(ServletConfig.class);
    when(config.getInitParameter("large-content-length")).thenReturn("1000000");
    servlet.init(config);
  }
}