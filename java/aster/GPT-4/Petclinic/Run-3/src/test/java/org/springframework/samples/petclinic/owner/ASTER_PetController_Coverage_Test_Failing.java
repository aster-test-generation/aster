/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Failing {

	private RedirectAttributes redirectAttributes;

	@BeforeEach
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateFormWithValidPet_ywGv1_rRpS0_fid2() {
		Owner owner = mock(Owner.class); // Mock the Owner class
		Pet pet = new Pet();
		pet.setName("Buddy");
		pet.setId(1);
		BindingResult bindingResult = mock(BindingResult.class); // Mock the BindingResult
		ModelMap modelMap = mock(ModelMap.class); // Mock the ModelMap
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class); // Mock
																				// the
																				// RedirectAttributes
		OwnerRepository ownerRepository = mock(OwnerRepository.class); // Mock the
																		// OwnerRepository
		PetController petController = new PetController(ownerRepository); // Initialize
																			// PetController
																			// with mocked
																			// OwnerRepository
		when(owner.getPet("Buddy", false)).thenReturn(pet); // Corrected the name to match
															// the pet's name
		when(bindingResult.hasErrors()).thenReturn(false);
		String result = petController.processUpdateForm(pet, bindingResult, owner, modelMap, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", result);
		verify(owner).addPet(pet);
		verify(ownerRepository).save(owner);
		verify(redirectAttributes).addFlashAttribute(eq("message"), eq("Pet details have been edited"));
	}

}