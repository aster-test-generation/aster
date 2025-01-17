/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWhenOwnerExists_eurA0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(ownerRepository.findById(1)).thenReturn(owner);
		PetController petController = new PetController(ownerRepository);
		Owner actualOwner = petController.findOwner(1);
		assertEquals(owner, actualOwner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateForm_PetNameHasText_Gpmi0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		BindingResult result = mock(BindingResult.class);
		ModelMap model = mock(ModelMap.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		PetController petController = new PetController(owners);
		when(pet.getName()).thenReturn("petName");
		petController.processUpdateForm(pet, result, owner, model, redirectAttributes);
		verify(pet).getName();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateForm_PetNameNull_OYKB2() {
		OwnerRepository owners = mock(OwnerRepository.class);
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		BindingResult result = mock(BindingResult.class);
		ModelMap model = mock(ModelMap.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		PetController petController = new PetController(owners);
		when(pet.getName()).thenReturn(null);
		petController.processUpdateForm(pet, result, owner, model, redirectAttributes);
		verify(pet).getName();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateForm_PetNameExists_ODAQ4() {
		OwnerRepository owners = mock(OwnerRepository.class);
		Owner owner = mock(Owner.class);
		Pet pet = mock(Pet.class);
		BindingResult result = mock(BindingResult.class);
		ModelMap model = mock(ModelMap.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		PetController petController = new PetController(owners);
		when(owner.getPet("petName", false)).thenReturn(pet);
		petController.processUpdateForm(pet, result, owner, model, redirectAttributes);
		verify(owner).getPet("petName", false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPetWithPetNotFound_FxTl3_sCdZ0() {
		Owner owner = new Owner();
		owner.setId(1);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		when(ownerRepository.findById(1)).thenReturn(owner);
		PetController petController = new PetController(ownerRepository);
		Pet pet = petController.findPet(1, 1);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPetWithPetFound_qqnG4_BLhI0_1() {
		Owner owner = new Owner();
		owner.setId(1);
		Pet pet = new Pet();
		pet.setId(1);
		owner.addPet(pet);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		when(ownerRepository.findById(1)).thenReturn(owner);
		PetController petController = new PetController(ownerRepository);
		Pet foundPet = petController.findPet(1, 1);
		assertNotNull(foundPet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPetWithPetIdNull_LjWi0_QLHX1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(mockOwnerRepository);
		Pet pet = petController.findPet(1, null);
		assertNotNull(pet);
	}

}