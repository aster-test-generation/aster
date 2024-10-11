/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	private String firstName;

	private String lastName;

	private String city;

	private String telephone;

	private String address;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NotNewPet_False_fmyA1() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(false);
		owner.addPet(pet);
		verify(pet, times(1)).isNew();
		verify(owner, times(0)).getPets();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void setAddress(String address) {
		this.address = address;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void addVisit(int id, String visit) {
	}

}