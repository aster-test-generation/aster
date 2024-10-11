/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEvent_Coverage_Test_Passing {
  Object object;
  HandlingEvent handlingEvent;
  HandlingEvent anotherHandlingEvent;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_HashCodeBuilder_RHtG0() {
    HandlingEvent handlingEvent = new HandlingEvent();
    int hashCode = handlingEvent.hashCode();
    assertNotEquals(0, hashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_appendCargo_LpOk1() {
    Cargo cargo = new Cargo();
    HandlingEvent handlingEvent1 = new HandlingEvent(cargo, null, null, null, null, null);
    HandlingEvent handlingEvent2 = new HandlingEvent(new Cargo(), null, null, null, null, null);
    assertNotEquals(handlingEvent1.hashCode(), handlingEvent2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_appendVoyage_srkV2() {
    Voyage voyage = new Voyage();
    HandlingEvent handlingEvent1 = new HandlingEvent(null, null, null, null, null, voyage);
    HandlingEvent handlingEvent2 = new HandlingEvent(null, null, null, null, null, new Voyage());
    assertNotEquals(handlingEvent1.hashCode(), handlingEvent2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_appendCompletionTime_Cqjc3() {
    LocalDateTime completionTime = LocalDateTime.now();
    HandlingEvent handlingEvent1 = new HandlingEvent(null, completionTime, null, null, null, null);
    HandlingEvent handlingEvent2 = new HandlingEvent(null, completionTime.plusDays(1), null, null, null, null);
    assertNotEquals(handlingEvent1.hashCode(), handlingEvent2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_toHashCode_VAPE6() {
    HandlingEvent handlingEvent = new HandlingEvent();
    int hashCode = handlingEvent.hashCode();
    assertEquals(hashCode, handlingEvent.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_StringBuilder_JXLw0() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n--- Handling event ---\n", result.substring(0, 20));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine1_Eidg8() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(19, 20));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine2_Poxy9() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(33, 34));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine3_Hsen10() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(42, 43));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine4_iowE11() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(56, 57));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine5_SvPa12() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(69, 70));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NewLine6_FjTs13() {
    HandlingEvent handlingEvent = new HandlingEvent();
    String result = handlingEvent.toString();
    assertEquals("\n", result.substring(82, 83));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnFalse_BjFG2() throws Exception {
    assertFalse(handlingEvent.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnFalse_FomO3() throws Exception {
    assertFalse(handlingEvent.equals(object));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameProperties_ReturnTrue_rBnI4() throws Exception {
    assertTrue(handlingEvent.equals(anotherHandlingEvent));
  }
}