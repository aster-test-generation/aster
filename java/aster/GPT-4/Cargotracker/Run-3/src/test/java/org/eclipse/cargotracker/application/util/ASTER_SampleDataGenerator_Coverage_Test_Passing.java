/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.LockModeType;
import jakarta.persistence.NoResultException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_SampleDataGenerator_Coverage_Test_Passing {
  private SampleDataGenerator sampleDataGenerator;
  private EntityManager entityManager;
  private ApplicationSettings settings;
  private Logger logger;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_WhenSampleAlreadyLoaded_UjrL2() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    when(settings.isSampleLoaded()).thenReturn(true);
    sampleDataGenerator.loadSampleData();
    verify(logger).info("Sample data already loaded, skipping.");
    verify(settings, never()).setSampleLoaded(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_ThrowsNoResultException_ZUmx3() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenThrow(new NoResultException());
    try {
      sampleDataGenerator.loadSampleData();
    } catch (RuntimeException e) {
      assertEquals("Could not retrieve application settings.", e.getMessage());
    }
    verify(logger, never()).info(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_SampleLoadedFlagFalseInitially_pful4() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    when(settings.isSampleLoaded()).thenReturn(false);
    sampleDataGenerator.loadSampleData();
    verify(settings).setSampleLoaded(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_SampleLoadedFlagTrueInitially_ORzV5() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    when(settings.isSampleLoaded()).thenReturn(true);
    sampleDataGenerator.loadSampleData();
    verify(settings, never()).setSampleLoaded(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_EntityManagerFindCalled_zDij6() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    sampleDataGenerator.loadSampleData();
    verify(entityManager).find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_SettingsIsSampleLoadedCalled_gOah7() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    sampleDataGenerator.loadSampleData();
    verify(settings).isSampleLoaded();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_NoResultExceptionCaught_PMDO9() {
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenThrow(new NoResultException());
    try {
      sampleDataGenerator.loadSampleData();
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof NoResultException);
    }
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_swaP0() {
  }
}