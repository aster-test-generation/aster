/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransitEdge_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode_Rtry0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getFromUnLocode();
    assertEquals("fromUnLocode", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyageNumber_sJLH1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getVoyageNumber();
    assertEquals("voyageNumber", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetToDate_DWYN2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime result = transitEdge.getToDate();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromDate_YLvc3() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime result = transitEdge.getFromDate();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetToUnLocode_qaSR4() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getToUnLocode();
    assertEquals("toUnLocode", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToUnLocode_qBJF0() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setToUnLocode("TO_UNLOCODE");
    assertEquals("TO_UNLOCODE", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToUnLocodeWithNull_lLAQ1() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setToUnLocode(null);
    assertNull(transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToUnLocodeWithEmpty_NYPA2() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setToUnLocode("");
    assertEquals("", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_BmdR0() {
    TransitEdge transitEdge = new TransitEdge("VOY123", "NLRTM", "USCHI", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    String expected = "TransitEdge{voyageNumber=VOY123, fromUnLocode=NLRTM, toUnLocode=USCHI, fromDate=2022-01-01T00:00, toDate=2022-01-01T12:00}";
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testgetToDate_qYUM0() {
    TransitEdge transitEdge = new TransitEdge("VOY123", "NLRTM", "USNYC", LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 2, 0, 0));
    LocalDateTime expectedDate = LocalDateTime.of(2022, 1, 2, 0, 0);
    LocalDateTime actualDate = transitEdge.getToDate();
    assertEquals(expectedDate, actualDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromDate_uooC0() {
    TransitEdge transitEdge = new TransitEdge("VOY123", "NLRTM", "USCHI", LocalDateTime.of(2021, 10, 1, 10, 0), LocalDateTime.of(2021, 10, 1, 12, 0));
    LocalDateTime expectedFromDate = LocalDateTime.of(2021, 10, 1, 10, 0);
    LocalDateTime actualFromDate = transitEdge.getFromDate();
    assertEquals(expectedFromDate, actualFromDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testgetToUnLocode_qNHE0() {
    TransitEdge transitEdge = new TransitEdge("VOY123", "NLRTM", "NLRTM", LocalDateTime.now(), LocalDateTime.now());
    assertEquals("NLRTM", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_RzEw0() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setVoyageNumber("VOYAGE_NUMBER");
    assertEquals("VOYAGE_NUMBER", transitEdge.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDate_NOOf0() {
    TransitEdge transitEdge = new TransitEdge();
    LocalDateTime fromDate = LocalDateTime.now();
    transitEdge.setFromDate(fromDate);
    assertEquals(fromDate, transitEdge.getFromDate());
  }
}