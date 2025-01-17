/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingCDIBean_Test_Failing {
  private static int getBeanManagerHitCountJNDI = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_success_XfjY0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaCDICurrent_success_ebIY0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_failure_UmCD1_fid1() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertEquals(0, result);
  }
}