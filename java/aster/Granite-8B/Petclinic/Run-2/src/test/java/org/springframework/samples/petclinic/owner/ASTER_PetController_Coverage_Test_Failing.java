/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithInvalidId_QXZj2_rUcV0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(owners.findById(1)).thenReturn(owner);
		PetController petController = new PetController(owners);
		Owner result = petController.findOwner(1);
		Assertions.assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateForm_PetNameHasText_gtHk0_FnMs0() {
		Pet pet = new Pet();
		BindingResult result = mock(BindingResult.class);
		Owner owner = new Owner();
		ModelMap model = new ModelMap();
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository owners = mock(OwnerRepository.class);
		PetController petController = new PetController(owners);
		String petName = "petName";
		pet.setName(petName);
		petController.processUpdateForm(pet, result, owner, model, redirectAttributes);
		verify(result, times(1)).rejectValue("name", "duplicate", "already exists");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateForm_HasErrors_fCik3_KDEJ0() {
		Pet pet = new Pet();
		BindingResult result = mock(BindingResult.class);
		Owner owner = new Owner();
		ModelMap model = new ModelMap();
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository owners = mock(OwnerRepository.class);
		PetController petController = new PetController(owners);
		petController.processUpdateForm(pet, result, owner, model, redirectAttributes);
		verify(result, times(1)).rejectValue("name", "duplicate", "already exists");
		verify(result, times(1)).rejectValue("birthDate", "typeMismatch.birthDate");
	}

}