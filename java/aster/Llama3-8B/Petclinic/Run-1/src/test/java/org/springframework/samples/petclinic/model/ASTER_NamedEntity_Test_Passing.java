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
	public void testSetName_EgBQ0() {
		NamedEntity entity = new NamedEntity();
		entity.setName("John");
		assertEquals("John", entity.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_JPvc0() {
		NamedEntity namedEntity = new NamedEntity();
		String result = namedEntity.toString();
		assertEquals("getName", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetName_KRVV0_RGzM1() {
		NamedEntity entity = new NamedEntity();
		entity.setName("Expected Name");
		String actual = entity.toString();
		assertEquals("Expected Name", actual);
	}

}