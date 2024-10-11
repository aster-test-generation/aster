/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNrOfSpecialties_pjrP0() {
		Vet vet = new Vet();
		int result = vet.getNrOfSpecialties();
		assertEquals(0, result); // Assuming getSpecialtiesInternal() returns an empty
									// list initially
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesReturnsSortedSpecialties_Fsor0() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		for (int i = 0; i < specialties.size() - 1; i++) {
			assertTrue(specialties.get(i).getName().compareTo(specialties.get(i + 1).getName()) <= 0);
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_asVf0() {
		Vet vet = new Vet();
		Set<Specialty> result = vet.getSpecialtiesInternal();
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreAlreadyInitialized_ShouldReturnSameSet_ECta1() {
		Vet vet = new Vet();
		Set<Specialty> firstCallResult = vet.getSpecialtiesInternal();
		Set<Specialty> secondCallResult = vet.getSpecialtiesInternal();
		assertSame(firstCallResult, secondCallResult);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddSpecialty_hEEw0() {
		Vet vet = new Vet();
		Specialty specialty = new Specialty();
		vet.addSpecialty(specialty);
		assertTrue(vet.getSpecialtiesInternal().contains(specialty));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_asVf0_1() {
		Vet vet = new Vet();
		Set<Specialty> result = vet.getSpecialtiesInternal();
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_asVf0_2() {
		Vet vet = new Vet();
		Set<Specialty> result = vet.getSpecialtiesInternal();
		assertTrue(result.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetSpecialtiesInternal_tGNn0_JpZP0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = new HashSet<>();
		specialties.add(new Specialty());
		vet.setSpecialtiesInternal(specialties);
		assertEquals(specialties, vet.getSpecialties());
	}

}