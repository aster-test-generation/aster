/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vets_Coverage_Test_Failing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_NullVets_wkGF0() {
		Vets vetsObject = new Vets();
		List<Vet> result = vetsObject.getVetList();
		assert result == null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsDifferentInstanceForDifferentObjectsAndSameMethod_GnaB8() {
		Vets vetsObject1 = new Vets();
		List<Vet> result1 = vetsObject1.getVetList();
		Vets vetsObject2 = new Vets();
		List<Vet> result2 = vetsObject1.getVetList();
		assert result1 != result2;
	}

}