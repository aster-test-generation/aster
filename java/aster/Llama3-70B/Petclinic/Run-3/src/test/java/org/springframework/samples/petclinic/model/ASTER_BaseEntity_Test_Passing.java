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

public class Aster_BaseEntity_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetId_FbuH0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer id = baseEntity.getId();
		assertNull(id);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetId_IbFv0() {
		BaseEntity baseEntity = new BaseEntity();
		Integer id = 1;
		baseEntity.setId(id);
		assertEquals(id, baseEntity.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsNew_withNullId_aCeh0() {
		BaseEntity entity = new BaseEntity();
		assert entity.isNew();
	}

}