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

public class Aster_VisitController_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_BsWg0_2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner.getPet(1), model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_BsWg0_3() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(visit, model.get("visit"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_UIpB1_1() {
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
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_UIpB1_2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner.getPet(1), model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_UIpB1_3() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(visit, model.get("visit"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test3_rEWx2_1() {
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
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test3_rEWx2_2() {
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
		assertEquals(owner.getPet(1), model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test3_rEWx2_3() {
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
		assertEquals(visit, model.get("visit"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_BsWg0_1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner, model.get("owner"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_BsWg0() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		VisitController visitController = new VisitController(mockOwnerRepository);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(1, 1, model);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner, model.get("owner"));
		assertEquals(owner.getPet(1), model.get("pet"));
		assertEquals(visit, model.get("visit"));
	}

}