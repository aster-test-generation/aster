/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CrashController_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testTriggerException_tPFz0() {
		CrashController controller = new CrashController();
		try {
			String result = controller.triggerException();
			fail("Expected RuntimeException");
		}
		catch (RuntimeException e) {
		}
	}

}