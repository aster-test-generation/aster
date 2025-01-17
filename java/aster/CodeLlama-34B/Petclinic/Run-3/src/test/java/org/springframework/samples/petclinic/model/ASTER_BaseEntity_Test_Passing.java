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
	public void testSetId_bJzm0() {
		BaseEntity entity = new BaseEntity();
		entity.setId(1);
		assertEquals(1, entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetIdWithNull_Rsme1() {
		BaseEntity entity = new BaseEntity();
		entity.setId(null);
		assertNull(entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetIdWithInvalidValue_vaMD2() {
		BaseEntity entity = new BaseEntity();
		entity.setId(0);
		assertEquals(0, entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNew_NewEntity_Cjry0() {
		BaseEntity entity = new BaseEntity();
		assertTrue(entity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNew_ExistingEntityWithNullId_bUHK3() {
		BaseEntity entity = new BaseEntity();
		entity.setId(null);
		assertTrue(entity.isNew());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetId_jTIE0() {
		BaseEntity entity = new BaseEntity();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetIdWithNegativeId_IRkU2() {
		BaseEntity entity = new BaseEntity();
		entity.setId(-1);
		assertEquals(-1, entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetIdWithMaxIntegerId_viDK3() {
		BaseEntity entity = new BaseEntity();
		entity.setId(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetIdWithMinIntegerId_LAZe4() {
		BaseEntity entity = new BaseEntity();
		entity.setId(Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE, entity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNew_NewEntityWithNonNullId_PFLW2_oXFr0() {
		BaseEntity entity = new BaseEntity();
		entity.setId(1);
		assertFalse(entity.isNew());
	}

}