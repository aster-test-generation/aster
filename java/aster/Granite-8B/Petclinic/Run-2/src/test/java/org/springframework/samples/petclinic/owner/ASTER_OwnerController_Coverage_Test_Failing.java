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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Coverage_Test_Failing {

	private OwnerController ownerController;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerFormWithRedirect_ObrW2_XNBc0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(owners);
		BindingResult result = mock(BindingResult.class);
		Owner owner = mock(Owner.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String view = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		verify(result, times(1)).hasErrors();
		verify(owner, times(1)).setId(1);
		verify(owners, times(1)).save(owner);
		verify(redirectAttributes, times(1)).addFlashAttribute("message", "Owner Values Updated");
		assertEquals("redirect:/owners/1", view);
	}

}