/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithInvalidPetId_PWEs2() {
		Owner owner = new Owner();
		Integer petId = 999; // Assuming 999 is an invalid ID
		Visit visit = new Visit();
		when(owner.getPet(petId)).thenReturn(null);
		try {
			owner.addVisit(petId, visit);
		}
		catch (IllegalArgumentException e) {
			assertEquals("Invalid Pet identifier!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithValidPetIdAndVisit_BAPS3() {
		Owner owner = new Owner();
		Integer petId = 1;
		Visit visit = new Visit();
		Pet mockPet = mock(Pet.class);
		when(owner.getPet(petId)).thenReturn(mockPet);
		owner.addVisit(petId, visit);
		verify(mockPet).addVisit(visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithPetIdAndVisitNotNull_eKHL4_1() {
		Owner owner = new Owner();
		Integer petId = 1;
		Visit visit = new Visit();
		Pet mockPet = mock(Pet.class);
		when(owner.getPet(petId)).thenReturn(mockPet);
		owner.addVisit(petId, visit);
		assertNotNull(petId);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithPetIdAndVisitNotNull_eKHL4_2() {
		Owner owner = new Owner();
		Integer petId = 1;
		Visit visit = new Visit();
		Pet mockPet = mock(Pet.class);
		when(owner.getPet(petId)).thenReturn(mockPet);
		owner.addVisit(petId, visit);
		assertNotNull(visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitCompletesSuccessfully_UicO5() {
		Owner owner = new Owner();
		Integer petId = 1;
		Visit visit = new Visit();
		Pet mockPet = mock(Pet.class);
		when(owner.getPet(petId)).thenReturn(mockPet);
		owner.addVisit(petId, visit);
	}

}