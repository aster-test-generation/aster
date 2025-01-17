/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.location.LocationRepository;
import org.eclipse.cargotracker.domain.model.voyage.VoyageRepository;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ItineraryCandidateDtoAssembler_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_EmptyLegs_HvQT0_1() {
    RouteCandidate routeCandidateDTO = mock(RouteCandidate.class);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    when(routeCandidateDTO.getLegs()).thenReturn(new ArrayList<>());
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertNotNull(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_EmptyLegs_HvQT0_2() {
    RouteCandidate routeCandidateDTO = mock(RouteCandidate.class);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    when(routeCandidateDTO.getLegs()).thenReturn(new ArrayList<>());
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertTrue(itinerary.getLegs().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_SingleLeg_PjHL1_2() {
    RouteCandidate routeCandidateDTO = mock(RouteCandidate.class);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg> legDTOs = new ArrayList<>();
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    when(routeCandidateDTO.getLegs()).thenReturn(legDTOs);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertEquals(1, itinerary.getLegs().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_MultipleLegs_wBZK2_1() {
    RouteCandidate routeCandidateDTO = mock(RouteCandidate.class);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg> legDTOs = new ArrayList<>();
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    when(routeCandidateDTO.getLegs()).thenReturn(legDTOs);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertNotNull(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFromDTO_MultipleLegs_wBZK2_2() {
    RouteCandidate routeCandidateDTO = mock(RouteCandidate.class);
    VoyageRepository voyageRepository = mock(VoyageRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg> legDTOs = new ArrayList<>();
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    legDTOs.add(mock(org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg.class));
    when(routeCandidateDTO.getLegs()).thenReturn(legDTOs);
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertEquals(3, itinerary.getLegs().size());
  }
}