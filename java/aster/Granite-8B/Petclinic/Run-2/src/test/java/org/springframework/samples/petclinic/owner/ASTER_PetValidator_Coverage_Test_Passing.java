/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_vjiz0() {
		PetValidator petValidator = new PetValidator();
		boolean result = petValidator.supports(Pet.class);
		assertTrue(result);
	}

}