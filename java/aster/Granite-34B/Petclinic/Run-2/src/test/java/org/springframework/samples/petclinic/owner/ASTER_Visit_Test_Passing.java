/**
 * Generated by Aster
 */
package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Visit_Test_Passing {

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDate_VDQj0() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.now();
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateNull_mPab1() {
		Visit visit = new Visit();
		LocalDate date = null;
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateBeforeEarliestDate_Rwmi2() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(1900, 1, 1);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateAfterLatestDate_lPVA3() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2100, 1, 1);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetDateInvalidDate_rwCV4() {
		Visit visit = new Visit();
		LocalDate date = LocalDate.of(2022, 0, 1);
		visit.setDate(date);
		assertEquals(date, visit.getDate());
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_vHhY0() {
		Visit visit = new Visit();
		visit.setDescription("");
		assert visit.getDescription().equals("");
		visit.setDescription("Sample description");
		assert visit.getDescription().equals("Sample description");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenNoDescriptionSet_shouldReturnEmptyDescription_JfKf1() {
		Visit visit = new Visit();
		assert visit.getDescription().equals("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSet_shouldReturnCorrectDescription_uJXi2() {
		Visit visit = new Visit();
		visit.setDescription("Sample description");
		assert visit.getDescription().equals("Sample description");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToNull_shouldReturnEmptyDescription_StrO5() {
		Visit visit = new Visit();
		visit.setDescription(null);
		assert visit.getDescription().equals("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToEmptySpace_shouldReturnEmptyDescription_CfCG6() {
		Visit visit = new Visit();
		visit.setDescription(" ");
		assert visit.getDescription().equals("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToTab_shouldReturnEmptyDescription_zXAJ7() {
		Visit visit = new Visit();
		visit.setDescription("\t");
		assert visit.getDescription().equals("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToNewline_shouldReturnEmptyDescription_BrBe8() {
		Visit visit = new Visit();
		visit.setDescription("\n");
		assert visit.getDescription().equals("");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToLongString_shouldReturnCorrectDescription_TGqs15() {
		Visit visit = new Visit();
		String longString = "This is a long string that should be truncated to a certain length";
		visit.setDescription(longString);
		assert visit.getDescription().equals("This is a long string that should be truncated to a certain length");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDescription_whenDescriptionSetToUnicodeString_shouldReturnCorrectDescription_pqzF16() {
		Visit visit = new Visit();
		String unicodeString = "This is a unicode string with special characters like , , and ";
		visit.setDescription(unicodeString);
		assert visit.getDescription().equals("This is a unicode string with special characters like , , and ");
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionTest_eAAr0() {
		Visit visit = new Visit();
		String description = "This is a test description";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionNullTest_bFLM1() {
		Visit visit = new Visit();
		String description = null;
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionEmptyTest_loHF2() {
		Visit visit = new Visit();
		String description = "";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionLengthTest_KNEY3() {
		Visit visit = new Visit();
		String description = "This is a test description with a long length that should be truncated";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionSpecialCharacterTest_shlp4() {
		Visit visit = new Visit();
		String description = "This is a test description with special characters like !@#$%^&*()";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionUnicodeTest_bZId5() {
		Visit visit = new Visit();
		String description = "This is a test description with unicode characters like ";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionInvalidFormatTest_QVFm6() {
		Visit visit = new Visit();
		String description = "This is a test description with invalid format like <script>alert('hello');</script>";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionInvalidLengthTest_NOIC7() {
		Visit visit = new Visit();
		String description = "This is a test description with a very long length that should be truncated to 255 characters";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionInvalidTypeTest_gvOW8() {
		Visit visit = new Visit();
		int description = 123;
		visit.setDescription(String.valueOf(description));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void setDescriptionInvalidValueTest_MTrE9() {
		Visit visit = new Visit();
		String description = "This is a test description with invalid value like null";
		visit.setDescription(description);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetDate_IqcT0() {
		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		assertEquals(visit.getDate(), LocalDate.now());
	}

}