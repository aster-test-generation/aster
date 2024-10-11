/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vets_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_WhenVetsIsNull_ReturnsNewArrayList_lyMV0_1() {
		Vets vets = new Vets();
		List<Vet> vetList = vets.getVetList();
		assertNotNull(vetList);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_WhenVetsIsNull_ReturnsNewArrayList_lyMV0_2() {
		Vets vets = new Vets();
		List<Vet> vetList = vets.getVetList();
		assertEquals(0, vetList.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_WhenVetsIsNotNull_ReturnsSameArrayList_wywL1() {
		Vets vets = new Vets();
		List<Vet> vetList1 = vets.getVetList();
		List<Vet> vetList2 = vets.getVetList();
		assertSame(vetList1, vetList2);
	}

}