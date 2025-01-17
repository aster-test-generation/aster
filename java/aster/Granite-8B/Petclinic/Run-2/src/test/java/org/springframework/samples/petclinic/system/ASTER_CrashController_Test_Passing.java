/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.system;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CrashController_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testTriggerException_DCNj0_1() {
		CrashController controller = new CrashController();
		String result = controller.triggerException();
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testTriggerException_DCNj0_2() {
		CrashController controller = new CrashController();
		String result = controller.triggerException();
		assertEquals("Expected: controller used to showcase what " + "happens when an exception is thrown", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testTriggerException_DCNj0() {
		CrashController controller = new CrashController();
		String result = controller.triggerException();
		assertNotNull(result);
		assertEquals("Expected: controller used to showcase what " + "happens when an exception is thrown", result);
	}

}