/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.LockModeType;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_SampleDataGenerator_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleDataWhenAlreadyLoaded_zJWv1_iuzQ0() {
    SampleDataGenerator generator = new SampleDataGenerator();
    EntityManager entityManager = mock(EntityManager.class);
    ApplicationSettings settings = new ApplicationSettings();
    settings.setSampleLoaded(true);
    when(entityManager.find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE)).thenReturn(settings);
    generator.loadSampleData();
    assertTrue(settings.isSampleLoaded());
    verify(entityManager).find(ApplicationSettings.class, 1L, LockModeType.PESSIMISTIC_WRITE);
  }
}