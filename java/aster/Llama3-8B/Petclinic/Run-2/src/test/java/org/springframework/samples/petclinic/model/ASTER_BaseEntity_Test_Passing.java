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
	public void testIsNewWhenIdIsNull_IaoA0() {
		BaseEntity baseEntity = new BaseEntity();
		assertTrue(baseEntity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNotNull_LAPx1() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setId(1);
		assertFalse(baseEntity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetId_lGZt0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer result = baseEntity.getId();
		assert result == null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetId_DQVh0() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setId(10);
		assertEquals(10, baseEntity.getId());
	}

}