/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Person_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_Aium0() {
		Person person = new Person();
		person.setFirstName("John");
		Assertions.assertEquals("John", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstNameWithNull_tOIy1() {
		Person person = new Person();
		person.setFirstName(null);
		Assertions.assertNull(person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_wbOX0() {
		Person person = new Person();
		person.setLastName("Doe");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastNameWithNull_iyOk1() {
		Person person = new Person();
		person.setLastName(null);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastNameWithEmpty_bAWa2() {
		Person person = new Person();
		person.setLastName("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_1_CfHx0() {
		Person person = new Person();
		person.setLastName("Doe");
		assertEquals("Doe", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_2_cQUa1() {
		Person person = new Person();
		person.setLastName("Johnson");
		assertEquals("Johnson", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_3_PSUx2() {
		Person person = new Person();
		person.setLastName("Brown");
		assertEquals("Brown", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_4_fUUf3() {
		Person person = new Person();
		person.setLastName("Wilson");
		assertEquals("Wilson", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_5_gmxw4() {
		Person person = new Person();
		person.setLastName("Miller");
		assertEquals("Miller", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getLastName_6_hspb5() {
		Person person = new Person();
		person.setLastName("Davis");
		assertEquals("Davis", person.getLastName());
	}

}