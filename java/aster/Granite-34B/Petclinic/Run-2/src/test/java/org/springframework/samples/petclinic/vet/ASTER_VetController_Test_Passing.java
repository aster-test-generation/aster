/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VetController_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowResourcesVetList_LikI0_dWOW0() {
		List<Vet> vetsList = new ArrayList<Vet>();
		VetRepository mockVetRepository = mock(VetRepository.class);
		when(mockVetRepository.findAll()).thenReturn(vetsList);
		VetController vetController = new VetController(mockVetRepository);
		Vets vets = vetController.showResourcesVetList();
		assertEquals(vets.getVetList().size(), mockVetRepository.findAll().size());
	}

}