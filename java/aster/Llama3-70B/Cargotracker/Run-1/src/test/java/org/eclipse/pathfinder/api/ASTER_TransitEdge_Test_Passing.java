/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransitEdge_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocode_tIcY0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertEquals("fromUnLocode", transitEdge.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToUnLocode_peLc0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    transitEdge.setToUnLocode("newToUnLocode");
    assertEquals("newToUnLocode", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_bpEl0() {
    TransitEdge transitEdge = new TransitEdge("Voyage123", "FROM_LOC", "TO_LOC", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 2, 0, 0));
    assertEquals("TransitEdge{voyageNumber=Voyage123, fromUnLocode=FROM_LOC, toUnLocode=TO_LOC, fromDate=2022-01-01T00:00, toDate=2022-01-02T00:00}", transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_HyTp0() {
    TransitEdge transitEdge = new TransitEdge("V123", "F123", "T123", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 2, 0, 0));
    assertEquals("V123", transitEdge.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDate_tGTl0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime toDate = LocalDateTime.of(2022, 12, 31, 23, 59, 59);
    transitEdge.setToDate(toDate);
    assertEquals(toDate, transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDate_guVm0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 1, 0, 0));
    assertEquals(LocalDateTime.of(2022, 1, 1, 0, 0), transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromUnLocode_DDdQ0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    transitEdge.setFromUnLocode("newFromUnLocode");
    assertEquals("newFromUnLocode", transitEdge.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromDate_Fumf0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 1, 0, 0));
    assertEquals(LocalDateTime.of(2022, 1, 1, 0, 0), transitEdge.getFromDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocode_fpyM0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertEquals("toUnLocode", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_yhLT0() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setVoyageNumber("12345");
    assertEquals("12345", transitEdge.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDate_NOZO0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime fromDate = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
    transitEdge.setFromDate(fromDate);
    assertEquals(fromDate, transitEdge.getFromDate());
  }
}