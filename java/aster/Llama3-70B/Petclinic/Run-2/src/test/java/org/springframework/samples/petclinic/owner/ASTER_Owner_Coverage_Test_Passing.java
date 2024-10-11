/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	private String address;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NewPet_True_ZwEF0() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(true);
		Collection<Pet> pets = new ArrayList<>();
		owner.getPets().addAll(pets);
		owner.addPet(pet);
		assertTrue(owner.getPets().contains(pet));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NotNewPet_False_AVAi1() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(false);
		Collection<Pet> pets = new ArrayList<>();
		owner.getPets().addAll(pets);
		owner.addPet(pet);
		assertFalse(owner.getPets().contains(pet));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_PetsListIsNull_ReturnNull_JVXB0() {
		Owner owner = new Owner();
		assertNull(owner.getPet("test", true));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void setAddress(String address) {
		this.address = address;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void addVisit(int i, Object obj) {
	}

}