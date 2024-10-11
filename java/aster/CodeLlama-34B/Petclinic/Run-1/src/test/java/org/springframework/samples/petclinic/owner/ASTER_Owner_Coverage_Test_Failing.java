/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Failing {

	private Owner owner;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullPetId_kpLL0() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		try {
			owner.addVisit(null, visit);
			Assertions.fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			Assertions.assertEquals("Pet identifier must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullVisit_nZEv1() {
		Owner owner = new Owner();
		try {
			owner.addVisit(1, null);
			Assertions.fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			Assertions.assertEquals("Visit must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_vdYq0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, false);
		assertNull(pet);
	}

	@Test
	public void testSetAddress_HiRb1() {
		String address = "123 Main St";
		owner.setAddress(address);
		assertEquals(address, owner.getAddress());
	}

}