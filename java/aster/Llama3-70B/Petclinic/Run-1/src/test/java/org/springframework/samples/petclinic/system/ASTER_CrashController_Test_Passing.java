/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.system;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CrashController_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testTriggerException_BdKH0() {
		CrashController crashController = new CrashController();
		try {
			crashController.triggerException();
			fail("Expected RuntimeException to be thrown");
		}
		catch (RuntimeException e) {
			assertEquals("Expected: controller used to showcase what happens when an exception is thrown",
					e.getMessage());
		}
	}

}