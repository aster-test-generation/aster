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

public class Aster_PetController_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWhenOwnerIdIsNull_uZLL3_dUiq0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		PetController petController = new PetController(owners);
		Owner result = petController.findOwner(0);
		verify(owners, times(1)).findById(0);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPetPetNotFound_VliZ3_uTHr0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		ownerRepository.save(owner);
		PetController petController = new PetController(ownerRepository);
		Pet pet = petController.findPet(1, 1);
		assertNull(pet);
	}

}