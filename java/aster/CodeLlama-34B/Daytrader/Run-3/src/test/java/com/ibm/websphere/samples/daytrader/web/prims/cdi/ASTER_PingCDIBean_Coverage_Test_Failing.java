/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_PingCDIBean_Coverage_Test_Failing {
  private BeanManager beanManager;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaCDICurrent_BeanManagerNull_GThL0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    when(CDI.current().getBeanManager()).thenReturn(null);
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaCDICurrent_BeanManagerNotNull_GwDl1() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    when(CDI.current().getBeanManager()).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(null);
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaCDICurrent_BeanManagerNotNull_BeansEmpty_WYIx2() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    when(CDI.current().getBeanManager()).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(Collections.emptySet());
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_success_eeSf0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertTrue(result > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_failure_ZmEH1() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaJNDI_null_Kmmr3() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanMangerViaCDICurrent_BeanManagerNotNull_BeansNotEmpty_adsu3_QdUg0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    when(CDI.current().getBeanManager()).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(Collections.singleton(mock(Bean.class)));
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(1, result);
  }
}