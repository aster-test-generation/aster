/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.Errors;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_PetClass_ReturnsTrue_TNJe0() {
		PetValidator petValidator = new PetValidator();
		assertTrue(petValidator.supports(Pet.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_SubclassOfPet_ReturnsTrue_amOa1() {
		PetValidator petValidator = new PetValidator();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_NotPetClass_ReturnsFalse_hQSq2() {
		PetValidator petValidator = new PetValidator();
		assertFalse(petValidator.supports(String.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_NullClass_ThrowsNullPointerException_zQfN3() {
		PetValidator petValidator = new PetValidator();
		try {
			petValidator.supports(null);
			fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_NameIsNull_RejectsValue_iIaU2_EivV0() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setName(null);
		org.springframework.validation.BeanPropertyBindingResult errors = new org.springframework.validation.BeanPropertyBindingResult(
				pet, "pet");
		petValidator.validate(pet, errors);
		assertTrue(errors.hasErrors());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_NameIsEmpty_RejectsValue_KChF3_uNgo0() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setName("");
		org.springframework.validation.BindingResult errors = new org.springframework.validation.BeanPropertyBindingResult(
				pet, "pet");
		petValidator.validate(pet, errors);
		assertTrue(errors.hasErrors());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_BirthDateIsNull_RejectsValue_ddPs7_CItU0() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setBirthDate(null);
		org.springframework.validation.BindingResult errors = new org.springframework.validation.BeanPropertyBindingResult(
				pet, "pet");
		petValidator.validate(pet, errors);
		assertTrue(errors.hasErrors());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_NameIsValid_DoesNotRejectValue_FFvp4_Lkln0_fid1() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setName("Valid Name");
		org.springframework.validation.Errors errors = new org.springframework.validation.BeanPropertyBindingResult(pet,
				"pet");
		petValidator.validate(pet, errors);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidate_BirthDateIsValid_DoesNotRejectValue_sseN8_yXLu0_fid1() {
		PetValidator petValidator = new PetValidator();
		Pet pet = new Pet();
		pet.setBirthDate(java.time.LocalDate.now());
		org.springframework.validation.Errors errors = new org.springframework.validation.BeanPropertyBindingResult(pet,
				"pet");
		petValidator.validate(pet, errors);
		assertTrue(errors.hasErrors());
	}

}