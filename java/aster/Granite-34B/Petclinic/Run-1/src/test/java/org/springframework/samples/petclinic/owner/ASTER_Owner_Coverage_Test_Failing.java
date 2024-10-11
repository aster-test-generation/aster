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
	public void testAddVisitWithNullPetId_cVqG0() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		owner.addVisit(null, visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithInvalidPetId_yrBJ1() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		owner.addVisit(123, visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithValidPetId_qMiP2() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		owner.addVisit(456, visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest1_Vzsm0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("dog", false);
		assertNotNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_whenPetIsNew_thenReturnsNull_fmry0() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.isNew();
		when(owner.getPet(anyInt())).thenReturn(pet);
		Pet result = owner.getPet(1);
		verify(owner, times(1)).getPet(anyInt());
		verifyNoMoreInteractions(owner);
		assertEquals(null, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_whenPetIdDoesntMatch_thenReturnsNull_JYGY2() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.getId();
		when(owner.getPet(anyInt())).thenReturn(pet);
		Pet result = owner.getPet(1);
		verify(owner, times(1)).getPet(anyInt());
		verifyNoMoreInteractions(owner);
		assertEquals(null, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_whenPetListIsNotEmpty_thenReturnsPet_jkox4() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		pet.isNew();
		when(owner.getPet(anyInt())).thenReturn(pet);
		Pet result = owner.getPet(1);
		verify(owner, times(1)).getPet(anyInt());
		verifyNoMoreInteractions(owner);
		assertEquals(pet, result);
	}

}