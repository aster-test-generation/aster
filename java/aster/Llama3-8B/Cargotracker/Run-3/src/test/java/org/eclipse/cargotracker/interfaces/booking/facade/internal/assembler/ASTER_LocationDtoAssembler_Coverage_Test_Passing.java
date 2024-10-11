/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationDtoAssembler_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStream_ZNMO2_gSmP0() {
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = new ArrayList<>();
    LocationDtoAssembler locationDtoAssembler = new LocationDtoAssembler();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> dtoList = new ArrayList<>();
    dtoList = locationDtoAssembler.toDtoList(allLocations);
    Assertions.assertNotNull(dtoList);
  }
}