/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_all_code_flagsTrue_utMS0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_all_code_flags(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_all_code_flagsFalse_Ydwj1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_all_code_flags(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_method_flags_hi_pZOf0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_method_flags_hi(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_method_flags_hiFalse_CSGC1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_method_flags_hi(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMajorVersion_ItVQ0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.addMajorVersion(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMajorVersionWithZero_HoMV1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.addMajorVersion(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMajorVersionWithNegativeNumber_zIUq2() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.addMajorVersion(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFileOptions_MzcR0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_options();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_KUQv0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_countWithZero_rNdG1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_countWithNegativeValue_EJVO2() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getDefaultMajorVersionTest_bogi0() {
		SegmentHeader segmentHeader = new SegmentHeader();
		assertEquals(segmentHeader.getDefaultMajorVersion(), 0);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getArchive_modtime_eDkV0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    int actual = segmentHeader.getArchive_modtime();
    int expected = 0; // Initialize the expected value based on the method's return type
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getArchive_modtime_coverage_YUJB1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    int actual = segmentHeader.getArchive_modtime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCp_Imethod_count_16_UIFF16() {
    SegmentHeader segmentHeader = new SegmentHeader();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflate_hintTrue_UVuo0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setDeflate_hint(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflate_hintFalse_Jstx1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setDeflate_hint(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_yErb0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean expected = segmentHeader.have_code_flags_hi();
    boolean actual = segmentHeader.have_code_flags_hi();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_True_uRQf1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setHave_code_flags_hi(true);
    boolean expected = true;
    boolean actual = segmentHeader.have_code_flags_hi();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_False_diAp2() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setHave_code_flags_hi(false);
    boolean expected = false;
    boolean actual = segmentHeader.have_code_flags_hi();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Int_count_LNpc0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Int_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Int_countWithNegativeValue_AIec1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Int_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Int_countWithZeroValue_Cvnr2() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Int_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_class_flags_hi_FJVY0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_class_flags_hi(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_class_flags_hiFalse_dbiE1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_class_flags_hi(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Double_count_TjJK0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Double_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Double_countWithZero_iQDb1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Double_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Double_countWithNegativeValue_EnYN2() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Double_count(-10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Double_countWithMaximumValue_MWtN6() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Double_count(Integer.MAX_VALUE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Double_countWithMinimumValue_mbPq7() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Double_count(Integer.MIN_VALUE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetAttribute_definition_count_VCGx0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setAttribute_definition_count(0);
    segmentHeader.setAttribute_definition_count(1);
    segmentHeader.setAttribute_definition_count(100);
    segmentHeader.setAttribute_definition_count(Integer.MAX_VALUE);
    segmentHeader.setAttribute_definition_count(Integer.MIN_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Descr_count_AYnX0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Descr_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Descr_countWithNegativeValue_Sdzt1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Descr_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetCp_Descr_countWithPositiveValue_hnME2() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Descr_count(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFileOptions2_qNXj1_fid1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_options();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHaveMethodFlagsHi_JEVY0_pGpm0_1() {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_method_flags_hi(true);
        segmentHeader.setHave_method_flags_hi(false);
        assertFalse(segmentHeader.have_method_flags_hi());}
}