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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VisitController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_FPCm0() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		VisitController visitController = new VisitController(mockOwnerRepository);
		String result = visitController.initNewVisitForm();
		assertEquals("pets/createOrUpdateVisitForm", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test6_mGlS5() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		Visit visit = new Visit();
		pet.addVisit(visit);
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_UIpB1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner, model.get("owner"));
		assertEquals(owner.getPet(1), model.get("pet"));
		assertEquals(visit, model.get("visit"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test3_rEWx2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		Visit visit = new Visit();
		pet.addVisit(visit);
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit1 = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner, model.get("owner"));
		assertEquals(owner.getPet(1), model.get("pet"));
		assertEquals(visit, model.get("visit"));
	}

}