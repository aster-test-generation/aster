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

public class Aster_BaseEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNull_ZgGQ0() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setId(null);
		boolean actual = baseEntity.isNew();
		boolean expected = true;
		assert actual == expected;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void getId_Qwls0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer id = baseEntity.getId();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void getId_auJb1() {
		BaseEntity baseEntity = new BaseEntity();
		Integer id = baseEntity.getId();
		assertEquals(id, baseEntity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void getId_DXBR2() {
		BaseEntity baseEntity1 = new BaseEntity();
		BaseEntity baseEntity2 = new BaseEntity();
		Integer id1 = baseEntity1.getId();
		Integer id2 = baseEntity2.getId();
		assertEquals(id1, id2);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNewWhenIdIsNotNull_AeKX1_dAsr0() {
		BaseEntity baseEntity = new BaseEntity();
		baseEntity.setId(1);
		boolean actual = baseEntity.isNew();
		boolean expected = false;
		assert actual == expected;
	}

}