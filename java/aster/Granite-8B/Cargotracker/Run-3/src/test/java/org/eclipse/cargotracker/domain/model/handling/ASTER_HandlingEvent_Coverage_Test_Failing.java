/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEvent_Coverage_Test_Failing {
  HandlingEvent handlingEvent;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_JHhF0() {
    HandlingEvent handlingEvent = new HandlingEvent();
    HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
    assertEquals(hashCodeBuilder.toHashCode(), handlingEvent.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithCargo_lzmL1() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Cargo cargo = new Cargo();
    HashCodeBuilder hashCodeBuilder = new HashCodeBuilder().append(cargo);
    assertEquals(hashCodeBuilder.toHashCode(), handlingEvent.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithVoyage_hVrR2() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Voyage voyage = new Voyage();
    HashCodeBuilder hashCodeBuilder = new HashCodeBuilder().append(voyage);
    assertEquals(hashCodeBuilder.toHashCode(), handlingEvent.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_DHKK1() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String expected = "\n--- Handling event ---\nCargo: \nType: null\nLocation: \nCompleted on: null\nRegistered on: null\n";
    assertEquals(expected, handlingEvent.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString2_UGwX2() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String expected = "\n--- Handling event ---\nCargo: \nType: null\nLocation: \nCompleted on: null\nRegistered on: null\nVoyage: \n";
    assertEquals(expected, handlingEvent.toString());
  }
}