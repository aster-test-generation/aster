/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.CargoRepository;
import org.eclipse.cargotracker.domain.model.location.LocationRepository;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_EventLogger_Coverage_Test_Failing {
  private LocationRepository locationRepository;
  private VoyageRepository voyageRepository;
  private EventLogger eventLogger;
  private CargoRepository cargoRepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithEmptyCargoRepository_pBKP2() {
    List<Cargo> cargos = new ArrayList<>();
    when(cargoRepository.findAll()).thenReturn(cargos);
    eventLogger.init();
    verify(cargoRepository).findAll();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNonEmptyCargoRepository_kigM3() {
    Cargo cargo = mock(Cargo.class);
    List<Cargo> cargos = new ArrayList<>();
    cargos.add(cargo);
    when(cargoRepository.findAll()).thenReturn(cargos);
    eventLogger.init();
    verify(cargoRepository).findAll();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitWithTrackingIdAndCompletionTime_YVhq8_hGnL0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("12345");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void teardown_qSOn1() {
    verifyNoMoreInteractions(cargoRepository, locationRepository, voyageRepository);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithEmptyVoyageRepository_KCxz6() {
    List<Voyage> voyages = new ArrayList<>();
    when(voyageRepository.findAll()).thenReturn(voyages);
    eventLogger.init();
    verify(voyageRepository).findAll();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNonEmptyVoyageRepository_MxjR7() {
    Voyage voyage = mock(Voyage.class);
    List<Voyage> voyages = new ArrayList<>();
    voyages.add(voyage);
    when(voyageRepository.findAll()).thenReturn(voyages);
    eventLogger.init();
    verify(voyageRepository).findAll();
  }
}