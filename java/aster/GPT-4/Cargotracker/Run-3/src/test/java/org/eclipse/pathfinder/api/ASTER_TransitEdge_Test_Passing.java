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
  public void testGetFromUnLocode_hCHf0() throws Exception {
    TransitEdge transitEdge = new TransitEdge("V123", "USNYC", "GBLON", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    String expected = "USNYC";
    String actual = transitEdge.getFromUnLocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_zwco0() throws Exception {
    LocalDateTime fromDate = LocalDateTime.of(2023, 3, 15, 10, 0);
    LocalDateTime toDate = LocalDateTime.of(2023, 3, 16, 10, 0);
    TransitEdge transitEdge = new TransitEdge("V123", "UNLOCA", "UNLOCB", fromDate, toDate);
    String expected = "TransitEdge{voyageNumber=V123, fromUnLocode=UNLOCA, toUnLocode=UNLOCB, fromDate=2023-03-15T10:00, toDate=2023-03-16T10:00}";
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_FncC0() throws Exception {
    TransitEdge transitEdge = new TransitEdge("V123", "UNLOC1", "UNLOC2", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    assertEquals("V123", transitEdge.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDate_RmKv0() throws Exception {
    LocalDateTime expectedDate = LocalDateTime.of(2023, 10, 15, 12, 0);
    TransitEdge transitEdge = new TransitEdge("V123", "UNLOC1", "UNLOC2", LocalDateTime.of(2023, 10, 10, 12, 0), expectedDate);
    LocalDateTime actualDate = transitEdge.getToDate();
    assertEquals(expectedDate, actualDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromDate_QrdO0() throws Exception {
    LocalDateTime expectedDate = LocalDateTime.of(2023, 3, 15, 10, 0);
    TransitEdge transitEdge = new TransitEdge("V123", "USNYC", "GBLON", expectedDate, LocalDateTime.of(2023, 3, 20, 10, 0));
    LocalDateTime actualDate = transitEdge.getFromDate();
    assertEquals(expectedDate, actualDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocode_RUqM0() throws Exception {
    TransitEdge edge = new TransitEdge("V123", "UNLOC1", "UNLOC2", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    assertEquals("UNLOC2", edge.getToUnLocode());
  }
}