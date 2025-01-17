/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.text.ParseException;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;
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
	public void testParse_NullText_ThrowsParseException_Skeg2() throws java.text.ParseException {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetTypeFormatter formatter = new PetTypeFormatter(owners);
		try {
			formatter.parse(null, Locale.US);
			fail("Expected ParseException");
		}
		catch (ParseException e) {
			assertEquals("type not found: null", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse_EmptyText_ThrowsParseException_zljY3() throws java.text.ParseException {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetTypeFormatter formatter = new PetTypeFormatter(owners);
		try {
			formatter.parse("", Locale.US);
			fail("Expected ParseException");
		}
		catch (ParseException e) {
			assertEquals("type not found: ", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParse_FindPetTypesReturnsNull_ThrowsNullPointerException_iGvD4() throws java.text.ParseException {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetTypeFormatter formatter = new PetTypeFormatter(owners);
		when(owners.findPetTypes()).thenReturn(null);
		try {
			formatter.parse("Dog", Locale.US);
			fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			assertNotNull(e);
		}
	}

}