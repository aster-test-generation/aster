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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransitEdge_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_oRCT0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + LocalDateTime.now() + ", toDate=" + LocalDateTime.now() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullVoyageNumber_WaWe1() {
    TransitEdge transitEdge = new TransitEdge(null, "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + null + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + LocalDateTime.now() + ", toDate=" + LocalDateTime.now() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullFromUnLocode_cPLh2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", null, "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + null + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + LocalDateTime.now() + ", toDate=" + LocalDateTime.now() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullToUnLocode_DAmj3() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", null, LocalDateTime.now(), LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + null + ", fromDate=" + LocalDateTime.now() + ", toDate=" + LocalDateTime.now() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullFromDate_KWqH4() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + null + ", toDate=" + LocalDateTime.now() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullToDate_KIfA5() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), null);
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + LocalDateTime.now() + ", toDate=" + null + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDateWithInvalidFromDate_qGhE4() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertEquals(LocalDateTime.now().plusDays(1), toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullFromDate_Gaze5() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "to1", null, LocalDateTime.now());
    assertEquals(null, edge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullVoyageNumber_MZFc5_fid1() {
    TransitEdge edge = new TransitEdge(null, "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertNull(edge.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithEmptyVoyageNumber_puEj6() {
    TransitEdge edge = new TransitEdge("", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertEquals("", edge.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithInvalidVoyageNumber_bAwc7_fid1() {
    TransitEdge edge = new TransitEdge("invalid", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertEquals("invalid", edge.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDateWithInvalidDate_iJAm2_fid1() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime invalidDate = LocalDateTime.of(2023, 2, 29, 0, 0, 0);
    edge.setToDate(invalidDate);
    assertNull(edge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDate_YonF0() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertEquals(LocalDateTime.now().plusDays(1), toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDateWithNullFromDate_JRPi1_fid1() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, LocalDateTime.now().plusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertNull(toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDateWithInvalidFromDate_qGhE4_fid1() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertNull(toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDateWithInvalidToDate_dgAa5_fid1() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now().minusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertNull(toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDateWithInvalidFromAndToDate_fbKd6_fid1() {
    TransitEdge edge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now().minusDays(1), LocalDateTime.now().minusDays(1));
    LocalDateTime toDate = edge.getToDate();
    assertNull(toDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromDate_Valid_pWIH0_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    LocalDateTime fromDate = edge.getFromDate();
    assertEquals(LocalDateTime.now(), fromDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithInvalidUnLocode_kiTn3_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "invalid", LocalDateTime.now(), LocalDateTime.now());
    assertNull(edge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullFromDate_Gaze5_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "to1", null, LocalDateTime.now());
    assertNull(edge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullToDate_pspw6_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "to1", LocalDateTime.now(), null);
    assertNull(edge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithInvalidFromDate_xmWS7_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "to1", LocalDateTime.now().minusDays(1), LocalDateTime.now());
    assertNull(edge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithInvalidToDate_GPgW8_fid1() {
    TransitEdge edge = new TransitEdge("voyage1", "from1", "to1", LocalDateTime.now(), LocalDateTime.now().minusDays(1));
    assertNull(edge.getToUnLocode());
  }
}