/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCity_Oexp0() {
		Owner owner = new Owner();
		assertEquals("Expected city name", owner.getCity());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetByName_yqCB0() {
		Owner owner = new Owner();
		Pet expectedPet = owner.getPet("Buddy");
		assertEquals(expectedPet, owner.getPet("Buddy"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetReturnsCorrectPet_NOBk0() {
		Owner owner = new Owner();
		Pet pet1 = new Pet();
		pet1.setId(1);
		owner.addPet(pet1);
		Pet result = owner.getPet(1);
		assertEquals(pet1, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetReturnsNullForNonExistentId_XeBT1() {
		Owner owner = new Owner();
		Pet pet1 = new Pet();
		pet1.setId(1);
		owner.addPet(pet1);
		Pet result = owner.getPet(2);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetWithMultiplePets_MTPv3() {
		Owner owner = new Owner();
		Pet pet1 = new Pet();
		pet1.setId(1);
		Pet pet2 = new Pet();
		pet2.setId(2);
		owner.addPet(pet1);
		owner.addPet(pet2);
		Pet result = owner.getPet(2);
		assertEquals(pet2, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetCity_rzEe0_qWUu0() {
		Owner owner = new Owner();
		owner.setCity("New York");
		assertEquals("New York", owner.getCity());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_jcUi0_QWMO0() {
		Owner owner = new Owner();
		owner.setId(1);
		owner.setLastName("Smith");
		owner.setFirstName("John");
		owner.setAddress("1234 Elm Street");
		owner.setCity("Springfield");
		owner.setTelephone("1234567890");
		String expected = "Owner[id=1,lastName=Smith,firstName=John,address=1234 Elm Street,city=Springfield,telephone=1234567890]";
		assertEquals(expected, owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTelephone_cbCj0_ZsrK0() {
		Owner owner = new Owner();
		owner.setTelephone("123-456-7890");
		assertEquals("123-456-7890", owner.getTelephone());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetTelephone_pAOr0_GWFD0() {
		Owner owner = new Owner();
		String testTelephone = "123-456-7890";
		owner.setTelephone(testTelephone);
		assertEquals("123-456-7890", owner.getTelephone());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPetIgnoreCase_HFEH0_zwsm0_1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Buddy");
		owner.addPet(pet);
		Pet result = owner.getPet("buddy", false);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPetIgnoreCase_HFEH0_zwsm0_2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Buddy");
		owner.addPet(pet);
		Pet result = owner.getPet("buddy", false);
		assertEquals("Buddy", result.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_qUFs0_mHmc0() {
		Owner owner = new Owner();
		owner.setAddress("123 Main St");
		assertEquals("123 Main St", owner.getAddress());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetAddress_qWDU0_kbiB0() {
		Owner owner = new Owner();
		String expectedAddress = "123 Main St";
		owner.setAddress(expectedAddress);
		assertEquals(expectedAddress, owner.getAddress());
	}

}