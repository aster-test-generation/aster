/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Map;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Coverage_Test_Passing {

	private BindingResult result;

	private OwnerController ownerController;

	private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "owners/createOrUpdateOwnerForm";

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testShowOwner3_VHMw3() {
		ModelAndView mav = ownerController.showOwner(1);
		assertTrue(mav.getModel().containsKey("owner"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithNullId_fTPt0() {
		Owner owner = ownerController.findOwner(null);
		assertNotNull(owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationFormWithNullModel_qpug2_1() {
		Map<String, Object> model = null;
		String view = ownerController.initCreationForm(model);
		assertEquals(VIEWS_OWNER_CREATE_OR_UPDATE_FORM, view);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationFormWithNullModel_qpug2_2() {
		Map<String, Object> model = null;
		String view = ownerController.initCreationForm(model);
		assertNull(model);
	}

}