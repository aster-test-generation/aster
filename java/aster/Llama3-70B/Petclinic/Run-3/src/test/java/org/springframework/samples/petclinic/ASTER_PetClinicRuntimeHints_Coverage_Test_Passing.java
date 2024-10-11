/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.samples.petclinic.model.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetClinicRuntimeHints_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRegisterHints_dbPattern_URWz0() {
		PetClinicRuntimeHints petClinicRuntimeHints = new PetClinicRuntimeHints();
		RuntimeHints hints = mock(RuntimeHints.class);
		ClassLoader classLoader = mock(ClassLoader.class);
		petClinicRuntimeHints.registerHints(hints, classLoader);
		verify(hints.resources()).registerPattern("db/*");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRegisterHints_PersonSerialization_YXYT5() {
		PetClinicRuntimeHints petClinicRuntimeHints = new PetClinicRuntimeHints();
		RuntimeHints hints = mock(RuntimeHints.class);
		ClassLoader classLoader = mock(ClassLoader.class);
		petClinicRuntimeHints.registerHints(hints, classLoader);
		verify(hints.serialization()).registerType(Person.class);
	}

}