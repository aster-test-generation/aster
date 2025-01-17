/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Passing {

	private PetController petController;

	private ModelMap modelMap;

	private OwnerRepository owners;

	private RedirectAttributes redirectAttributes;

	private WebDataBinder webDataBinder;

	@Test
	public void testInitOwnerBinder_ppHm1() {
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPet_OwnerIdFound_ReturnsPet_tIlU3_LgNd0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(ownerRepository.findById(anyInt())).thenReturn(owner);
		PetController petController = new PetController(ownerRepository);
		Pet pet = petController.findPet(1, 1);
		assertNotNull(pet);
	}

	@org.junit.Test
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void initOwnerBinder(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}

}