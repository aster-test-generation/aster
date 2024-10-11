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
	public void testGetDescription_hLZD0() {
		Visit visit = new Visit();
		assertEquals("Expected description", visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_hAjh0_CnGj0() {
		Visit visit = new Visit();
		LocalDate expectedDate = LocalDate.of(2023, 3, 15);
		visit.setDate(expectedDate);
		assertEquals(expectedDate, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDescription_RRKX0_ktbQ0() {
		Visit visit = new Visit();
		String expectedDescription = "Medical checkup";
		visit.setDescription(expectedDescription);
		assertEquals(expectedDescription, visit.getDescription());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_tmoi0_VlkE0() {
		Visit visit = new Visit();
		LocalDate expectedDate = LocalDate.now(); // Assuming the constructor sets the
													// date to the current date
		visit.setDate(expectedDate);
		LocalDate actualDate = visit.getDate();
		assertEquals(expectedDate, actualDate);
	}

}