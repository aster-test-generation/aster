/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic;

import org.springframework.aot.hint.RuntimeHints;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetClinicRuntimeHints_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_vdua1() {
		PetClinicRuntimeHints obj = new PetClinicRuntimeHints();
		obj.registerHints(new RuntimeHints(), null);
	}

}