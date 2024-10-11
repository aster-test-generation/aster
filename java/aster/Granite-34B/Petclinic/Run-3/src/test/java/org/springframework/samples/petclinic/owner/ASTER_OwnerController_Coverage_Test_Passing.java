/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import org.springframework.web.servlet.ModelAndView;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OwnerController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_QZEr0() {
		OwnerController ownerController = new OwnerController(null);
		String result = ownerController.initFindForm();
		assertEquals("owners/findOwners", result);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFindOwnerWithNonNullParameter_gKPZ1() {
		OwnerRepository ownerRepository = mock(OwnerRepository.class);
		OwnerController ownerController = new OwnerController(ownerRepository);
		Owner owner = new Owner();
		when(ownerRepository.findById(anyInt())).thenReturn(owner);
		Owner returnedOwner = ownerController.findOwner(1);
		assertEquals(owner, returnedOwner);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowOwner1_zTzs0_1() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		ModelAndView mav = ownerController.showOwner(1);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals("owners/ownerDetails", mav.getViewName());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowOwner1_zTzs0_2() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		ModelAndView mav = ownerController.showOwner(1);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals(owner, mav.getModel().get("owner"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testShowOwner1_zTzs0() {
		OwnerRepository mockOwnerRepository = mock(OwnerRepository.class);
		Owner owner = new Owner();
		when(mockOwnerRepository.findById(1)).thenReturn(owner);
		OwnerController ownerController = new OwnerController(mockOwnerRepository);
		ModelAndView mav = ownerController.showOwner(1);
		verify(mockOwnerRepository, times(1)).findById(1);
		assertEquals("owners/ownerDetails", mav.getViewName());
		assertEquals(owner, mav.getModel().get("owner"));
	}

}