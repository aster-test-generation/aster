/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTelephone_Dvpn0() {
		Owner owner = new Owner();
		String telephone = owner.getTelephone();
		assertNull(telephone);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetAddress_ENau0() {
		Owner owner = new Owner();
		owner.setAddress("123 Main St");
		assertEquals("123 Main St", owner.getAddress());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCity_jpEx0() {
		Owner owner = new Owner();
		String city = owner.getCity();
		assertNull(city);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetCity_yzgC0() {
		Owner owner = new Owner();
		owner.setCity("New York");
		assertEquals("New York", owner.getCity());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetTelephone_gZOg0() {
		Owner owner = new Owner();
		owner.setTelephone("1234567890");
		assertEquals("1234567890", owner.getTelephone());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_omch0() {
		Owner owner = new Owner();
		String address = owner.getAddress();
		assertNull(address);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPets_ZBsO0() {
		Owner owner = new Owner();
		List<Pet> pets = owner.getPets();
		assertNotNull(pets);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPet_LkdC0() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setId(1);
		owner.getPets().add(pet);
		Pet result = owner.getPet(1);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NonExistingPet_zpVQ1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setId(1);
		owner.getPets().add(pet);
		Pet result = owner.getPet(2);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NonExistingPet_IgnoreNewTrue_rHWx2() {
		Owner owner = new Owner();
		Pet result = owner.getPet("NonExistingPet", true);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NonExistingPet_IgnoreNewFalse_bUnH3() {
		Owner owner = new Owner();
		Pet result = owner.getPet("NonExistingPet", false);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_IgnoreNewTrue_npaN4() {
		Owner owner = new Owner();
		try {
			owner.getPet(null, true);
			fail("Expected NullPointerException to be thrown");
		}
		catch (NullPointerException e) {
			// Test passed
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_IgnoreNewFalse_kPXV5() {
		Owner owner = new Owner();
		try {
			owner.getPet(null, false);
			fail("Expected NullPointerException to be thrown");
		}
		catch (NullPointerException e) {
			// pass
		}
	}

}