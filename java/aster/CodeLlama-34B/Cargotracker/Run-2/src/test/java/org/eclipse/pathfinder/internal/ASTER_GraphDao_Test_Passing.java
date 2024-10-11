/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_0100S_rNZX0() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("0100S", "0100S");
    assertEquals("0100S", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_Invalid_MmIB6() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("0100S", "0300A");
    assertEquals("0100S", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_1() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertEquals(13, locations.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_2() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("CNHKG"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_3() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("AUMEL"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_4() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("SESTO"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_5() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("FIHEL"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_6() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("USCHI"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_7() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("JNTKO"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_8() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("DEHAM"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_9() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("CNSHA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_10() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("NLRTM"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_11() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("SEGOT"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_12() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("CNHGH"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_13() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("USNYC"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_jDkl0_14() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.contains("USDAL"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocationsCoverage_Llsu1_15() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertFalse(locations.contains("XYZ"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_Null_SEQv7_fid1() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber(null, null);
  }
}