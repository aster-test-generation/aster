/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamedEntity_Test_Failing {

	NamedEntity entity = new NamedEntity();

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_aiCD0() {
		NamedEntity entity = new NamedEntity();
		String expected = "NamedEntity";
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithNullObject_Fvpn6() {
		NamedEntity entity = null;
		String expected = null;
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithEmptyName_wKos3_CbYy0() {
		NamedEntity entity = new NamedEntity();
		String expected = "";
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_aiCD0_fid2() {
		NamedEntity entity = new NamedEntity();
		String expected = "NamedEntity";
		String actual = entity.toString();
		assertNull(expected);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithNullObject_Fvpn6_fid2() {
		NamedEntity entity = null;
		String expected = "null";
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithEmptyName_wKos3_CbYy0_fid2() {
		NamedEntity entity = new NamedEntity();
		String expected = "";
		String actual = entity.toString();
		assertNull(expected);
	}

}