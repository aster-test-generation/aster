/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.ModelMap;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationFormWithInvalidPet_xEgl3_BkpI0() {
		Owner owner = new Owner();
		Pet pet = null;
		PetController petController = new PetController(null);
		ModelMap model = new ModelMap();
		try {
			petController.initCreationForm(owner, model);
			fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
		}
	}

}