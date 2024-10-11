/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.text.ParseException;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetTypeFormatter_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse3_XtGr2() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse4_mRYb3() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testPrint_OQEG0_BGqb0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(owners);
		PetType petType = new PetType();
		String result = petTypeFormatter.print(petType, Locale.ENGLISH);
		assertEquals(result, petType.getName());
	}

}