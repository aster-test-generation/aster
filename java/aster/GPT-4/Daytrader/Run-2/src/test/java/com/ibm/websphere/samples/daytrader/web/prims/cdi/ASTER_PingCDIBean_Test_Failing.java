/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.naming.InitialContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingCDIBean_Test_Failing {
  PingCDIBean pingcdibean;
  InitialContext initialContext;
  BeanManager beanManager;
  private static int getBeanManagerHitCountJNDI = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanManagerViaCDICurrentWithBeans_HkWB0() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    BeanManager beanManager = mock(BeanManager.class);
    Set<Bean<?>> mockBeans = new HashSet<>();
    mockBeans.add(mock(Bean.class));
    InitialContext initialContext = mock(InitialContext.class);
    when(initialContext.lookup("java:comp/BeanManager")).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(mockBeans);
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetBeanMangerViaJNDI_WithNonEmptyBeans() throws Exception {
    initialContext = mock(InitialContext.class);
    beanManager = mock(BeanManager.class);
    pingcdibean = new PingCDIBean();
    when(new InitialContext().lookup("java:comp/BeanManager")).thenReturn(beanManager);
    Set<Bean<?>> beans = new HashSet<>();
    beans.add(mock(Bean.class));
    when(beanManager.getBeans(Object.class)).thenReturn(beans);
    int result = pingcdibean.getBeanMangerViaJNDI();
    assertEquals(1, result, "The hit count should be incremented to 1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetBeanMangerViaJNDI_WithEmptyBeans() throws Exception {
    initialContext = mock(InitialContext.class);
    beanManager = mock(BeanManager.class);
    pingcdibean = new PingCDIBean();
    when(new InitialContext().lookup("java:comp/BeanManager")).thenReturn(beanManager);
    Set<Bean<?>> beans = Collections.emptySet();
    when(beanManager.getBeans(Object.class)).thenReturn(beans);
    int result = pingcdibean.getBeanMangerViaJNDI();
    assertEquals(0, result, "The hit count should remain 0");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanManagerViaCDICurrentWithBeans_HkWB0_fid1() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    CDI<Object> cdi = mock(CDI.class);
    BeanManager beanManager = mock(BeanManager.class);
    Set<Bean<?>> mockBeans = new HashSet<>();
    mockBeans.add(mock(Bean.class));
    when(CDI.current()).thenReturn(cdi);
    when(cdi.getBeanManager()).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(mockBeans);
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanManagerViaCDICurrentWithoutBeans_rYyZ1() throws Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    CDI<Object> cdi = mock(CDI.class);
    BeanManager beanManager = mock(BeanManager.class);
    Set<Bean<?>> mockBeans = Collections.emptySet();
    when(CDI.current()).thenReturn(cdi);
    when(cdi.getBeanManager()).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(mockBeans);
    int result = pingCDIBean.getBeanMangerViaCDICurrent();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBeanManagerViaJNDINonEmptyBeans_FVQd0_IJYs0() throws Exception {
    InitialContext ctx = mock(InitialContext.class);
    BeanManager beanManager = mock(BeanManager.class);
    Set<Bean<?>> mockBeans = new HashSet<>();
    mockBeans.add(mock(Bean.class));
    when(ctx.lookup("java:comp/BeanManager")).thenReturn(beanManager);
    when(beanManager.getBeans(Object.class)).thenReturn(mockBeans);
    System.setProperty("java.naming.factory.initial", "org.mockito.jndi.MockitoContextFactory");
    PingCDIBean pingCDIBean = new PingCDIBean();
    int result = pingCDIBean.getBeanMangerViaJNDI();
    assertEquals(1, result);
  }
}