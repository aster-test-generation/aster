/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest2_hEoj1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("cat", true);
		assertNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_whenPetIdMatches_thenReturnsPet_tedf1() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.getId();
		when(owner.getPet(anyInt())).thenReturn(pet);
		Pet result = owner.getPet(1);
		verify(owner, times(1)).getPet(anyInt());
		verifyNoMoreInteractions(owner);
		assertEquals(pet, result);
	}

}