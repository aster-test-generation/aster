/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
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
	public void testSetAllowedFields_withNullDataBinder_yduo1() {
		ownerController.setAllowedFields(null);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowOwner_ModelAndView_iyhz1() {
		ModelAndView modelAndView = ownerController.showOwner(1);
		assertEquals("owners/ownerDetails", modelAndView.getViewName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_SaveOwnerFails_mznD6_OJtm0() {
		Owner owner = mock(Owner.class);
		BindingResult bindingResult = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(bindingResult.hasErrors()).thenReturn(false);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		doThrow(new RuntimeException("Error saving owner")).when(ownerRepository).save(owner);
		try {
			ownerController.processUpdateOwnerForm(owner, bindingResult, 1, redirectAttributes);
			fail("Expected RuntimeException to be thrown");
		}
		catch (RuntimeException e) {
			assertEquals("Error saving owner", e.getMessage());
		}
		verify(redirectAttributes).addFlashAttribute("error", "There was an error in updating the owner.");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_ownerId_dZCZ1_jLlK0() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String resultString = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", resultString);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_ReturnView_RfZT7_OXDm0_fid3() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String view = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", view);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_ReturnsRedirect_jKgJ6_sGOB0_fid3() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String resultString = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", resultString);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_noErrors_LDUI2_cAhj0_fid3() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(result.hasErrors()).thenReturn(false);
		String response = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", response);
		verify(ownerRepository).save(owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_OsRb0_fid3() {
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		when(result.hasErrors()).thenReturn(false);
		String actual = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", actual);
		verify(redirectAttributes).addFlashAttribute("message", "Owner Values Updated");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_SaveOwnerFails_mznD6_OJtm0_fid3() {
		Owner owner = mock(Owner.class);
		BindingResult bindingResult = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		when(bindingResult.hasErrors()).thenReturn(false);
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		doThrow(new RuntimeException("Error saving owner")).when(ownerRepository).save(owner);
		String result = ownerController.processUpdateOwnerForm(owner, bindingResult, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", result);
		verify(redirectAttributes).addFlashAttribute("error", "There was an error in updating the owner.");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testProcessUpdateOwnerForm_NoErrors_zhQt2_npgw0_fid3() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(false);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String view = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		assertEquals("redirect:/owners/1", view);
		verify(redirectAttributes, times(1)).addFlashAttribute("message", "Owner Values Updated");
	}

}