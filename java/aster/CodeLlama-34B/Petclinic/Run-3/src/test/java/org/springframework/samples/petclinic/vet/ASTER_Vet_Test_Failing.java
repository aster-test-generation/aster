/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vet_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNrOfSpecialtiesWithNullVet_Pifb6() {
		Vet vet = null;
		int nrOfSpecialties = vet.getNrOfSpecialties();
		assertEquals(0, nrOfSpecialties);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_xDrT0() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(3, specialties.size());
		assertEquals("Cardiology", specialties.get(0).getName());
		assertEquals("Dermatology", specialties.get(1).getName());
		assertEquals("Ophthalmology", specialties.get(2).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesWithOneElement_aFVW2() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(1, specialties.size());
		assertEquals("Cardiology", specialties.get(0).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesWithTwoElements_oKjp3() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(2, specialties.size());
		assertEquals("Cardiology", specialties.get(0).getName());
		assertEquals("Dermatology", specialties.get(1).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddSpecialtyWithNullSpecialty_qDIm1() {
		Vet vet = new Vet();
		vet.addSpecialty(null);
		assertEquals(0, vet.getSpecialtiesInternal().size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetNrOfSpecialtiesWithNullVet_Pifb6_fid1() {
		Vet vet = null;
		int nrOfSpecialties = 0;
		assertEquals(nrOfSpecialties, vet.getNrOfSpecialties());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_xDrT0_2() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals("Cardiology", specialties.get(0).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_xDrT0_3() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals("Dermatology", specialties.get(1).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_xDrT0_4() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals("Ophthalmology", specialties.get(2).getName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialties_xDrT0_1_fid2() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(3, specialties.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetSpecialtiesWithTwoElements_oKjp3_1_fid2() {
		Vet vet = new Vet();
		List<Specialty> specialties = vet.getSpecialties();
		assertEquals(2, specialties.size());
	}

}