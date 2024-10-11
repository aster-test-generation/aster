/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.Errors;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_BirthDateIsValid_DoesNotRejectValue_jOAn8_BgJm0_fid2() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setBirthDate(java.time.LocalDate.now());
		org.springframework.validation.Errors errors = new org.springframework.validation.BeanPropertyBindingResult(pet,
				"pet");
		petValidator.validate(pet, errors);
		assertFalse(errors.hasErrors());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_NameIsValid_DoesNotRejectValue_fubF4_hxjx0_fid2() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setName("Valid Name");
		org.springframework.validation.BindingResult errors = new org.springframework.validation.BeanPropertyBindingResult(
				pet, "pet");
		petValidator.validate(pet, errors);
		assertFalse(errors.hasErrors());
	}

}