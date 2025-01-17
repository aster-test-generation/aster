/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Test_Failing {

	private OwnerRepository ownerRepository;

	OwnerRepository clinicService;

	OwnerController controller;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInitUpdateOwnerForm_tIbV0() {
		Model model = mock(Model.class);
		int ownerId = 1;
		Owner owner = new Owner();
		when(clinicService.findById(ownerId)).thenReturn(owner);
		String result = controller.initUpdateOwnerForm(ownerId, model);
		assertEquals("forward:/owners/1/edit", result);
		verify(model).addAttribute(owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithInvalidInput_kfNJ1_AYXu0_2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Integer ownerId = null;
		Owner owner = ownerController.findOwner(ownerId);
		assertEquals(0, owner.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithValidInput_ueVF0_LokZ0_1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Integer ownerId = 1;
		Owner owner = ownerController.findOwner(ownerId);
		assertNotNull(owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithValidInput_ueVF0_LokZ0_2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Integer ownerId = 1;
		Owner owner = ownerController.findOwner(ownerId);
		assertEquals(ownerId, owner.getId());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void showOwnerWithNullOwner_PCQq1_zCbM0_2() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		int ownerId = 1;
		Owner owner = null;
		when(clinicService.findById(ownerId)).thenReturn(owner);
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(owner);
		assertEquals(mav, ownerController.showOwner(ownerId));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void showOwnerWithNoOwner_fNcw2_kNYd0_1() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		int ownerId = 1;
		Owner owner = clinicService.findById(ownerId);
		Owner owner1 = null;
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(owner);
		assertNotEquals(owner1, owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void showOwnerWithNoOwner_fNcw2_kNYd0_2() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		int ownerId = 1;
		Owner owner = clinicService.findById(ownerId);
		Owner owner1 = null;
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(owner);
		assertEquals(mav, ownerController.showOwner(ownerId));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void showOwnerWithOwnerNull_JyXY6_zFQW0_1() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		int ownerId = 1;
		Owner owner = null;
		Owner owner1 = clinicService.findById(ownerId);
		when(clinicService.findById(ownerId)).thenReturn(owner);
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(owner);
		assertNotEquals(owner1, owner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void showOwnerWithOwnerNull_JyXY6_zFQW0_2() {
		OwnerRepository clinicService = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(clinicService);
		int ownerId = 1;
		Owner owner = null;
		Owner owner1 = clinicService.findById(ownerId);
		when(clinicService.findById(ownerId)).thenReturn(owner);
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(owner);
		assertEquals(mav, ownerController.showOwner(ownerId));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithInvalidInput_kfNJ1_AYXu0_2_fid2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		Integer ownerId = null;
		Owner owner = ownerController.findOwner(ownerId);
		assertNull(0);
	}

}