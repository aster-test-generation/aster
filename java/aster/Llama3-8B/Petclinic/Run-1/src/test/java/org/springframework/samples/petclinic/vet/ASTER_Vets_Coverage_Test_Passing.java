/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vets_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_NonNullVets_QjEc1() {
		Vets vetsObject = new Vets();
		List<Vet> result = vetsObject.getVetList();
		assert result != null;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsVets_uLzn2() {
		Vets vetsObject = new Vets();
		List<Vet> result = vetsObject.getVetList();
		assert result instanceof ArrayList;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsSameInstance_JMzS3() {
		Vets vetsObject = new Vets();
		List<Vet> result1 = vetsObject.getVetList();
		List<Vet> result2 = vetsObject.getVetList();
		assert result1 == result2;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsDifferentInstance_Airy4() {
		Vets vetsObject = new Vets();
		List<Vet> result1 = vetsObject.getVetList();
		List<Vet> result2 = new Vets().getVetList();
		assert result1 != result2;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsSameInstanceForSameObject_AnfD5() {
		Vets vetsObject1 = new Vets();
		List<Vet> result1 = vetsObject1.getVetList();
		Vets vetsObject2 = vetsObject1;
		List<Vet> result2 = vetsObject2.getVetList();
		assert result1 == result2;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsDifferentInstanceForDifferentObjects_RDlO6() {
		Vets vetsObject1 = new Vets();
		List<Vet> result1 = vetsObject1.getVetList();
		Vets vetsObject2 = new Vets();
		List<Vet> result2 = vetsObject2.getVetList();
		assert result1 != result2;
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetList_ReturnsSameInstanceForSameObjectAndSameMethod_BWDk7() {
		Vets vetsObject1 = new Vets();
		List<Vet> result1 = vetsObject1.getVetList();
		List<Vet> result2 = vetsObject1.getVetList();
		assert result1 == result2;
	}

}