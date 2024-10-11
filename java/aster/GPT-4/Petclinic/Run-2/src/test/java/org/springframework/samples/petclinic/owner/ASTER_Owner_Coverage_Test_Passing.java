/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testAddVisitWithNullPetId_rWkg0() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		assertThrows(IllegalArgumentException.class, () -> owner.addVisit(null, visit));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testAddVisitWithNullVisit_DQmk1() {
		Owner owner = new Owner();
		Integer petId = 1;
		assertThrows(IllegalArgumentException.class, () -> owner.addVisit(petId, null));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testAddVisitWithValidPetIdAndVisit_XqHP2() {
		Owner owner = new Owner();
		Integer petId = 1;
		Visit visit = new Visit();
		Pet pet = mock(Pet.class);
		when(owner.getPet(petId)).thenReturn(pet);
		owner.addVisit(petId, visit);
		verify(pet).addVisit(visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testAddVisitWithInvalidPetId_IoZV3() {
		Owner owner = new Owner();
		Integer petId = 999; // Assuming 999 is an invalid ID
		Visit visit = new Visit();
		when(owner.getPet(petId)).thenReturn(null);
		assertThrows(IllegalArgumentException.class, () -> owner.addVisit(petId, visit));
	}

}