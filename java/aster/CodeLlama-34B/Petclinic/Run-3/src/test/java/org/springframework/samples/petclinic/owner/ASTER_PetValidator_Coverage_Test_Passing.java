/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.Errors;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	private Errors errors;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_GzDt0() {
		PetValidator petValidator = new PetValidator();
		assertTrue(petValidator.supports(Pet.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupportsWithNonPetClass_zDjS2() {
		PetValidator petValidator = new PetValidator();
		assertFalse(petValidator.supports(String.class));
	}

}