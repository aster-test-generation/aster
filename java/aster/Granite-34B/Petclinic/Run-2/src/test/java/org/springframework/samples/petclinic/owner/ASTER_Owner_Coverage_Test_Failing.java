/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPetWithNullPet_GKoK2() {
		Owner owner = new Owner();
		owner.addPet(null);
		assertTrue(owner.getPets().isEmpty());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest1_uwIF0_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("cat", true);
		assertEquals(pet.getName(), "cat");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest1_uwIF0_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("cat", true);
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest2_kEDF1_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("dog", false);
		assertEquals(pet.getName(), "dog");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest2_kEDF1_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("dog", false);
		assertEquals(pet.isNew(), true);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest3_Owrq2_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("bird", true);
		assertEquals(pet.getName(), "bird");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest3_Owrq2_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("bird", true);
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest4_lMVY3_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("fish", false);
		assertEquals(pet.getName(), "fish");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest4_lMVY3_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("fish", false);
		assertEquals(pet.isNew(), true);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest5_FzAC4_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(" rabbit", true);
		assertEquals(pet.getName(), "rabbit");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest5_FzAC4_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(" rabbit", true);
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest6_Qarh5_1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("snake", false);
		assertEquals(pet.getName(), "snake");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest6_Qarh5_2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("snake", false);
		assertEquals(pet.isNew(), true);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_existingPet_returnsPet_lKjf0() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(false);
		when(pet.getId()).thenReturn(1);
		when(owner.getPets()).thenReturn(List.of(pet));
		Pet result = owner.getPet(1);
		assertEquals(pet, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_noPets_returnsNull_vDlr3() {
		Owner owner = new Owner();
		when(owner.getPets()).thenReturn(List.of());
		Pet result = owner.getPet(1);
		assertNull(result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_multiplePets_returnsCorrectPet_GRUf4() {
		Owner owner = new Owner();
		Pet pet1 = mock(Pet.class);
		when(pet1.isNew()).thenReturn(false);
		when(pet1.getId()).thenReturn(1);
		Pet pet2 = mock(Pet.class);
		when(pet2.isNew()).thenReturn(false);
		when(pet2.getId()).thenReturn(2);
		when(owner.getPets()).thenReturn(List.of(pet1, pet2));
		Pet result = owner.getPet(2);
		assertEquals(pet2, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPet_multiplePets_returnsCorrectPet2_ZYrr5() {
		Owner owner = new Owner();
		Pet pet1 = mock(Pet.class);
		when(pet1.isNew()).thenReturn(false);
		when(pet1.getId()).thenReturn(1);
		Pet pet2 = mock(Pet.class);
		when(pet2.isNew()).thenReturn(false);
		when(pet2.getId()).thenReturn(2);
		when(owner.getPets()).thenReturn(List.of(pet1, pet2));
		Pet result = owner.getPet(1);
		assertEquals(pet1, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest1_uwIF0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("cat", true);
		assertEquals(pet.getName(), "cat");
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest2_kEDF1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("dog", false);
		assertEquals(pet.getName(), "dog");
		assertEquals(pet.isNew(), true);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest3_Owrq2() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("bird", true);
		assertEquals(pet.getName(), "bird");
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest4_lMVY3() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("fish", false);
		assertEquals(pet.getName(), "fish");
		assertEquals(pet.isNew(), true);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest5_FzAC4() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(" rabbit", true);
		assertEquals(pet.getName(), "rabbit");
		assertEquals(pet.isNew(), false);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getPetTest6_Qarh5() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("snake", false);
		assertEquals(pet.getName(), "snake");
		assertEquals(pet.isNew(), true);
	}

}