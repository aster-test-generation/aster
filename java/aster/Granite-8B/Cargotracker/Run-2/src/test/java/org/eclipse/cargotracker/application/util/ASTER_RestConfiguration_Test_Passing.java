/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.glassfish.jersey.server.ServerProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RestConfiguration_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProperties_RAKo0_1() {
    RestConfiguration restConfiguration = new RestConfiguration();
    Map<String, Object> properties = restConfiguration.getProperties();
    assertNotNull(properties);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProperties_RAKo0_2() {
    RestConfiguration restConfiguration = new RestConfiguration();
    Map<String, Object> properties = restConfiguration.getProperties();
    assertEquals(true, properties.get(ServerProperties.BV_SEND_ERROR_IN_RESPONSE));
  }
}