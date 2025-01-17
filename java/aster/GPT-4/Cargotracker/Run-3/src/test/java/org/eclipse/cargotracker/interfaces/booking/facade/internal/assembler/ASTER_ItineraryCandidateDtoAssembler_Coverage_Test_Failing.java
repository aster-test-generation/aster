/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.LocationRepository;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.eclipse.cargotracker.domain.model.voyage.VoyageRepository;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_ItineraryCandidateDtoAssembler_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_InitializeLegsList_EFfA0() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    when(routeCandidate.getLegs()).thenReturn(new ArrayList<>());
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(routeCandidate).getLegs();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_ReturnNewItinerary_GnvK9_1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    when(routeCandidate.getLegs()).thenReturn(new ArrayList<>());
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_ReturnNewItinerary_GnvK9_2() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    when(routeCandidate.getLegs()).thenReturn(new ArrayList<>());
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertTrue(result instanceof Itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_FindVoyageInRepository_gVPH3_kEIa0() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(legDTO.getVoyageNumber()).thenReturn("V100");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    Voyage mockVoyage = mock(Voyage.class);
    when(voyageRepository.find(any(VoyageNumber.class))).thenReturn(mockVoyage);
    LocationRepository locationRepository = mock(LocationRepository.class);
    Location mockLocation = mock(Location.class);
    when(locationRepository.find(any(UnLocode.class))).thenReturn(mockLocation);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(voyageRepository).find(any(VoyageNumber.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_FindToLocationInRepository_mvrl5_iTQi0() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg leg = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(leg.getToUnLocode()).thenReturn("UNLOC2");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(leg));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    org.eclipse.cargotracker.domain.model.location.Location location = mock(org.eclipse.cargotracker.domain.model.location.Location.class);
    when(locationRepository.find(any(UnLocode.class))).thenReturn(location);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(locationRepository).find(any(UnLocode.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_AddLegToList_BLol6_Dlvj0_1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertFalse(result.getLegs().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_AddLegToList_BLol6_Dlvj0_2() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertNotNull(result);
    assertEquals(1, result.getLegs().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_ConvertLoadTime_fTxG7_EWAL0() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(legDTO.getLoadTime()).thenReturn("2023-01-01T12:00:00");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertNotNull(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_CreateVoyageNumber_aBCE2_QWcy0_fid1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg> mockLegs = Arrays.asList(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    when(routeCandidate.getLegs()).thenReturn(mockLegs);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(mockLegs.get(0)).getVoyageNumber();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_FindVoyageInRepository_gVPH3_kEIa0_fid1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(legDTO.getVoyageNumber()).thenReturn("V100");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    when(voyageRepository.find(any(VoyageNumber.class))).thenReturn(mock(Voyage.class));
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(voyageRepository).find(any(VoyageNumber.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_FindToLocationInRepository_mvrl5_iTQi0_fid1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg leg = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(leg.getToUnLocode()).thenReturn("UNLOC2");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(leg));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    when(locationRepository.find(any(UnLocode.class))).thenReturn(mock(org.eclipse.cargotracker.domain.model.location.Location.class));
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(locationRepository).find(any(UnLocode.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_AddLegToList_BLol6_Dlvj0_2_fid1() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertEquals(1, result.getLegs().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_ConvertUnloadTime_jlqH8_wWeR0() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg legDTO = mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class);
    when(legDTO.getUnloadTime()).thenReturn("2023-01-02T12:00:00");
    when(routeCandidate.getLegs()).thenReturn(Arrays.asList(legDTO));
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    verify(legDTO).getUnloadTime();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_ReturnNewItinerary_GnvK9() {
    RouteCandidate routeCandidate = mock(RouteCandidate.class);
    when(routeCandidate.getLegs()).thenReturn(new ArrayList<>());
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary result = assembler.fromDTO(routeCandidate, voyageRepository, locationRepository);
    assertNotNull(result);
    assertTrue(result instanceof Itinerary);
  }
}