/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Person_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setLastNameTest_oXct0() {
		Person person = new Person();
		person.setLastName("Doe");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setLastNameNullTest_gcxm1() {
		Person person = new Person();
		person.setLastName(null);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setLastNameEmptyTest_IIVi2() {
		Person person = new Person();
		person.setLastName("");
	}

}