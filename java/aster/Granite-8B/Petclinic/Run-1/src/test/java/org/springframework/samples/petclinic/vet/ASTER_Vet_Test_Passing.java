/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
	public void testNrOfSpecialties_LZTY0() {
		Vet vet = new Vet();
		int nrOfSpecialties = vet.getNrOfSpecialties();
		assertTrue(nrOfSpecialties >= 0);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_CSmC0() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertNotNull(specialties);
		assertTrue(specialties.size() > 0);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getSpecialtiesInternal_lLXR0() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
		assertTrue(specialties.isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_CSmC0_1() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_CSmC0_2() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertTrue(specialties.size() > 0);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getSpecialtiesInternal_lLXR0_1() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertNotNull(specialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getSpecialtiesInternal_lLXR0_2() {
		Vet vet = new Vet();
		Set<Specialty> specialties = vet.getSpecialtiesInternal();
		assertTrue(specialties.isEmpty());
	}

}