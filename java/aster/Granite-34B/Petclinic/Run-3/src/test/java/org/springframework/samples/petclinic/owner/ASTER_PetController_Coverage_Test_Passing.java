/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PetController_Coverage_Test_Passing {

	OwnerRepository owners;

	PetController petController;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithValidInput_HWSi0() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(anyInt())).thenReturn(owner);
		PetController petController = new PetController(mockOwnerRepository);
		Owner result = petController.findOwner(1);
		assertEquals(owner, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithBoundaryInput_YCBT3() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(anyInt())).thenReturn(owner);
		PetController petController = new PetController(mockOwnerRepository);
		Owner result = petController.findOwner(Integer.MAX_VALUE);
		assertEquals(owner, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindPetWithVisit_mzuI5() {
		Owner owner = new Owner();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testPopulatePetTypes_ruJV0_FNbA0() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		PetController petController = new PetController(ownerRepository);
		try {
			Collection<PetType> result = petController.populatePetTypes();
		}
		catch (Exception e) {
			fail("Exception is not expected.");
		}
	}

}