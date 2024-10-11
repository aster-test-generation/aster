/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Itinerary_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_ezFW0() {
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    boolean result = itinerary.equals(itinerary);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_yqcN1() {
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    boolean result = itinerary.equals(null);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentObject_AMCd2() {
    Itinerary itinerary1 = new Itinerary(new ArrayList<>());
    Itinerary itinerary2 = new Itinerary(new ArrayList<>());
    boolean result = itinerary1.equals(itinerary2);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_evHs0_OtRI0() {
    List<org.eclipse.cargotracker.domain.model.cargo.Leg> legs = new ArrayList<>();
    Itinerary itinerary = new Itinerary(legs);
    int result = itinerary.hashCode();
    assert true;
  }
}