/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.routing;

import jakarta.inject.Inject;
import jakarta.ws.rs.client.WebTarget;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.pathfinder.api.TransitPath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExternalRoutingService_Test_Failing {
  @Inject
  private Logger logger;
  private WebTarget graphTraversalResource;
  private RouteSpecification routeSpecification;
  private ExternalRoutingService externalRoutingService;
  @Mock
  private Itinerary itinerary;
  @Mock
  private TransitPath transitPath;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_OJSs0() {
    ExternalRoutingService externalRoutingService = new ExternalRoutingService();
    externalRoutingService.init();
  }
}