/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.logging;

import jakarta.enterprise.inject.spi.InjectionPoint;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_LoggerProducer_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_produceLogger_with_null_bean_OZIa0() {
    LoggerProducer loggerProducer = new LoggerProducer();
    InjectionPoint injectionPoint = mock(InjectionPoint.class);
    when(injectionPoint.getBean()).thenReturn(null);
    Logger logger = loggerProducer.produceLogger(injectionPoint);
    assertNotNull(logger);
  }
}