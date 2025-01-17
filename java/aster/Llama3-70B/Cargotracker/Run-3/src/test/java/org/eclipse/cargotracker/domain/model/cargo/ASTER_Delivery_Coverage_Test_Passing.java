/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Coverage_Test_Passing {
  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_HashCodeBuilder_tWLR0() {
    Delivery delivery = new Delivery();
    int hashCode = delivery.hashCode();
    assertEquals(hashCode, delivery.hashCode());
  }

  @Test
  public void testUpdateOnRouting_WithNullRouteSpecification_ThrowsNullPointerException_Zoex0_qARJ0() {
    Delivery delivery = new Delivery();
    NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
      delivery.updateOnRouting(null, new Itinerary());
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameClassSameObject_ReturnTrue_aFaU5_poLc0() throws Exception {
    Delivery delivery = new Delivery();
    Delivery otherDelivery = delivery;
    assertSame(delivery, otherDelivery);
  }
}