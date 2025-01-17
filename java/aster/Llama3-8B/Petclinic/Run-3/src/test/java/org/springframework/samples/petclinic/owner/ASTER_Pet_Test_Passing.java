/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_mUOc0() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertNotNull(visits);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getBirthDateTest_Qjuf0() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.now());
		LocalDate birthDate = pet.getBirthDate();
		assertEquals(LocalDate.now(), birthDate);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getBirthDateTest2_JiQj1() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2022, 12, 25));
		LocalDate birthDate = pet.getBirthDate();
		assertEquals(LocalDate.of(2022, 12, 25), birthDate);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_CcEG0() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.now();
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDateNull_BCRT1() {
		Pet pet = new Pet();
		LocalDate birthDate = null;
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDateBefore1900_hvUH2() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.of(1899, 12, 31);
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDateAfter2022_AWQK3() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.of(2023, 1, 1);
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_irKB0() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		visit.setDescription("General Checkup");
		pet.addVisit(visit);
		assertEquals(1, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithEmptyVisit_PFJI2() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		pet.addVisit(visit);
		assertEquals(1, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithMultipleVisits_yNDF3() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		visit1.setDate(LocalDate.now());
		visit1.setDescription("General Checkup");
		Visit visit2 = new Visit();
		visit2.setDate(LocalDate.now().plusDays(1));
		visit2.setDescription("Dentist Visit");
		pet.addVisit(visit1);
		pet.addVisit(visit2);
		assertEquals(2, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithNullVisit_sjjw1_fid1() {
		Pet pet = new Pet();
		pet.addVisit(null);
		assertEquals(1, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithInvalidVisit_Uxkl4_fid1() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDate(null);
		visit.setDescription(null);
		pet.addVisit(visit);
		assertEquals(1, pet.getVisits().size());
	}

}