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

public class Aster_OwnerController_Coverage_Test_Passing {

	private OwnerController ownerController;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_withValidOwner_Ntgo0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String response = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", response);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_xUmz0() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String response = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", response);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_drcx0_AEqf0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String actual = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", actual);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
	}

	@Test
	public void testProcessUpdateOwnerForm_noErrors_dvjp3_pevB0() {
		int ownerId = 1;
		Owner owner = new Owner();
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		when(ownerRepository.findById(ownerId)).thenReturn(owner);
		String actual = ownerController.processUpdateOwnerForm(owner, result, ownerId, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", actual);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_GfLR0() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String response = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", response);
		verify(ownerRepository).save(owner);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_NoErrors_RedirectToUpdateOwner_HoJi0() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String returnValue = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/{ownerId}", returnValue);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
		verify(ownerRepository).save(owner);
	}

	@Test
	public void testProcessUpdateOwnerForm_SZKu0() {
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_ownerUpdated_redirectedToOwnerPage_ymCg0() {
		Owner owner = mock(Owner.class);
		BindingResult bindingResult = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(bindingResult.hasErrors()).thenReturn(false);
		String result = ownerController.processUpdateOwnerForm(owner, bindingResult, 1, redirectAttributes);
		verify(ownerRepository).save(owner);
		assertEquals("redirect:/owners/{ownerId}", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_NoErrors_RedirectToUpdateOwner_HoJi0_fid2() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String returnValue = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", returnValue);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
		verify(ownerRepository).save(owner);
	}

}