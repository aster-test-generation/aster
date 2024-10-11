/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VisitController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit1_RCea0_iCaK0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		VisitController visitController = new VisitController(owners);
		int ownerId = 1;
		int petId = 1;
		Map<String, Object> model = new HashMap<>();
		Visit actual = visitController.loadPetWithVisit(ownerId, petId, model);
		Owner expectedOwner = owners.findById(ownerId);
		Pet expectedPet = expectedOwner.getPet(petId);
		Visit expectedVisit = new Visit();
		expectedPet.addVisit(expectedVisit);
		assertEquals(expectedVisit, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit6_mzaL5_SApM0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		VisitController visitController = new VisitController(owners);
		int ownerId = 6;
		int petId = 6;
		Map<String, Object> model = new HashMap<>();
		Visit actual = visitController.loadPetWithVisit(ownerId, petId, model);
		Owner expectedOwner = new Owner();
		when(owners.findById(ownerId)).thenReturn(expectedOwner);
		Pet expectedPet = new Pet();
		expectedOwner.addPet(expectedPet);
		Visit expectedVisit = new Visit();
		expectedPet.addVisit(expectedVisit);
		assertEquals(expectedVisit, actual);
	}

}