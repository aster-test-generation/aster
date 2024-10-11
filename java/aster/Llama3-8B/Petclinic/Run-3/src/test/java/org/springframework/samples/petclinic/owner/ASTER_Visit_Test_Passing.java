/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Visit_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_TyWc0() {
		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		assertEquals(LocalDate.now(), visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDescription_fdkz0() {
		Visit visit = new Visit();
		String description = "New description";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_kKsN0() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.now();
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateNull_Xxld1() {
		Visit visit = new Visit();
		visit.setDate(null);
		assertEquals(null, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateAfterMaximumDate_Voie2() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2050, 12, 31);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateBeforeMinimumDate_hUYy3() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(1900, 1, 1);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescriptionWithEmptyDescription_ntbW2_fFSL0() {
		Visit visit = new Visit();
		visit.setDescription("");
		assertEquals("", visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescriptionWithMultipleWords_AVlo3_cyEG0() {
		Visit visit = new Visit();
		String description = "This is a test description with multiple words";
		visit.setDescription(description);
		assert visit.getDescription().equals(description);
	}

}