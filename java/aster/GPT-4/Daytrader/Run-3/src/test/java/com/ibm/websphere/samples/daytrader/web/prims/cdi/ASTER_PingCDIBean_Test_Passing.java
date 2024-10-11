/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingCDIBean_Test_Passing {
  @Mock
  private InitialContext initialContext;
  @Mock
  private BeanManager beanManager;
  private PingCDIBean pingCdiBean;
  private static int getBeanManagerHitCountJNDI = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHelloIncrementsHitCount_QBdX0() {
    PingCDIBean pingCDIBean = new PingCDIBean();
    assertEquals(1, pingCDIBean.hello());
  }
}