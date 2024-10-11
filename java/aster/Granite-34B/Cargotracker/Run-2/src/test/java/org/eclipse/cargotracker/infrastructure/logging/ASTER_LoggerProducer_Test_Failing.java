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

public class Aster_LoggerProducer_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProduceLoggerWithNullInjectionPoint_yQme1() {
    LoggerProducer loggerProducer = new LoggerProducer();
    InjectionPoint injectionPoint = null;
    Logger logger = loggerProducer.produceLogger(injectionPoint);
    assertNotNull(logger);
  }
}