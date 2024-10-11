/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Coverage_Test_Passing {

	private OwnerRepository clinicService;

	private OwnerRepository owners;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowOwner_ThrowsExceptionWhenOwnerIdIsZero_yKgO3() {
		OwnerController ownerController = new OwnerController(mock(OwnerRepository.class));
		assertThrows(IllegalArgumentException.class, () -> ownerController.showOwner(0));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WithErrors_jiCq0_EStZ0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(owners);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String actual = ownerController.processCreationForm(owner, result, redirectAttributes);
		verify(redirectAttributes, times(1)).addFlashAttribute("error", "There was an error in creating the owner.");
		verify(result, times(1)).hasErrors();
		assertEquals("owners/createOrUpdateOwnerForm", actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WithoutErrors_FiAz1_Ragc0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(owners);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(false);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String actual = ownerController.processCreationForm(owner, result, redirectAttributes);
		verify(owners, times(1)).save(owner);
		verify(redirectAttributes, times(1)).addFlashAttribute("message", "New Owner Created");
		verify(result, times(1)).hasErrors();
		assertEquals("redirect:/owners/" + owner.getId(), actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessCreationForm_WithException_TrnG2_lXqq0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(owners);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenThrow(new RuntimeException());
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String actual = ownerController.processCreationForm(owner, result, redirectAttributes);
		verify(owners, times(1)).save(owner);
		verify(redirectAttributes, times(1)).addFlashAttribute("message", "New Owner Created");
		verify(result, times(1)).hasErrors();
		assertEquals("redirect:/owners/" + owner.getId(), actual);
	}

}