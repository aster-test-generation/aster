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
	public void testGetCity_fQsu0() {
		Owner owner = new Owner();
		String expectedCity = null; // Assuming default city is null if not set
		String actualCity = owner.getCity();
		assertEquals(expectedCity, actualCity);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTelephone_dqIY0() {
		Owner owner = new Owner();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NonExistingPet_uRdM2() {
		Owner owner = new Owner();
		Pet result = owner.getPet("Charlie", false);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_nVue5() {
		Owner owner = new Owner();
		Pet result = owner.getPet("", false);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetCity_kBCa0_JYPB0() {
		Owner owner = new Owner();
		owner.setCity("New York");
		assertEquals("New York", owner.getCity());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_GqdX0_GSOm0() {
		Owner owner = new Owner();
		owner.setId(1);
		owner.setLastName("Smith");
		owner.setFirstName("John");
		owner.setAddress("1234 Elm Street");
		owner.setCity("Springfield");
		owner.setTelephone("1234567890");
		String expected = "Owner[id=1,lastName=Smith,firstName=John,address=1234 Elm Street,city=Springfield,telephone=1234567890]";
		String actual = owner.toString();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetTelephone_xFhz0_JwTl0() {
		Owner owner = new Owner();
		String testTelephone = "123-456-7890";
		owner.setTelephone(testTelephone);
		assertEquals("123-456-7890", owner.getTelephone());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetReturnsNullForUnknownPet_KYsD0_uZZM0() {
		Owner owner = new Owner();
		assertNull(owner.getPet("Unknown"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPetIgnoreCaseSensitive_ovmT0_GacX0_1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Buddy");
		owner.getPets().add(pet);
		Pet result = owner.getPet("buddy", false);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPetIgnoreCaseSensitive_ovmT0_GacX0_2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Buddy");
		owner.getPets().add(pet);
		Pet result = owner.getPet("buddy", false);
		assertEquals("Buddy", result.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ExistingPetCaseSensitiveNotFound_lgfB1_phSp0() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("Buddy");
		owner.getPets().add(pet);
		Pet result = owner.getPet("BUDDY", true);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_vVll0_Fmga0() {
		Owner owner = new Owner();
		owner.setAddress("123 Main St");
		assertEquals("123 Main St", owner.getAddress());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPetWithInvalidIdReturnsNull_HbJw1_WbfH0() {
		Owner owner = new Owner();
		Pet pet1 = new Pet();
		pet1.setId(1);
		owner.addPet(pet1);
		Pet result = owner.getPet(2);
		assertNull(result);
	}

}