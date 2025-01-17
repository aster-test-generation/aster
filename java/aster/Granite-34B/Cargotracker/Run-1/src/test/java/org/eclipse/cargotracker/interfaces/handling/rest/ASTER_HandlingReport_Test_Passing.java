/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest_dSGZ0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("ABC");
    assertEquals("ABC", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest2_oiIc1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("XYZ");
    assertEquals("XYZ", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest3_dQzj2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("PQR");
    assertEquals("PQR", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest4_OKPI3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("LMN");
    assertEquals("LMN", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest5_IRih4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("GHI");
    assertEquals("GHI", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest6_Cevu5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("JKL");
    assertEquals("JKL", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest7_BHcx6() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("OPQ");
    assertEquals("OPQ", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest8_fdzN7() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("VWX");
    assertEquals("VWX", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest9_duXk8() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("YZA");
    assertEquals("YZA", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnLocodeTest10_cRLW9() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("BCE");
    assertEquals("BCE", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setEventTypeTest_boZL0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setEventTypeTest1_CVia1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("value1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setEventTypeTest2_bcoP2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("value2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setEventTypeTest3_ZvnG3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("value3");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_BcYe0() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Null_unMf1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId(null);
    String trackingId = handlingReport.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Empty_ilIB2_1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("");
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Empty_ilIB2_2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("");
    String trackingId = handlingReport.getTrackingId();
    assertTrue(trackingId.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Length_GOmT3_1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("12345678901234567890123456789012345678901234567890");
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Length_GOmT3_2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("12345678901234567890123456789012345678901234567890");
    String trackingId = handlingReport.getTrackingId();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_Empty_ilIB2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("");
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
    assertTrue(trackingId.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberTest_ktyK0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("ABC123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberNullTest_kgog1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberEmptyTest_ogpb2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberMaxTest_faPH4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberMinTest_scNh5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("A");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberInvalidTest_rSMN6() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("!@#$%^&*()_+");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberInvalidLengthTest_UmbJ7() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberInvalidCharactersTest_ffiV9() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("ABC!@#");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setVoyageNumberInvalidNumericTest_yyVd11() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionTime_with_valid_data_hraS0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01");
    String actualCompletionTime = handlingReport.getCompletionTime();
    assertEquals("2022-01-01", actualCompletionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_tGCU0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithNull_QhUx1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithEmptyValue_vReX2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithInvalidFormat_IXKH3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("invalid format");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithFutureDate_kdEO4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2023-01-01");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithPastDate_kXDP5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2021-01-01");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEventType_Gnss0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("test");
    assertEquals("test", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEventTypeCoverage_JUtR1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("test");
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
    handlingReport.getEventType();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTrackingId_shouldSetTrackingId_ufWE0() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = "ABC123";
    handlingReport.setTrackingId(trackingId);
    assert handlingReport.getTrackingId().equals(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTrackingId_shouldNotSetTrackingId_whenTrackingIdIsNullOrEmpty_eMMG2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId(null);
    assert handlingReport.getTrackingId() == null;
    handlingReport.setTrackingId("");
    assert handlingReport.getTrackingId().isEmpty();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_InvalidFormat_ufkd4_1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("123456789012345678901234567890123456789012345678901");
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocode_ALal0_nLeK0() {
    HandlingReport handlingReport = new HandlingReport();
    String value = "ABC";
    handlingReport.setUnLocode(value);
    assertEquals(value, handlingReport.getUnLocode());
  }
}