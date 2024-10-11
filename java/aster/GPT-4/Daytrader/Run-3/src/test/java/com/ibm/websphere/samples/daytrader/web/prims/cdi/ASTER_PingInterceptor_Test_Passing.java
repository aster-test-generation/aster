/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.interceptor.InvocationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_PingInterceptor_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMethodInterceptor_cFoO0() throws Exception {
    PingInterceptor interceptor = new PingInterceptor();
    InvocationContext mockContext = mock(InvocationContext.class);
    when(mockContext.proceed()).thenReturn("Expected Result");
    Object result = interceptor.methodInterceptor(mockContext);
    assertEquals("Expected Result", result);
  }
}