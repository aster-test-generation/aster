/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationDtoAssembler_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toDtoList_ReturnsListWithOneElement_WhenInputListHasOneElement_kzjr1_Jpng0() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = Collections.singletonList(new org.eclipse.cargotracker.domain.model.location.Location());
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> result = assembler.toDtoList(allLocations);
    assertEquals(1, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toDtoList_ReturnsListWithMultipleElements_WhenInputListHasMultipleElements_qmtK2_SdkO0() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = new ArrayList<>();
    allLocations.add(new org.eclipse.cargotracker.domain.model.location.Location());
    allLocations.add(new org.eclipse.cargotracker.domain.model.location.Location());
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> result = assembler.toDtoList(allLocations);
    assertEquals(2, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toDtoList_ReturnsListWithOneElement_WhenInputListHasOneElement_kzjr1_Jpng0_fid2() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    org.eclipse.cargotracker.domain.model.location.Location location = new org.eclipse.cargotracker.domain.model.location.Location();
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = Collections.singletonList(location);
    assembler.toDto(location); // Ensure assembler is not null
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> result = assembler.toDtoList(allLocations);
    assertNotNull(result);
    assertEquals(1, result.size());
    assertNotNull(result.get(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toDtoList_ReturnsListWithMultipleElements_WhenInputListHasMultipleElements_qmtK2_SdkO0_fid2() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    assertNotNull(assembler); // Ensure assembler is not null
    List<org.eclipse.cargotracker.domain.model.location.Location> allLocations = new ArrayList<>();
    allLocations.add(new org.eclipse.cargotracker.domain.model.location.Location());
    allLocations.add(new org.eclipse.cargotracker.domain.model.location.Location());
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> result = assembler.toDtoList(allLocations);
    assertNotNull(result); // Ensure result is not null
    assertEquals(2, result.size());
  }
}