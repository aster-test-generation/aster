/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class Aster_OwnerController_Coverage_Test_Failing {

	private OwnerRepository ownerRepository;

	private OwnerController ownerController;

	private Model model;

	private RedirectAttributes redirectAttributes;

	private Owner owner;

	private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "VIEWS_OWNER_CREATE_OR_UPDATE_FORM";

	@BeforeEach
	@Test
	public void testProcessUpdateOwnerForm_WithErrors_oKjR1_fid2() {
		BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		String view = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);
		verify(redirectAttributes).addFlashAttribute("error", "There was an error in updating the owner.");
		assertEquals("VIEWS_OWNER_CREATE_OR_UPDATE_FORM", view);
	}

}