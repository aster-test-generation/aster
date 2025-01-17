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

public class Aster_Visit_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateInvalidDate_MdtM4() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2022, 2, 30);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescriptionWithNullDescription_vTOK1_FYol0() {
		Visit visit = new Visit();
		visit.setDescription(null);
		assert visit.getDescription().equals(null);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateInvalidDate_MdtM4_fid2() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2022, 02, 30);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

}