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

public class Aster_BaseEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetId_umnj0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer expectedId = null;
		assertEquals(expectedId, baseEntity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNull_vTqp0_tqSX0() {
		BaseEntity entity = new BaseEntity();
		entity.setId(null);
		assertTrue(entity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNotNull_Tqjo1_zLXR0() {
		BaseEntity entity = new BaseEntity();
		entity.setId(123);
		assertFalse(entity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetId_rtyv0_fABK0() {
		BaseEntity entity = new BaseEntity();
		Integer expectedId = 5;
		entity.setId(expectedId);
		assertEquals(expectedId, entity.getId());
	}

}