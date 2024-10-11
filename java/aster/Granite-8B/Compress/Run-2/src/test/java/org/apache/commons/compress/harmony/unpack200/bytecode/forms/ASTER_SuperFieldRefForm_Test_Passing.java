/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SuperFieldRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testgetPoolID_lsPh0() throws Exception {
		SuperFieldRefForm form = new SuperFieldRefForm(0, "", new int[0]);
		assertEquals(SegmentConstantPool.CP_FIELD, form.getPoolID());
	}
}