/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VisitController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_ROQT1_VEDc0() {
		OwnerRepository owners = mock(OwnerRepository.class);
		VisitController visitController = new VisitController(owners);
		Map<String, Object> model = new HashMap<>();
		int ownerId = 1;
		int petId = 1;
		Visit visit = visitController.loadPetWithVisit(ownerId, petId, model);
		Assertions.assertNotNull(visit);
	}

}