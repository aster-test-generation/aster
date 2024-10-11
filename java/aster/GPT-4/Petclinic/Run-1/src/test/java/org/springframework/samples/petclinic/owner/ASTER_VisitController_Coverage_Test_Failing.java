/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Map;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VisitController_Coverage_Test_Failing {

	private VisitController visitController;

	private OwnerRepository ownerRepository;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessNewVisitForm_NoErrors_xnBt1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		VisitController controller = new VisitController(mockOwnerRepository);
		Owner owner = new Owner();
		Visit visit = new Visit();
		BindingResult mockBindingResult = mock(BindingResult.class);
		RedirectAttributes mockRedirectAttributes = mock(RedirectAttributes.class);
		when(mockBindingResult.hasErrors()).thenReturn(false);
		controller.processNewVisitForm(owner, 1, visit, mockBindingResult, mockRedirectAttributes);
		verify(owner).addVisit(1, visit);
		verify(mockOwnerRepository).save(owner);
		verify(mockRedirectAttributes).addFlashAttribute("message", "Your visit has been booked");
		verifyNoMoreInteractions(mockRedirectAttributes);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessNewVisitForm_RedirectAfterBooking_tXCd2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		VisitController controller = new VisitController(mockOwnerRepository);
		Owner owner = new Owner();
		Visit visit = new Visit();
		BindingResult mockBindingResult = mock(BindingResult.class);
		RedirectAttributes mockRedirectAttributes = mock(RedirectAttributes.class);
		when(mockBindingResult.hasErrors()).thenReturn(false);
		String view = controller.processNewVisitForm(owner, 1, visit, mockBindingResult, mockRedirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", view);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessNewVisitForm_VerifyAddVisitCalled_KInr3() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		VisitController controller = new VisitController(mockOwnerRepository);
		Owner owner = new Owner();
		Visit visit = new Visit();
		BindingResult mockBindingResult = mock(BindingResult.class);
		RedirectAttributes mockRedirectAttributes = mock(RedirectAttributes.class);
		when(mockBindingResult.hasErrors()).thenReturn(false);
		controller.processNewVisitForm(owner, 1, visit, mockBindingResult, mockRedirectAttributes);
		verify(owner).addVisit(1, visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessNewVisitForm_VerifySaveOwnerCalled_gRVb4() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		VisitController controller = new VisitController(mockOwnerRepository);
		Owner owner = new Owner();
		Visit visit = new Visit();
		BindingResult mockBindingResult = mock(BindingResult.class);
		RedirectAttributes mockRedirectAttributes = mock(RedirectAttributes.class);
		when(mockBindingResult.hasErrors()).thenReturn(false);
		controller.processNewVisitForm(owner, 1, visit, mockBindingResult, mockRedirectAttributes);
		verify(mockOwnerRepository).save(owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_FindOwnerById_YJWf1() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		Map<String, Object> model = new HashMap<>();
		visitController.loadPetWithVisit(ownerId, petId, model);
		verify(ownerRepository).findById(ownerId);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_GetPetFromOwner_asuK2() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		when(owner.getPet(petId)).thenReturn(pet);
		Map<String, Object> model = new HashMap<>();
		visitController.loadPetWithVisit(ownerId, petId, model);
		verify(owner).getPet(petId);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_PutPetInModel_roxN3() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		when(owner.getPet(petId)).thenReturn(pet);
		Map<String, Object> model = new HashMap<>();
		visitController.loadPetWithVisit(ownerId, petId, model);
		assertEquals(pet, model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_PutOwnerInModel_SuKA4() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		Map<String, Object> model = new HashMap<>();
		visitController.loadPetWithVisit(ownerId, petId, model);
		assertEquals(owner, model.get("owner"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_CreateVisit_WNxT5() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		when(owner.getPet(petId)).thenReturn(pet);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(ownerId, petId, model);
		assertNotNull(visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLoadPetWithVisit_AddVisitToPet_myyi6() {
		int ownerId = 1;
		int petId = 1;
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		when(owner.getPet(petId)).thenReturn(pet);
		Map<String, Object> model = new HashMap<>();
		Visit visit = visitController.loadPetWithVisit(ownerId, petId, model);
		verify(pet).addVisit(visit);
	}

}