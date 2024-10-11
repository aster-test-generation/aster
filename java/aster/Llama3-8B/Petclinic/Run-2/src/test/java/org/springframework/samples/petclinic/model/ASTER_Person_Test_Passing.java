/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Person_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastName_hATC0() {
		Person person = new Person();
		String lastName = person.getLastName();
		assert lastName != null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_jPFN0() {
		Person person = new Person();
		person.setFirstName("John");
		assertEquals("John", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetFirstName_TFVI0() {
		Person person = new Person();
		String firstName = person.getFirstName();
		assert firstName == null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_cdjm0() {
		Person person = new Person();
		person.setLastName("Smith");
		assertEquals("Smith", person.getLastName());
	}

}