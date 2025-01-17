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
  public void getFromUnLocodeTest_lqZH0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getFromUnLocode();
    assertEquals("fromUnLocode", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromUnLocodeTest_NullFromUnLocode_ApcO1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", null, "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getFromUnLocode();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromUnLocodeTest_EmptyFromUnLocode_sIot2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "", "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
    String result = transitEdge.getFromUnLocode();
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setToUnLocode_PKtS0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
    transitEdge.setToUnLocode("newToUnLocode");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setToUnLocode_nullParameter_throwsNullPointerException_XefT1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_pllu0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String expected = "TransitEdge{" + "voyageNumber=" + "voyageNumber" + ", fromUnLocode=" + "fromUnLocode" + ", toUnLocode=" + "toUnLocode" + ", fromDate=" + transitEdge.getFromDate() + ", toDate=" + transitEdge.getToDate() + '}';
    assertEquals(expected, transitEdge.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_IzsH0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    String voyageNumber = transitEdge.getVoyageNumber();
    assertEquals("voyageNumber", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest2_wVnZ1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber2", "fromUnLocode2", "toUnLocode2", LocalDateTime.now(), LocalDateTime.now());
    String voyageNumber = transitEdge.getVoyageNumber();
    assertEquals("voyageNumber2", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest3_tReO2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber3", "fromUnLocode3", "toUnLocode3", LocalDateTime.now(), LocalDateTime.now());
    String voyageNumber = transitEdge.getVoyageNumber();
    assertEquals("voyageNumber3", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDate_NwOX0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime toDate = LocalDateTime.now();
    transitEdge.setToDate(toDate);
    assertEquals(toDate, transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDateWithMaxValues_mYNu1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.MAX, LocalDateTime.MAX);
    LocalDateTime toDate = LocalDateTime.MAX;
    transitEdge.setToDate(toDate);
    assertEquals(toDate, transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDateWithMinValues_HFOq2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.MIN, LocalDateTime.MIN);
    LocalDateTime toDate = LocalDateTime.MIN;
    transitEdge.setToDate(toDate);
    assertEquals(toDate, transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetToDateWithNullParameter_FcUi3() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime toDate = null;
    transitEdge.setToDate(toDate);
    assertEquals(toDate, transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToDate_NWZI0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", LocalDateTime.now(), LocalDateTime.now());
    assertEquals(transitEdge.getToDate(), transitEdge.getToDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocode_Rzlt0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode",
            LocalDateTime.now(), LocalDateTime.now());
    assertEquals("toUnLocode", transitEdge.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumber_withValidVoyageNumber_setsVoyageNumber_kkZf0() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setVoyageNumber("voyageNumber");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumber_withInvalidVoyageNumber_doesNotSetVoyageNumber_aSmH1() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setVoyageNumber(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumber_withEmptyVoyageNumber_doesNotSetVoyageNumber_yVDR2() {
    TransitEdge transitEdge = new TransitEdge();
    transitEdge.setVoyageNumber("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDate_PhNU0() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, null);
    transitEdge.setFromDate(LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDateWithNullParameter_ktYZ1() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, null);
    transitEdge.setFromDate(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDateWithRandomParameter_YYuU2() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, null);
    transitEdge.setFromDate(LocalDateTime.of(2022, 1, 1, 0, 0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDateWithMaximumParameter_XXrm3() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, null);
    transitEdge.setFromDate(LocalDateTime.MAX);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFromDateWithMinimumParameter_XVZz4() {
    TransitEdge transitEdge = new TransitEdge("voyageNumber", "fromUnLocode", "toUnLocode", null, null);
    transitEdge.setFromDate(LocalDateTime.MIN);
  }
}