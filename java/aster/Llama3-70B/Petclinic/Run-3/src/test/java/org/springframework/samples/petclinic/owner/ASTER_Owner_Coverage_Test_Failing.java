/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Owner_Coverage_Test_Failing {

	private String firstName;

	private String lastName;

	private String city;

	private String telephone;

	private String address;

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddVisitValidPetId_iNwH2() {
		Owner owner = new Owner();
		Visit visit = new Visit();
		Pet pet = new Pet();
		owner.addVisit(1, visit);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testAddPet_NewPet_True_roIA0() {
		Owner owner = new Owner();
		Pet pet = mock(Pet.class);
		when(pet.isNew()).thenReturn(true);
		owner.addPet(pet);
		verify(pet, times(1)).isNew();
		verify(owner, times(1)).getPets();
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_Id_Ugbi0() {
		Owner owner = new Owner();
		owner.setId(1);
		assertEquals("Owner{id=1, new=false, lastName=null, firstName=null, address=null, city=null, telephone=null}",
				owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_LastName_tUci2() {
		Owner owner = new Owner();
		owner.setLastName("Doe");
		assertEquals("Owner{id=null, new=false, lastName=Doe, firstName=null, address=null, city=null, telephone=null}",
				owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_FirstName_SgrE3() {
		Owner owner = new Owner();
		owner.setFirstName("John");
		assertEquals(
				"Owner{id=null, new=false, lastName=null, firstName=John, address=null, city=null, telephone=null}",
				owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_Address_XHJt4() {
		Owner owner = new Owner();
		owner.setAddress("123 Street");
		assertEquals(
				"Owner{id=null, new=false, lastName=null, firstName=null, address=123 Street, city=null, telephone=null}",
				owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_City_JxUv5() {
		Owner owner = new Owner();
		owner.setCity("New York");
		assertEquals(
				"Owner{id=null, new=false, lastName=null, firstName=null, address=null, city=New York, telephone=null}",
				owner.toString());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_Telephone_WVku6() {
		Owner owner = new Owner();
		owner.setTelephone("1234567890");
		assertEquals(
				"Owner{id=null, new=false, lastName=null, firstName=null, address=null, city=null, telephone=1234567890}",
				owner.toString());
	}

}