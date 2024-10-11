/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Person_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_ValidInput_hrNX0() {
		Person person = new Person();
		person.setFirstName("John");
		assertEquals("John", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_EmptyString_Pyha1() {
		Person person = new Person();
		person.setFirstName("");
		assertEquals("", person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetFirstName_Null_mTdx2() {
		Person person = new Person();
		person.setFirstName(null);
		assertNull(person.getFirstName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetFirstNameNotEqual_pWJy1() {
		Person person = new Person();
		String expectedFirstName = "John";
		String actualFirstName = person.getFirstName();
		assertNotEquals(expectedFirstName, actualFirstName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_ValidName_oHvj0() {
		Person person = new Person();
		person.setLastName("Smith");
		assertEquals("Smith", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_NullName_JuVz1() {
		Person person = new Person();
		person.setLastName(null);
		assertNull(person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_EmptyName_fbCM2() {
		Person person = new Person();
		person.setLastName("");
		assertEquals("", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_LongName_klNH3() {
		Person person = new Person();
		person.setLastName(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		assertEquals(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
				person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_InvalidName_AZxT4() {
		Person person = new Person();
		person.setLastName("1234567890");
		assertEquals("1234567890", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_SpecialCharacters_LbIr5() {
		Person person = new Person();
		person.setLastName("!@#$%^&*()_+");
		assertEquals("!@#$%^&*()_+", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_MultipleNames_nfSF7() {
		Person person = new Person();
		person.setLastName("John Doe");
		assertEquals("John Doe", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_DifferentCasing_alge8() {
		Person person = new Person();
		person.setLastName("john doe");
		assertEquals("john doe", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_DifferentPunctuation_Jnui10() {
		Person person = new Person();
		person.setLastName("john, doe");
		assertEquals("john, doe", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_DifferentCaseAndAccents_eXTe12() {
		Person person = new Person();
		person.setLastName("john  DOE");
		assertEquals("john  DOE", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetLastName_DifferentCaseAndPunctuation_KyRq13() {
		Person person = new Person();
		person.setLastName("john, DOE");
		assertEquals("john, DOE", person.getLastName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastName_TWky0() {
		Person person = new Person();
		String lastName = person.getLastName();
		assertNull(lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithNull_ENlO1() {
		Person person = new Person();
		person.setLastName(null);
		String lastName = person.getLastName();
		assertNull(lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithEmptyString_dxhD2() {
		Person person = new Person();
		person.setLastName("");
		String lastName = person.getLastName();
		assertEquals("", lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithUppercase_afka4() {
		Person person = new Person();
		person.setLastName("SMITH");
		String lastName = person.getLastName();
		assertEquals("SMITH", lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithLowercase_CEkP5() {
		Person person = new Person();
		person.setLastName("smith");
		String lastName = person.getLastName();
		assertEquals("smith", lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithMixedCase_wbgF6() {
		Person person = new Person();
		person.setLastName("SmItH");
		String lastName = person.getLastName();
		assertEquals("SmItH", lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithSpecialCharacters_VxLx7() {
		Person person = new Person();
		person.setLastName("Smith-Johnson");
		String lastName = person.getLastName();
		assertEquals("Smith-Johnson", lastName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastNameWithMultipleNames_BrqT8() {
		Person person = new Person();
		person.setLastName("Smith Johnson");
		String lastName = person.getLastName();
		assertEquals("Smith Johnson", lastName);
	}

}