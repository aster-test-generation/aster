/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.BeanManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingCDIBean_Coverage_Test_Passing {
  private BeanManager beanManager;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_exception_vMou2() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    try {
      int result = pingCDIBean.getBeanMangerViaJNDI();
      fail("Exception not thrown");
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }
}