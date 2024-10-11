/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamedEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetName_aHeZ0() {
		NamedEntity entity = new NamedEntity();
		String name = entity.getName();
		assertEquals("", name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNameWithName_upfn1() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		String name = entity.getName();
		assertEquals("John Doe", name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNameWithNullName_HjUK2() {
		NamedEntity entity = new NamedEntity();
		entity.setName(null);
		String name = entity.getName();
		assertNull(name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNameWithEmptyName_IHKf3() {
		NamedEntity entity = new NamedEntity();
		entity.setName("");
		String name = entity.getName();
		assertEquals("", name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNameWithInvalidName_teOG5() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		String name = entity.getName();
		assertNotEquals("Jane Doe", name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNameWithNullEntity_hWhK6() {
		NamedEntity entity = null;
		String name = entity.getName();
		assertNull(name);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_ValidName_BQBi0() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		assertEquals("John Doe", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_EmptyName_vpTi1() {
		NamedEntity entity = new NamedEntity();
		entity.setName("");
		assertEquals("", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_NullName_Icpc2() {
		NamedEntity entity = new NamedEntity();
		entity.setName(null);
		assertNull(entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_InvalidName_vqBp3() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe123");
		assertEquals("John Doe123", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_DuplicateName_grXo4() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		entity.setName("John Doe");
		assertEquals("John Doe", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_DifferentName_KQZF5() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		entity.setName("Jane Doe");
		assertEquals("Jane Doe", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_DifferentCaseName_EonZ7() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		entity.setName("john doe");
		assertEquals("John Doe", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_NullName_NullPointerException_RcqP8() {
		NamedEntity entity = new NamedEntity();
		try {
			entity.setName(null);
			fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			assertEquals("Name cannot be null", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetName_EmptyName_IllegalArgumentException_ZppL9() {
		NamedEntity entity = new NamedEntity();
		try {
			entity.setName("");
			fail("Expected IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			assertEquals("Name cannot be empty", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_hRQN0() {
		NamedEntity entity = new NamedEntity();
		String expected = "NamedEntity";
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithName_XMKh1_qaER0() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John Doe");
		String expected = "John Doe";
		String actual = entity.toString();
		assertEquals(expected, actual);
	}

}