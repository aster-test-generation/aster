/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_withoutErrors_FXDZ1_oDxu0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		owner.setId(1); // Set the owner ID
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(false);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		assertEquals("redirect:/owners/" + owner.getId(),
				ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_withoutErrors_dCjO1_PnEo0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(false);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		assertEquals("redirect:/owners/1",
				ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
	}

}