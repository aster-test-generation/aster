/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RestConfiguration_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProperties_NCzl0() throws Exception {
    RestConfiguration restConfiguration = new RestConfiguration();
    Map<String, Object> properties = restConfiguration.getProperties();
    Map<String, Object> expectedProperties = new HashMap<>();
    expectedProperties.put("BV_SEND_ERROR_IN_RESPONSE", true);
    assert properties.equals(expectedProperties);
  }
}