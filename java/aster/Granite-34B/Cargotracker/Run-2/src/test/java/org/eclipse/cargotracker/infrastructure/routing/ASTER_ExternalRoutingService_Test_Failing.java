/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.routing;

import jakarta.inject.Inject;
import jakarta.ws.rs.client.WebTarget;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExternalRoutingService_Test_Failing {
  @Inject
  private Logger logger;
  private WebTarget graphTraversalResource;
  ExternalRoutingService externalroutingservice;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_vldP3_nmcs0() throws NoSuchFieldException, IllegalAccessException {
    ExternalRoutingService externalRoutingService = new ExternalRoutingService();
    externalRoutingService.init();
    Field loggerField = ExternalRoutingService.class.getDeclaredField("logger");
    loggerField.setAccessible(true);
    assertNull(loggerField.get(externalRoutingService));
  }
}