/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Passing {

	private PetController petController;

	private OwnerRepository ownerRepository;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationForm_AddPetToOwner_NDqN1_nFCz0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(ownerRepository);
		Owner owner = new Owner();
		ModelMap model = new ModelMap();
		petController.initCreationForm(owner, model);
		assertEquals(1, owner.getPets().size(), "Expected owner to have exactly one pet");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitUpdateForm_PetDoesNotExist_Xqdf1_fZsK0_2() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(ownerRepository);
		Owner owner = mock(Owner.class);
		int petId = 1;
		ModelMap model = new ModelMap();
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(owner.getPet(petId)).thenReturn(null);
		String viewName = petController.initUpdateForm(owner, petId, model, redirectAttributes);
		assertEquals(null, model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitUpdateForm_PetExists_tUEh0_JmsU0_2() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(ownerRepository);
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		int petId = 1;
		ModelMap model = new ModelMap();
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(owner.getPet(petId)).thenReturn(pet);
		String viewName = petController.initUpdateForm(owner, petId, model, redirectAttributes);
		assertEquals(pet, model.get("pet"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitUpdateForm_PetExists_tUEh0_JmsU0_1_fid1() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(ownerRepository);
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		int petId = 1;
		ModelMap model = new ModelMap();
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(owner.getPet(petId)).thenReturn(pet);
		String viewName = petController.initUpdateForm(owner, petId, model, redirectAttributes);
		assertEquals("pets/createOrUpdatePetForm", viewName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void setUp_LFTf0() {
		ownerRepository = mock(OwnerRepository.class);
		petController = new PetController(ownerRepository);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwner_ValidOwner_CallsFindById_qAea3() {
		int ownerId = 1;
		Owner mockOwner = mock(Owner.class);
		when(ownerRepository.findById(ownerId)).thenReturn(mockOwner);
		Owner result = petController.findOwner(ownerId);
		verify(ownerRepository).findById(ownerId);
	}

}