/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Pet_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVisits_nddh0() {
		Pet pet = new Pet();
		assertNotNull(pet.getVisits());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetBirthDate_Rblh0() {
		Pet pet = new Pet();
		LocalDate birthDate = LocalDate.of(2022, 1, 1);
		pet.setBirthDate(birthDate);
		assertEquals(birthDate, pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetType_OVha0() {
		Pet pet = new Pet();
		PetType type = pet.getType();
		assertNotNull(type);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBirthDate_hRRv0() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2022, 1, 1));
		assertEquals(LocalDate.of(2022, 1, 1), pet.getBirthDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetType_gGjK0() {
		Pet pet = new Pet();
		PetType type = new PetType();
		pet.setType(type);
		assertEquals(type, pet.getType());
	}

}