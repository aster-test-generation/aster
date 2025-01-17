/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_QQXY0() {
		Pet pet = new Pet();
		Collection<Visit> visits = pet.getVisits();
		assertNotNull(visits);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_with_visits_KZMV1() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		Visit visit2 = new Visit();
		pet.addVisit(visit1);
		pet.addVisit(visit2);
		Collection<Visit> visits = pet.getVisits();
		assertEquals(2, visits.size());
		assertTrue(visits.contains(visit1));
		assertTrue(visits.contains(visit2));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitNullVisit_uhzF1() {
		Pet pet = new Pet();
		try {
			pet.addVisit(null);
			fail("Expected IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			assertEquals("Visit cannot be null", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitNullDate_acFY2() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDescription("Test visit");
		try {
			pet.addVisit(visit);
			fail("Expected IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			assertEquals("Visit date cannot be null", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitNullDescription_RTMi3() {
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		try {
			pet.addVisit(visit);
			fail("Expected IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			assertEquals("Visit description cannot be null", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getBirthDateTest_TKkt0() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.now());
		LocalDate birthDate = pet.getBirthDate();
		assertEquals(LocalDate.now(), birthDate);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getBirthDateTest2_ZgOb1() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2022, 1, 1));
		LocalDate birthDate = pet.getBirthDate();
		assertEquals(LocalDate.of(2022, 1, 1), birthDate);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setType_with_catType_should_set_type_to_catType_WMGP0() {
		PetType catType = new PetType();
		Pet pet = new Pet();
		pet.setType(catType);
		assert pet.getType() == catType;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setType_with_dogType_should_set_type_to_dogType_Gxea1() {
		PetType dogType = new PetType();
		Pet pet = new Pet();
		pet.setType(dogType);
		assert pet.getType() == dogType;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_with_visits_KZMV1_1() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		Visit visit2 = new Visit();
		pet.addVisit(visit1);
		pet.addVisit(visit2);
		Collection<Visit> visits = pet.getVisits();
		assertEquals(2, visits.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_with_visits_KZMV1_2() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		Visit visit2 = new Visit();
		pet.addVisit(visit1);
		pet.addVisit(visit2);
		Collection<Visit> visits = pet.getVisits();
		assertTrue(visits.contains(visit1));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVisits_with_visits_KZMV1_3() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		Visit visit2 = new Visit();
		pet.addVisit(visit1);
		pet.addVisit(visit2);
		Collection<Visit> visits = pet.getVisits();
		assertTrue(visits.contains(visit2));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitDuplicateVisit_oHNs4_KUoQ0_1() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		visit1.setDate(LocalDate.now());
		visit1.setDescription("Test visit 1");
		pet.addVisit(visit1);
		Visit visit2 = new Visit();
		visit2.setDate(LocalDate.now());
		visit2.setDescription("Test visit 2");
		pet.addVisit(visit2);
		List<Visit> visits = new ArrayList<Visit>(pet.getVisits());
		assertEquals(2, visits.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitDuplicateVisit_oHNs4_KUoQ0_2() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		visit1.setDate(LocalDate.now());
		visit1.setDescription("Test visit 1");
		pet.addVisit(visit1);
		Visit visit2 = new Visit();
		visit2.setDate(LocalDate.now());
		visit2.setDescription("Test visit 2");
		pet.addVisit(visit2);
		List<Visit> visits = new ArrayList<Visit>(pet.getVisits());
		assertTrue(visits.contains(visit1));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitDuplicateVisit_oHNs4_KUoQ0_3() {
		Pet pet = new Pet();
		Visit visit1 = new Visit();
		visit1.setDate(LocalDate.now());
		visit1.setDescription("Test visit 1");
		pet.addVisit(visit1);
		Visit visit2 = new Visit();
		visit2.setDate(LocalDate.now());
		visit2.setDescription("Test visit 2");
		pet.addVisit(visit2);
		List<Visit> visits = new ArrayList<Visit>(pet.getVisits());
		assertTrue(visits.contains(visit2));
	}

}