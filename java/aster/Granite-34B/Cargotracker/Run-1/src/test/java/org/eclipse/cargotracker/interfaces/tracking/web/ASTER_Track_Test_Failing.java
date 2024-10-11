/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.Coordinates;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Track_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_DestinationCoordinates_XxrW3_lpKz0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    Coordinates destinationCoordinates = cargo.getDestinationCoordinates();
    assertNotNull(destinationCoordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_DestinationCode_GhLw4_xats0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String destinationCode = cargo.getDestinationCode();
    assertNotNull(destinationCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_TrackingId_uvVi5_nIdi0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String trackingId = cargo.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_OriginCode_ynVj6_OTpC0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String originCode = cargo.getOriginCode();
    assertNotNull(originCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_NextExpectedActivity_JPFH8_MLjc0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String nextExpectedActivity = cargo.getNextExpectedActivity();
    assertNotNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_LastKnownLocationCoordinates_Kqoe9_AZoS0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    Coordinates lastKnownLocationCoordinates = cargo.getLastKnownLocationCoordinates();
    assertNotNull(lastKnownLocationCoordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_LastKnownLocationName_UdUk10_wXeq0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String lastKnownLocationName = cargo.getLastKnownLocationName();
    assertNotNull(lastKnownLocationName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_DestinationName_WKVk11_jnUL0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String destinationName = cargo.getDestinationName();
    assertNotNull(destinationName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_OriginCoordinates_UbHh12_JuFV0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    Coordinates originCoordinates = cargo.getOriginCoordinates();
    assertNotNull(originCoordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_StatusCode_aBJN13_coho0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String statusCode = cargo.getStatusCode();
    assertNotNull(statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_StatusText_mDjW14_Lcuo0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String statusText = cargo.getStatusText();
    assertNotNull(statusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_Eta_KXcp15_CBGv0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String eta = cargo.getEta();
    assertNotNull(eta);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_NotNull_LastKnownLocationCode_RApN17_XufP0() {
    Track track = new Track();
    CargoTrackingViewAdapter cargo = track.getCargo();
    String lastKnownLocationCode = cargo.getLastKnownLocationCode();
    assertNotNull(lastKnownLocationCode);
  }
}