/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletBeanValCDI_Coverage_Test_Failing {
  private HttpServletResponse res;
  private PingServletBeanValCDI pingServletBeanValCDI;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_CallsDoGet_PPHz1_JuFJ0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletBeanValCDI pingServletBeanValCDI = spy(new PingServletBeanValCDI());
    doCallRealMethod().when(pingServletBeanValCDI).doPost(req, res);
    pingServletBeanValCDI.doPost(req, res);
    verify(pingServletBeanValCDI, atLeastOnce()).doGet(any(HttpServletRequest.class), any(HttpServletResponse.class));
  }
}