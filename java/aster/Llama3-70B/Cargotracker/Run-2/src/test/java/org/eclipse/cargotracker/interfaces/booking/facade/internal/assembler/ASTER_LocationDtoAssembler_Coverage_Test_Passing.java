/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationDtoAssembler_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toDtoList_ReturnsEmptyList_WhenInputListIsEmpty_OLIL0_Ooyp0() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = new ArrayList<>();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> result = assembler.toDtoList(allLocations);
    assertTrue(result.isEmpty());
  }
}