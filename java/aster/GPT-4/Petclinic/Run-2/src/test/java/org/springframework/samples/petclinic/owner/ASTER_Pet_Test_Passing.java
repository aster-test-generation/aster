/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_QXIf0() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		pet.addVisit(visit);
		assertTrue(pet.getVisits().contains(visit));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_AfxB0() {
		Pet pet = new Pet();
		LocalDate expectedDate = LocalDate.of(2023, 3, 15);
		pet.setBirthDate(expectedDate);
		assertEquals(expectedDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetType_YhBf0() {
		Pet pet = new Pet();
		assertNull(pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_OPLL0() {
		Pet pet = new Pet();
		LocalDate expected = LocalDate.now(); // Assuming today's date as the birth date
												// for testing
		pet.setBirthDate(expected); // Assuming there is a method to set the birth date
		LocalDate actual = pet.getBirthDate();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_cmCu0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		pet.setType(expectedType);
		assertEquals(expectedType, pet.getType());
	}

}