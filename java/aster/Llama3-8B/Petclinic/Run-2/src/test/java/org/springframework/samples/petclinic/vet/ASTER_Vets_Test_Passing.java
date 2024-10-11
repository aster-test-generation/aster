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

public class Aster_Vets_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetVetListWhenVetsIsNull_fxIW0() {
		Vets vetsObject = new Vets();
		List<Vet> vetList = vetsObject.getVetList();
		assert vetList != null;
	}

}