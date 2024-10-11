/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisits_bExs0() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_emdz0() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		visit.setDescription("Test Description");
		pet.addVisit(visit);
		assertEquals(1, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_CAcm0() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.of(2022, 1, 1);
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetType_ksqz0() {
		Pet pet = new Pet();
		PetType expectedType = new PetType();
		assertEquals(expectedType, pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_nRqg0() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.now();
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_wCPQ0() {
		Pet pet = new Pet();
		PetType petType = new PetType();
		pet.setType(petType);
		assertEquals(petType, pet.getType());
	}

}