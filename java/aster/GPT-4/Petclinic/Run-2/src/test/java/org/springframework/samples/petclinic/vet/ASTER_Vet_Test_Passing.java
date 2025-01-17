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
	public void testGetNrOfSpecialties_SQjR0() {
		Vet vet = new Vet();
		int specialtiesCount = vet.getNrOfSpecialties();
		assertEquals(0, specialtiesCount); // Assuming getSpecialtiesInternal() returns an
											// empty list by default
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesReturnsSortedSpecialties_YQOR0() {
		Vet vet = new Vet();
		List<Specialty> result = vet.getSpecialties();
		boolean isSorted = true;
		for (int i = 1; i < result.size(); i++) {
			if (result.get(i - 1).getName().compareTo(result.get(i).getName()) > 0) {
				isSorted = false;
				break;
			}
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_qmaj0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
		assertTrue(specialties.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddSpecialty_cFld0() {
		Vet vet = new Vet();
		Specialty specialty = new Specialty();
		vet.addSpecialty(specialty);
		assertTrue(vet.getSpecialtiesInternal().contains(specialty));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_qmaj0_1() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreNull_ShouldInitializeAndReturnEmptySet_qmaj0_2() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertTrue(specialties.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetSpecialtiesInternal_jNBY0_agbj0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = new HashSet<>();
		specialties.add(new Specialty());
		specialties.add(new Specialty());
		vet.setSpecialtiesInternal(specialties);
		assertEquals(specialties, vet.getSpecialties());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreAlreadySet_ShouldReturnExistingSet_Meub1_wGzW0_1() {
		Vet vet = new Vet();
		Set<Specialty> existingSpecialties = vet.getSpecialtiesInternal();
		Specialty cardiology = new Specialty();
		existingSpecialties.add(cardiology);
		Set<Specialty> returnedSpecialties = vet.getSpecialtiesInternal();
		assertNotNull(returnedSpecialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreAlreadySet_ShouldReturnExistingSet_Meub1_wGzW0_2() {
		Vet vet = new Vet();
		Set<Specialty> existingSpecialties = vet.getSpecialtiesInternal();
		Specialty cardiology = new Specialty();
		existingSpecialties.add(cardiology);
		Set<Specialty> returnedSpecialties = vet.getSpecialtiesInternal();
		assertFalse(returnedSpecialties.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreAlreadySet_ShouldReturnExistingSet_Meub1_wGzW0_3() {
		Vet vet = new Vet();
		Set<Specialty> existingSpecialties = vet.getSpecialtiesInternal();
		Specialty cardiology = new Specialty();
		existingSpecialties.add(cardiology);
		Set<Specialty> returnedSpecialties = vet.getSpecialtiesInternal();
		assertEquals(1, returnedSpecialties.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternal_WhenSpecialtiesAreAlreadySet_ShouldReturnExistingSet_Meub1_wGzW0_4() {
		Vet vet = new Vet();
		Set<Specialty> existingSpecialties = vet.getSpecialtiesInternal();
		Specialty cardiology = new Specialty();
		existingSpecialties.add(cardiology);
		Set<Specialty> returnedSpecialties = vet.getSpecialtiesInternal();
		assertTrue(returnedSpecialties.contains(cardiology));
	}

}