/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;
import java.util.ArrayList;
import jakarta.inject.Inject;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.Leg;
import org.eclipse.cargotracker.domain.model.location.LocationRepository;
import org.eclipse.cargotracker.domain.model.voyage.VoyageRepository;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ItineraryCandidateDtoAssembler_Test_Failing {
@Inject private LocationDtoAssembler locationDtoAssembler;
ItineraryCandidateDtoAssembler itinerarycandidatedtoassembler;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToDto_DQom0() {
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    RouteCandidate result = assembler.toDto(itinerary);
    assertEquals(0, result.getLegs().size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromDTOEmptyInput_tomz1_wxhW0() {
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    VoyageRepository voyageRepository = Mockito.mock(VoyageRepository.class);
    LocationRepository locationRepository = Mockito.mock(LocationRepository.class);
    Itinerary result = assembler.fromDTO(routeCandidateDTO, voyageRepository, locationRepository);
    assertEquals(0, result.getLegs().size());
}
}