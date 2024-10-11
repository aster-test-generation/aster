/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
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
	public void testSetSpecialtiesInternal_MnBA0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = new HashSet<>();
		Specialty specialty1 = new Specialty();
		Specialty specialty2 = new Specialty();
		specialties.add(specialty1);
		specialties.add(specialty2);
		vet.setSpecialtiesInternal(specialties);
		assert vet.getSpecialties().equals(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternalWhenSpecialtiesIsNull_XWlz0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternalWhenSpecialtiesIsNotNull_AnSg1() {
		Vet vet = new Vet();
		vet.getSpecialtiesInternal();
		vet.getSpecialtiesInternal();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNrOfSpecialties_Pzzi0_GJXM0() {
		Vet vet = new Vet();
		List<Specialty> specialties = new ArrayList<>();
		vet.addSpecialty(new Specialty());
		vet.addSpecialty(new Specialty());
		vet.addSpecialty(new Specialty());
		int nrOfSpecialties = vet.getSpecialtiesInternal().size();
		org.junit.Assert.assertEquals(3, nrOfSpecialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddSpecialty_Xvmg0_DpcV0() {
		Vet vet = new Vet();
		Specialty specialty = new Specialty();
		vet.addSpecialty(specialty);
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertTrue(specialties.contains(specialty));
	}

}