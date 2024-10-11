/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetPet_NullName_mqUd0() {
		Owner owner = new Owner();
		Pet pet = owner.getPet(null, false);
		Assertions.assertNull(pet);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullPetId_JdkE0() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		try {
			owner.addVisit(null, visit);
			Assertions.fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			Assertions.assertEquals("Pet identifier must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullVisit_nyup1() {
		Owner owner = new Owner();
		try {
			owner.addVisit(1, null);
			Assertions.fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			Assertions.assertEquals("Visit must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_ValidPetId_BuvY3() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		Visit visit = new Visit();
		owner.addPet(pet);
		owner.addVisit(pet.getId(), visit);
		Assertions.assertEquals(1, pet.getVisits().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullPet_LlvY4() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		try {
			owner.addVisit(null, visit);
			Assertions.fail("Expected NullPointerException");
		}
		catch (NullPointerException e) {
			Assertions.assertEquals("Pet must not be null!", e.getMessage());
		}
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisit_NullVisitDate_Mebp5() {
		Owner owner = new Owner();
		Pet pet = new Pet();
		Visit visit = new Visit();
		visit.setDate(null);
		try {
			owner.addVisit(pet.getId(), visit);
			Assertions.fail("Expected IllegalArgumentException");
		}
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("Visit date must not be null!", e.getMessage());
		}
	}

}