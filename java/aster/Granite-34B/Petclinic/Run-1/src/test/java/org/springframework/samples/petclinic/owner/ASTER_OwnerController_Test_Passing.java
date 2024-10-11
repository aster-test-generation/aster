/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Test_Passing {

	@Autowired
	private OwnerRepository clinicService;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitFindFormWithNullOwnerRepository_WUfm2() {
		OwnerRepository clinicService = null;
		OwnerController ownerController = new OwnerController(clinicService);
		String actual = ownerController.initFindForm();
		assertEquals("owners/findOwners", actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitFindFormWithMockOwnerRepository_PNoq4() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		String actual = ownerController.initFindForm();
		assertEquals("owners/findOwners", actual);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void findOwnerWithValidInput_ReturnOwner_tQhp0() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(anyInt())).thenReturn(owner);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Owner result = ownerController.findOwner(1);
		assertEquals(owner, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void findOwnerWithInvalidInput_ReturnDefaultOwner_MqaT1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Owner result = ownerController.findOwner(null);
		Owner defaultOwner = new Owner();
		assertEquals(defaultOwner, result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationForm_upPW0_NBSm0_1() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		Map<String, Object> model = new HashMap<>();
		String result = ownerController.initCreationForm(model);
		assertEquals("owners/createOrUpdateOwnerForm", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationForm_upPW0_NBSm0_2() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		Map<String, Object> model = new HashMap<>();
		String result = ownerController.initCreationForm(model);
		assertEquals(1, model.size());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitCreationForm_upPW0_NBSm0_3() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		Map<String, Object> model = new HashMap<>();
		String result = ownerController.initCreationForm(model);
		assertEquals(new Owner(), model.get("owner"));
	}

}