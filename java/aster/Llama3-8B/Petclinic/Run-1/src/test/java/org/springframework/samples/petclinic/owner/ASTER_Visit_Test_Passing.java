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
	public void testGetDescription_oxKt0() {
		Visit visit = new Visit();
		visit.setDescription("Test Description");
		assertEquals("Test Description", visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_wWDS0_cDBL1() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2022, 1, 1);
		visit.setDate(date);
		assertEquals(visit.getDate(), date);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_qyIa0_eQtv0() {
		Visit visit = new Visit();
		LocalDate date = visit.getDate();
		org.junit.Assert.assertNotNull(date);
	}

}