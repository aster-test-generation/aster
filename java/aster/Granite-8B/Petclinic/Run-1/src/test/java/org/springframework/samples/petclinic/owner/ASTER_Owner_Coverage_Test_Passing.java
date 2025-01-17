/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getPet_with_lowercase_name_bKsb0() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("dog");
		owner.addPet(pet);
		Pet resultPet = owner.getPet("dog", false);
		assertEquals(pet, resultPet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getPet_with_uppercase_name_fHzL1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.setName("dog");
		owner.addPet(pet);
		Pet resultPet = owner.getPet("Dog", false);
		assertEquals(pet, resultPet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPetWithNewPet_fWaU0() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		assertTrue(owner.getPets().contains(pet));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPetWithExistingPet_pYck1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		owner.addPet(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPetWithEmptyOwner_ZzIA4() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		owner.addPet(pet);
		assertEquals(1, owner.getPets().size());
	}

}