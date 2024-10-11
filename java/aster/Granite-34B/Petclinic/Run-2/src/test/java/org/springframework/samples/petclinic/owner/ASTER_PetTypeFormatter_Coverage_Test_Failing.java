/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.text.ParseException;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
	public void testParse1_yAGw0() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		PetType petType = petTypeFormatter.parse("type1", Locale.ENGLISH);
		assertEquals("type1", petType.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse2_lDZA1() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		PetType petType = petTypeFormatter.parse("type2", Locale.ENGLISH);
		assertEquals("type2", petType.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse5_HjbK4() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		PetType petType = petTypeFormatter.parse("type5", Locale.ENGLISH);
		assertEquals("type5", petType.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse6_DcFS5() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		PetType petType = petTypeFormatter.parse("type6", Locale.ENGLISH);
		assertEquals("type6", petType.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse6_DcFS5_fid1() throws java.text.ParseException {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		when(mockOwnerRepository.findPetTypes()).thenReturn(Arrays.asList(new PetType()));
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(mockOwnerRepository);
		PetType petType = petTypeFormatter.parse("type6", Locale.ENGLISH);
		assertNotNull(petType);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testPrint_XuoI0_rGnh0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetTypeFormatter petTypeFormatter = new PetTypeFormatter(owners);
		PetType petType = new PetType();
		String name = "name";
		when(petType.getName()).thenReturn(name);
		String result = petTypeFormatter.print(petType, Locale.ENGLISH);
		assertEquals(name, result);
	}

}