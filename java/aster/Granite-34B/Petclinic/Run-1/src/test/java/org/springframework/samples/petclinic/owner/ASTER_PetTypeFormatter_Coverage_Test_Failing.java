/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.text.ParseException;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

public class Aster_PetTypeFormatter_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse1_zZhB0() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		assertEquals(result, new PetType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse2_jcFd1() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		assertNotEquals(result, new PetType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse5_TtGT4() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		PetType expected = new PetType();
		assertEquals(result, expected);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse6_jOkJ5() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		String text = "text";
		Locale locale = Locale.getDefault();
		PetType result = petTypeFormatter.parse(text, locale);
		PetType expected = new PetType();
		assertNotEquals(result, expected);
	}

}