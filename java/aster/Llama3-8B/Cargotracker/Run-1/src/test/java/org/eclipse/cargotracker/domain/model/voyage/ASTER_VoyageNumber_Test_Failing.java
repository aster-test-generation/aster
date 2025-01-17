/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VoyageNumber_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdStringWithNoParameter_Nijp1() {
    VoyageNumber voyageNumber = new VoyageNumber();
    String result = voyageNumber.getIdString();
    assert result.equals("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeNull_EDtf2() {
    VoyageNumber voyageNumber = new VoyageNumber(null);
    int result = voyageNumber.hashCode();
    assert result == 0;
  }
}