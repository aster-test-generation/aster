/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Visit_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDescription_Tjxp0() {
		Visit visit = new Visit();
		visit.setDescription("Test Description");
		assertEquals("Test Description", visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_ZQqB0() {
		Visit visit = new Visit();
		LocalDate date = visit.getDate();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_eeGP0_tLQj1() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.now();
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

}