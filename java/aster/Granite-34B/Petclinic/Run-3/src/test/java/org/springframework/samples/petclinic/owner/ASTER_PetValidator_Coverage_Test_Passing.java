/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.validation.Errors;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetValidator_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSupports_uBpn0() {
		PetValidator petValidator = new PetValidator();
		assertTrue(petValidator.supports(Pet.class));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithNullBirthDate_AAua2() {
		PetValidator petValidator = new PetValidator();
		Pet pet = mock(Pet.class);
		Errors errors = mock(Errors.class);
		when(pet.getName()).thenReturn("petName");
		when(pet.isNew()).thenReturn(true);
		when(pet.getType()).thenReturn(mock(PetType.class));
		when(pet.getBirthDate()).thenReturn(null);
		petValidator.validate(pet, errors);
		verify(errors, times(1)).rejectValue(eq("birthDate"), eq("required"), eq("required"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithEmptyNameAndNewTrueAndNullTypeAndNullBirthDate_Vyxe5() {
		PetValidator petValidator = new PetValidator();
		Pet pet = mock(Pet.class);
		Errors errors = mock(Errors.class);
		when(pet.getName()).thenReturn("");
		when(pet.isNew()).thenReturn(true);
		when(pet.getType()).thenReturn(null);
		when(pet.getBirthDate()).thenReturn(null);
		petValidator.validate(pet, errors);
		verify(errors, times(2)).rejectValue(anyString(), anyString(), anyString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testValidateWithEmptyNameAndNewTrueAndNullBirthDate_JIvm7() {
		PetValidator petValidator = new PetValidator();
	}

}