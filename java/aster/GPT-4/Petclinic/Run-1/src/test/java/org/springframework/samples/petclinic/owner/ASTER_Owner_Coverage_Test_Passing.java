/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithNameMatchingAndIgnoringNew_bgZD0() {
		Owner owner = new Owner();
		Pet mockPet = mock(Pet.class);
		when(mockPet.getName()).thenReturn("Buddy");
		when(mockPet.isNew()).thenReturn(true);
		Owner spyOwner = spy(owner);
		doReturn(Arrays.asList(mockPet)).when(spyOwner).getPets();
		Pet result = spyOwner.getPet("buddy", true);
		assertNull(result, "Pet should not be returned because it is new and ignoreNew is true");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithNameMatchingAndNotIgnoringNew_oIav1_1() {
		Owner owner = new Owner();
		Pet mockPet = mock(Pet.class);
		when(mockPet.getName()).thenReturn("Buddy");
		when(mockPet.isNew()).thenReturn(false);
		Owner spyOwner = spy(owner);
		doReturn(Arrays.asList(mockPet)).when(spyOwner).getPets();
		Pet result = spyOwner.getPet("buddy", false);
		assertNotNull(result, "Pet should be returned because ignoreNew is false");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithNameMatchingAndNotIgnoringNew_oIav1_2() {
		Owner owner = new Owner();
		Pet mockPet = mock(Pet.class);
		when(mockPet.getName()).thenReturn("Buddy");
		when(mockPet.isNew()).thenReturn(false);
		Owner spyOwner = spy(owner);
		doReturn(Arrays.asList(mockPet)).when(spyOwner).getPets();
		Pet result = spyOwner.getPet("buddy", false);
		assertEquals(mockPet, result, "Returned pet should match the expected mock pet");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithNullPetId_ZVRz0() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		try {
			owner.addVisit(null, visit);
		}
		catch (IllegalArgumentException e) {
			assertEquals("Pet identifier must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitWithNullVisit_XKmJ1() {
		Owner owner = new Owner();
		Integer petId = 1;
		try {
			owner.addVisit(petId, null);
		}
		catch (IllegalArgumentException e) {
			assertEquals("Visit must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithEmptyPetList_YjvV0() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		when(spyOwner.getPets()).thenReturn(Collections.emptyList());
		Pet result = spyOwner.getPet(1);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithNewPetOnly_ZQNs1() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet newPet = mock(Pet.class);
		when(newPet.isNew()).thenReturn(true);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(newPet));
		Pet result = spyOwner.getPet(1);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithNonMatchingId_izbz2() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet existingPet = mock(Pet.class);
		when(existingPet.isNew()).thenReturn(false);
		when(existingPet.getId()).thenReturn(2);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(existingPet));
		Pet result = spyOwner.getPet(1);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithMatchingId_tMny3_1() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet matchingPet = mock(Pet.class);
		when(matchingPet.isNew()).thenReturn(false);
		when(matchingPet.getId()).thenReturn(1);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(matchingPet));
		Pet result = spyOwner.getPet(1);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithMatchingId_tMny3_2() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet matchingPet = mock(Pet.class);
		when(matchingPet.isNew()).thenReturn(false);
		when(matchingPet.getId()).thenReturn(1);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(matchingPet));
		Pet result = spyOwner.getPet(1);
		assertEquals(matchingPet, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithMultiplePetsNoneMatching_LCSa4() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet pet1 = mock(Pet.class);
		Pet pet2 = mock(Pet.class);
		when(pet1.isNew()).thenReturn(false);
		when(pet1.getId()).thenReturn(2);
		when(pet2.isNew()).thenReturn(false);
		when(pet2.getId()).thenReturn(3);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(pet1, pet2));
		Pet result = spyOwner.getPet(1);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithMultiplePetsOneMatching_UxoC5_1() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet pet1 = mock(Pet.class);
		Pet pet2 = mock(Pet.class);
		when(pet1.isNew()).thenReturn(false);
		when(pet1.getId()).thenReturn(1);
		when(pet2.isNew()).thenReturn(false);
		when(pet2.getId()).thenReturn(3);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(pet1, pet2));
		Pet result = spyOwner.getPet(1);
		assertNotNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_WithMultiplePetsOneMatching_UxoC5_2() {
		Owner owner = new Owner();
		Owner spyOwner = spy(owner);
		Pet pet1 = mock(Pet.class);
		Pet pet2 = mock(Pet.class);
		when(pet1.isNew()).thenReturn(false);
		when(pet1.getId()).thenReturn(1);
		when(pet2.isNew()).thenReturn(false);
		when(pet2.getId()).thenReturn(3);
		when(spyOwner.getPets()).thenReturn(Arrays.asList(pet1, pet2));
		Pet result = spyOwner.getPet(1);
		assertEquals(pet1, result);
	}

}