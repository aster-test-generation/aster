/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisits_LRrV0_1() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertNotNull(visits);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisits_LRrV0_2() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertTrue(visits.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_Sklf0() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.of(2022, 1, 1);
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getTypeTest_kmLi0() {
		Pet pet = new Pet();
		PetType type = pet.getType();
		assertNotNull(type);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_SmZH0() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.now());
		LocalDate birthDate = pet.getBirthDate();
		assertNotNull(birthDate);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_WRIF0_1() {
		Pet pet = new Pet();
		PetType type = new PetType();
		pet.setType(type);
		assertNotNull(pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_WRIF0_2() {
		Pet pet = new Pet();
		PetType type = new PetType();
		pet.setType(type);
		assertEquals(pet.getType(), type);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetTypeNull_FMke1() {
		Pet pet = new Pet();
		pet.setType(null);
		assertNull(pet.getType());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetTypeDifferentObject_sWUO2() {
		Pet pet = new Pet();
		PetType type1 = new PetType();
		PetType type2 = new PetType();
		pet.setType(type1);
		pet.setType(type2);
		assertEquals(pet.getType(), type2);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisits_LRrV0() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertNotNull(visits);
		assertTrue(visits.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_WRIF0() {
		Pet pet = new Pet();
		PetType type = new PetType();
		pet.setType(type);
		assertNotNull(pet.getType());
		assertEquals(pet.getType(), type);
	}

}