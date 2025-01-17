/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisitsReturnsEmptyCollectionWhenNoVisitsAdded_kSik0() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertTrue(visits.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_ZCKC0() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		pet.addVisit(visit);
		assertTrue(pet.getVisits().contains(visit));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_pWir0() {
		Pet pet = new Pet();
		LocalDate expectedDate = LocalDate.of(2023, 3, 15);
		pet.setBirthDate(expectedDate);
		assertEquals(expectedDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_OHET0() {
		Pet pet = new Pet();
		LocalDate expected = LocalDate.now(); // Assuming the birthDate is set to the
												// current date somewhere in the
												// constructor or setter
		pet.setBirthDate(expected); // This line assumes there's a setter method available
									// to set the birth date
		LocalDate actual = pet.getBirthDate();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_tuhf0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		pet.setType(expectedType);
		assertEquals(expectedType, pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTypeReturnsCorrectType_tGNL0_IyjN0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		pet.setType(expectedType); // Correct way to set the type using the provided
									// method
		PetType actualType = pet.getType();
		assertEquals(expectedType, actualType);
	}

}