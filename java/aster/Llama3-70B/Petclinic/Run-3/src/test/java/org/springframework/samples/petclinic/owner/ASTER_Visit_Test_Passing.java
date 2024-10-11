/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Visit_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_BMGT0() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2022, 1, 1);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_Hnir0() {
		Visit visit = new Visit();
		String result = visit.getDescription();
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDescription_sreo0() {
		Visit visit = new Visit();
		visit.setDescription("Test description");
		assertEquals("Test description", visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_cmOq0() {
		Visit visit = new Visit();
		LocalDate date = visit.getDate();
		assertNotNull(date);
	}

}