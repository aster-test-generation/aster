/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.interceptor.InvocationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_PingInterceptor_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMethodInterceptorWithNullContext_jgbK1() throws Exception {
    PingInterceptor pingInterceptor = new PingInterceptor();
    InvocationContext ctx = null;
    try {
      pingInterceptor.methodInterceptor(ctx);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      assertTrue(true);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMethodInterceptor_ezJR0_WAZJ0() throws Exception {
    PingInterceptor pingInterceptor = new PingInterceptor();
    InvocationContext ctx = mock(InvocationContext.class);
    Object result = pingInterceptor.methodInterceptor(ctx);
    assertEquals(result, ctx.proceed());
  }
}