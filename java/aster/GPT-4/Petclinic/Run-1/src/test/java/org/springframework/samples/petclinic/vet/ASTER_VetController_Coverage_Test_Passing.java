/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.vet;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VetController_Coverage_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testShowVetListDefaultPage_ztMY0() {
		VetRepository mockRepository = mock(VetRepository.class);
		VetController controller = new VetController(mockRepository);
		Model mockModel = mock(Model.class);
		Page<Vet> mockPage = mock(Page.class);
		when(mockRepository.findAll(any(Pageable.class))).thenReturn(mockPage);
		when(mockPage.toList()).thenReturn(new ArrayList<>());
		String viewName = controller.showVetList(1, mockModel);
		verify(mockRepository).findAll(PageRequest.of(0, 5));
		assertNotNull(viewName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testShowVetListSecondPage_aMBo1() {
		VetRepository mockRepository = mock(VetRepository.class);
		VetController controller = new VetController(mockRepository);
		Model mockModel = mock(Model.class);
		Page<Vet> mockPage = mock(Page.class);
		when(mockRepository.findAll(any(Pageable.class))).thenReturn(mockPage);
		when(mockPage.toList()).thenReturn(new ArrayList<>());
		String viewName = controller.showVetList(2, mockModel);
		verify(mockRepository).findAll(PageRequest.of(1, 5));
		assertNotNull(viewName);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testShowVetListWithPageSize_mVYe2() {
		VetRepository mockRepository = mock(VetRepository.class);
		VetController controller = new VetController(mockRepository);
		Model mockModel = mock(Model.class);
		Page<Vet> mockPage = mock(Page.class);
		when(mockRepository.findAll(any(Pageable.class))).thenReturn(mockPage);
		when(mockPage.toList()).thenReturn(new ArrayList<>());
		String viewName = controller.showVetList(3, mockModel);
		verify(mockRepository).findAll(PageRequest.of(2, 5));
		assertNotNull(viewName);
	}

}