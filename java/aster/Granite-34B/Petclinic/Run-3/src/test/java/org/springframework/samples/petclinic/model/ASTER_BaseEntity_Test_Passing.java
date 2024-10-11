/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNull_NvPR0() {
		BaseEntity entity = new BaseEntity();
		boolean result = entity.isNew();
		assertTrue(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNotNull_mPWY1() {
		BaseEntity entity = new BaseEntity();
		entity.setId(1);
		boolean result = entity.isNew();
		assertFalse(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetId_aOoM0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer id = baseEntity.getId();
		assertEquals(null, id);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetId_GYpO0() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setId(10);
		assertEquals(10, baseEntity.getId());
	}

}