/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Failing {

	private OwnerRepository ownerRepository;

	private PetController petController;

	private WebDataBinder dataBinder;

	private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WyOx0_NIsb0_1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Max");
		pet.setBirthDate(LocalDate.now());
		owner.addPet(pet);
		ModelMap model = new ModelMap();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String view = petController.processCreationForm(owner, pet, result, model, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", view);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WyOx0_NIsb0_2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Max");
		pet.setBirthDate(LocalDate.now());
		owner.addPet(pet);
		ModelMap model = new ModelMap();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String view = petController.processCreationForm(owner, pet, result, model, redirectAttributes);
		assertTrue(model.containsAttribute("message"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WyOx0_NIsb0_3() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Max");
		pet.setBirthDate(LocalDate.now());
		owner.addPet(pet);
		ModelMap model = new ModelMap();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String view = petController.processCreationForm(owner, pet, result, model, redirectAttributes);
		assertEquals("redirect:/owners/" + owner.getId(), view);
	}

}