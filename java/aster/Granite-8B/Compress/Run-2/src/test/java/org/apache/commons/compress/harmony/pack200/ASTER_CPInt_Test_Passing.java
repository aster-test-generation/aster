/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPInt_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_dBEt0() {
        CPInt obj1 = new CPInt(5);
        CPInt obj2 = new CPInt(10);
        assertEquals(-1, obj1.compareTo(obj2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetInt_fzvj0() {
		CPInt cpInt = new CPInt(10);
		int result = cpInt.getInt();
		assertEquals(10, result);
	}
}