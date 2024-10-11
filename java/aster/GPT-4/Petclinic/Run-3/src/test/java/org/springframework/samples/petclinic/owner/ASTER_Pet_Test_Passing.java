/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisitsReturnsEmptyCollectionWhenNoVisitsAdded_UuKH0() {
		Pet pet = new Pet();
		assertTrue(pet.getVisits().isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_DtHg0() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		pet.addVisit(visit);
		assertTrue(pet.getVisits().contains(visit));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_scEM0() {
		Pet pet = new Pet();
		LocalDate expectedDate = LocalDate.of(2022, 1, 1);
		pet.setBirthDate(expectedDate);
		assertEquals(expectedDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_TeIZ0() {
		Pet pet = new Pet();
		LocalDate expected = LocalDate.now(); // Assuming today's date is set as birthDate
												// for testing
		pet.setBirthDate(expected); // Assuming there is a setter method to set birthDate
		LocalDate actual = pet.getBirthDate();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_uHot0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		pet.setType(expectedType);
		assertEquals(expectedType, pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTypeReturnsCorrectType_HXgN0_GVTF0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		pet.setType(expectedType); // Correctly using the setType method to set the type
		PetType actualType = pet.getType();
		assertEquals(expectedType, actualType);
	}

}