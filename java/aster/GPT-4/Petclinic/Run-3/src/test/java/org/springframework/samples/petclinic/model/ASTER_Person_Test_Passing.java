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
	public void testGetLastName_TwCT0_WzLM0() {
		Person person = new Person();
		person.setLastName("Smith"); // Correct way to set lastName using the setter
										// method.
		assertEquals("Smith", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_lOSD0_BiLQ0() {
		Person person = new Person();
		person.setFirstName("John");
		assertEquals("John", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetFirstName_AeHl0_sUus0() {
		Person person = new Person();
		person.setFirstName("John"); // Correctly using the setter method to set firstName
		assertEquals("John", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_jfAJ0_WlON0() {
		Person person = new Person();
		person.setLastName("Smith");
		assertEquals("Smith", person.getLastName());
	}

}