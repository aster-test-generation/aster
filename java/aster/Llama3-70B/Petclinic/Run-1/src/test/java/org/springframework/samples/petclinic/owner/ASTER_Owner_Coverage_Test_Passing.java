/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	private String address;

	private String city;

	private String telephone;

	private String lastName;

	private String firstName;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NewPet_True_BUgF0() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(true);
		owner.addPet(pet);
		verify(pet, times(1)).isNew();
		verify(owner, times(1)).getPets();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NotNewPet_False_cOJK1() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(false);
		owner.addPet(pet);
		verify(pet, times(1)).isNew();
		verify(owner, times(0)).getPets();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_PetsListIsNull_ReturnNull_UehY0() {
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