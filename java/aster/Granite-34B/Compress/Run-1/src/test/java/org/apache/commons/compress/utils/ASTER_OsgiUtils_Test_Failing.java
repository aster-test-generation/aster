/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OsgiUtils_Test_Failing {
	{
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsRunningInOsgiEnvironment_InOsgiEnvironment_WVJn0_fid1() {
		boolean expected = true;
		boolean actual =OsgiUtils.isRunningInOsgiEnvironment();
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsRunningInOsgiEnvironment_NotRunningInOsgiEnvironment_cICt1_fid1() {
		boolean expected = false;
		boolean actual =OsgiUtils.isRunningInOsgiEnvironment();
		assertFalse(actual == expected);
	}
}