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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEmptyName_bYph1() {
		Owner owner = new Owner();
		Pet pet = owner.getPet("", false);
		assertNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getPet_emptyPetList_returnsNull_UilN2() {
		Owner owner = new Owner();
		Pet returnedPet = owner.getPet(1);
		assertEquals(null, returnedPet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getPet_negativePetId_returnsNull_QEKw5() {
		Owner owner = new Owner();
		Pet returnedPet = owner.getPet(-1);
		assertEquals(null, returnedPet);
	}

}