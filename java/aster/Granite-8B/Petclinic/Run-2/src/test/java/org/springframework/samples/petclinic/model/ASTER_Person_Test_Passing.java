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
	public void testGetLastName_yBzb0() {
		Person person = new Person();
		person.setLastName("Doe");
		assertEquals("Doe", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_qPnq0() {
		Person person = new Person();
		person.setFirstName("John");
		assertEquals("John", person.getFirstName());
	}

}