/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetClinicApplication_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMain_NKHf0() {
		String[] args = new String[0];
		PetClinicApplication petClinicApplication = new PetClinicApplication();
		SpringApplication.run(PetClinicApplication.class, args);
	}

}