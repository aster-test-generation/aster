/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoStatus_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithNullCargoStatus_Cjzy1() {
    CargoStatus cargoStatus = null;
    assertEquals(null, cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getNextExpectedActivity_msAy0() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", null);
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    System.out.println(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getNextExpectedActivity_nullNextExpectedActivity_KSSu1() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", null, null);
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    System.out.println(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getNextExpectedActivity_emptyNextExpectedActivity_tcvL2() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "", null);
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    System.out.println(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getNextExpectedActivity_nonEmptyNextExpectedActivity_GuQQ4() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nonEmptyNextExpectedActivity", null);
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    System.out.println(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithNullStatusText_KjbN1_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", null, true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("", cargoStatus.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithEmptyCargoStatus_Pyum2() {
    CargoStatus cargoStatus = new CargoStatus(null, null, null, false, null, null, null);
    assertEquals(null, cargoStatus.getEta());
  }
}