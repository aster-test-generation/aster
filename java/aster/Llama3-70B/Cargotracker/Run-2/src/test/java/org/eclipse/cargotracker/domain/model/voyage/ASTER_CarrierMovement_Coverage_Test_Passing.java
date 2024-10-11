/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Coverage_Test_Passing {
  CarrierMovement carrierMovement;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_AQHE0() throws Exception {
    carrierMovement = new CarrierMovement();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNullObject_zhpY1() throws Exception {
    assertFalse(carrierMovement.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentClassObject_oMEZ2() throws Exception {
    Object obj = new Object();
    assertFalse(carrierMovement.equals(obj));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_HashCodeBuilder_lKem0() {
    CarrierMovement carrierMovement = new CarrierMovement();
    int hashCode = carrierMovement.hashCode();
    assertNotEquals(0, hashCode);
  }
}