/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamedEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getNameTest_PcHP0() {
		NamedEntity namedEntity = new NamedEntity();
		String name = namedEntity.getName();
		assert name == null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_JNnj0() {
		NamedEntity namedEntity = new NamedEntity();
		namedEntity.setName("John");
		assertEquals("John", namedEntity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetNameNull_mCYg1() {
		NamedEntity namedEntity = new NamedEntity();
		namedEntity.setName(null);
		assertEquals(null, namedEntity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetNameEmpty_Ewqc2() {
		NamedEntity namedEntity = new NamedEntity();
		namedEntity.setName("");
		assertEquals("", namedEntity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_qzSo9() {
		NamedEntity namedEntity = new NamedEntity();
		String expected = namedEntity.getName();
		String actual = namedEntity.toString();
		assertEquals(expected, actual);
	}

}