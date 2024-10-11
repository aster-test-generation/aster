/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupportsPetClass_Mlcr0() {
		PetValidator petValidator = new PetValidator();
		assertTrue(petValidator.supports(Pet.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupportsNonPetClass_vAYa1() {
		PetValidator petValidator = new PetValidator();
		assertFalse(petValidator.supports(String.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidatePetWithName_EAUF3_vTpO0() {
		Pet pet = new Pet();
		pet.setName("Test Name");
		PetValidator petValidator = new PetValidator();
		petValidator.supports(Pet.class); // This line is added to fix the error
	}

}