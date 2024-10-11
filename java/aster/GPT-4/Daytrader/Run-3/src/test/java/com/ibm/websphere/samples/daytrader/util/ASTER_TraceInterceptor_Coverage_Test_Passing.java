/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import javax.interceptor.InvocationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_TraceInterceptor_Coverage_Test_Passing {
  private TraceInterceptor traceInterceptor;
  private InvocationContext ctx;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_uWdt0() throws java.lang.Exception {
    traceInterceptor = new TraceInterceptor();
    ctx = mock(InvocationContext.class);
  }
}