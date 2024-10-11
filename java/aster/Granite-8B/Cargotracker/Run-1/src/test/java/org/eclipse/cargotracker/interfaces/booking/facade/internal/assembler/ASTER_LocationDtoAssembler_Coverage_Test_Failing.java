/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationDtoAssembler_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDtoListWithNull_aULp1() {
    LocationDtoAssembler assembler = new LocationDtoAssembler();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> expectedDtoList = new ArrayList<>();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> actualDtoList = assembler.toDtoList(null);
    assertEquals(expectedDtoList, actualDtoList);
  }
}