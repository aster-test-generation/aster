/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
	public void testGetSpecialties_zmgM0() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(0, specialties.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternalWhenSpecialtiesIsNull_wuZg0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesInternalWhenSpecialtiesIsNotNull_cEEO1() {
		Vet vet = new Vet();
		vet.getSpecialtiesInternal();
		vet.getSpecialtiesInternal();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetSpecialtiesInternal_yDfr0_tokT0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = new HashSet<>();
		specialties.add(new Specialty());
		specialties.add(new Specialty());
		vet.addSpecialty(new Specialty());
		Set<Specialty> actual = new HashSet<>(vet.getSpecialtiesInternal());
		assertEquals(specialties, actual);
	}

}