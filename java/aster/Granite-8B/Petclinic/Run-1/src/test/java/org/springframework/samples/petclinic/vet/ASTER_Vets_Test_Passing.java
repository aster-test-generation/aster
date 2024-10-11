/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Vets_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getVetList_emptyList_xKFx0() {
		Vets vets = new Vets();
		List<Vet> actualVetList = vets.getVetList();
		List<Vet> expectedVetList = new ArrayList<>();
		assertEquals(expectedVetList, actualVetList);
	}

}