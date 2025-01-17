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

public class Aster_PetController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwner_foundOwner_Jllr1_bMly0() {
		Owner owner = new Owner();
		OwnerRepository ownerRepositoryMock = mock(OwnerRepository.class);
		when(ownerRepositoryMock.findById(1)).thenReturn(owner);
		PetController petController = new PetController(ownerRepositoryMock);
		petController.initOwnerBinder(null);
		verify(ownerRepositoryMock, times(1)).findById(1);
	}

}