/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.Errors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_WithPetClass_ShouldReturnTrue_eyVP0() {
		PetValidator validator = new PetValidator();
		Class<Pet> clazz = Pet.class;
		boolean result = validator.supports(clazz);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithNullPet_tIDY0() {
		PetValidator validator = new PetValidator();
		Errors errors = mock(Errors.class);
		validator.validate(null, errors);
		verify(errors, never()).rejectValue(anyString(), anyString(), anyString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithExistingPetAndNullType_BhEV5() {
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(false);
		when(pet.getType()).thenReturn(null);
		Errors errors = mock(Errors.class);
		PetValidator validator = new PetValidator();
		validator.validate(pet, errors);
		verify(errors, never()).rejectValue("type", "REQUIRED", "REQUIRED");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithAllInvalidFields_etDG8() {
		Pet pet = mock(Pet.class);
		when(pet.getName()).thenReturn("");
		when(pet.isNew()).thenReturn(true);
		when(pet.getType()).thenReturn(null);
		when(pet.getBirthDate()).thenReturn(null);
		Errors errors = mock(Errors.class);
		PetValidator validator = new PetValidator();
		validator.validate(pet, errors);
		verify(errors).rejectValue("name", "REQUIRED", "REQUIRED");
		verify(errors).rejectValue("type", "REQUIRED", "REQUIRED");
		verify(errors).rejectValue("birthDate", "REQUIRED", "REQUIRED");
	}

}