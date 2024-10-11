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

public class Aster_Owner_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_hWcn0_1() {
		Owner owner = new Owner();
		String address = owner.getAddress();
		assertNotNull(address);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_hWcn0() {
		Owner owner = new Owner();
		String address = owner.getAddress();
		assertNotNull(address);
		assertEquals("123 Main St", address);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidId_sCOn0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(1);
		assertNotNull(pet);
		assertEquals(1, pet.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NewPet_EXlL2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		Pet retrievedPet = owner.getPet(pet.getId());
		assertNotNull(retrievedPet);
		assertEquals(pet.getId(), retrievedPet.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetCity_notSupported_ODxC1() {
		Owner owner = new Owner();
		owner.setCity("Not a supported city");
		assertEquals(null, owner.getCity());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetTelephone_GiFb0() {
		Owner owner = new Owner();
		String expectedTelephone = "1234567890";
		String actualTelephone = owner.getTelephone();
		assertEquals(expectedTelephone, actualTelephone);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidName_ReturnsPet_PUlU0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", false);
		assertNotNull(pet);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_IgnoreNew_ReturnsPet_vLEk2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", true);
		assertNotNull(pet);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_ReturnsNull_Qirr4() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, false);
		assertNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_ReturnsPet_xude5() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, true);
		assertNotNull(pet);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_ExistingPet_CijS1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		assertFalse(owner.getPets().contains(pet));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_EmptyList_EteR2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		assertTrue(owner.getPets().isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidName_ReturnsPetWithCorrectName_olDj8() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", false);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidName_ReturnsPetWithCorrectId_ygUT9() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", false);
		assertEquals(1, pet.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_dQPX0() {
		Owner owner = new Owner();
		String expected = "Owner[id=null, new=false, lastName=null, firstName=null, address=null, city=null, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithId_qMoW1() {
		Owner owner = new Owner();
		owner.setId(1);
		String expected = "Owner[id=1, new=false, lastName=null, firstName=null, address=null, city=null, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithLastName_VqpT3() {
		Owner owner = new Owner();
		owner.setLastName("Smith");
		String expected = "Owner[id=null, new=false, lastName=Smith, firstName=null, address=null, city=null, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithFirstName_Oekm4() {
		Owner owner = new Owner();
		owner.setFirstName("John");
		String expected = "Owner[id=null, new=false, lastName=null, firstName=John, address=null, city=null, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithAddress_BSkh5() {
		Owner owner = new Owner();
		owner.setAddress("123 Main St");
		String expected = "Owner[id=null, new=false, lastName=null, firstName=null, address=123 Main St, city=null, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithCity_KYeO6() {
		Owner owner = new Owner();
		owner.setCity("New York");
		String expected = "Owner[id=null, new=false, lastName=null, firstName=null, address=null, city=New York, telephone=null]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithTelephone_MiFO7() {
		Owner owner = new Owner();
		owner.setTelephone("555-555-5555");
		String expected = "Owner[id=null, new=false, lastName=null, firstName=null, address=null, city=null, telephone=555-555-5555]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCity_pEUj0() {
		Owner owner = new Owner();
		String city = owner.getCity();
		assertEquals("New York", city);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCityWithInvalidString_DqKt4() {
		Owner owner = new Owner();
		owner.setCity("Invalid City");
		String city = owner.getCity();
		assertNotEquals("Invalid City", city);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetAddress_hWcn0_2_fid3() {
		Owner owner = new Owner();
		String address = owner.getAddress();
		assertEquals("123 Main St", address);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidId_sCOn0_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(1);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidId_sCOn0_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(1);
		assertEquals(1, pet.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NewPet_EXlL2_1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		Pet retrievedPet = owner.getPet(pet.getId());
		assertNotNull(retrievedPet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NewPet_EXlL2_2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		Pet retrievedPet = owner.getPet(pet.getId());
		assertEquals(pet.getId(), retrievedPet.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_ValidName_ReturnsPet_PUlU0_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", false);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_IgnoreNew_ReturnsPet_vLEk2_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", true);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_IgnoreNew_ReturnsPet_vLEk2_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("Fido", true);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_ReturnsPet_xude5_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, true);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_ReturnsPet_xude5_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, true);
		assertEquals("Fido", pet.getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCityWithEmptyStringParameter_ZqpW6_RTWB0() {
		Owner owner = new Owner();
		String city = owner.getCity();
		assertEquals("", city);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithAllFields_VbgY8_OcQk0() {
		Owner owner = new Owner();
		owner.setId(1);
		owner.setLastName("Smith");
		owner.setFirstName("John");
		owner.setAddress("123 Main St");
		owner.setCity("New York");
		owner.setTelephone("555-555-5555");
		String expected = "Owner[id=1, lastName=Smith, firstName=John, address=123 Main St, city=New York, telephone=555-555-5555]";
		String actual = owner.toString();
		assertEquals(expected, actual);
	}

}