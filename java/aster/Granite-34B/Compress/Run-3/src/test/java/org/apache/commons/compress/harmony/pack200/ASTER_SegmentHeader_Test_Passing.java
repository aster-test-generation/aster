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
public void testHave_class_flags_hi_eQpf0() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_class_flags_hi();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHave_class_flags_hi2_ULvm1() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_class_flags_hi();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Field_count_VGcn0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Field_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Field_countWithNegativeValue_lAhe1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Field_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Field_countWithZeroValue_WHBq2() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Field_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHaveAllCodeFlags_CuMs0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        boolean result = segmentHeader.have_all_code_flags();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAttribute_definition_count_lpuP0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setAttribute_definition_count(100);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setCp_Signature_count_validInput_success_dRfM0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Signature_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setCp_Signature_count_invalidInput_failure_uguZ1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Signature_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_vaIg0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_zero_Wwzl1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_negative_SMCJ2() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(-1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_positive_bBrc3() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_max_RDiw4() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(Integer.MAX_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCp_Method_count_min_YSHk5() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setCp_Method_count(Integer.MIN_VALUE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultMajorVersion_oGWC0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        assertEquals(0, segmentHeader.getDefaultMajorVersion());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultMajorVersionWithParam_tyKi1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        assertEquals(1, segmentHeader.getDefaultMajorVersion());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultMajorVersionWithAnotherParam_VAET2() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        assertEquals(2, segmentHeader.getDefaultMajorVersion());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getArchive_modtime_eXSn0() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    int actual = segmentHeader.getArchive_modtime();
    int expected = 0; // Initialize expected value based on constructor definitions
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getArchive_modtime_coverage_AdcO1() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    int actual = segmentHeader.getArchive_modtime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHave_file_modtime_dpLL0() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_modtime();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHave_file_modtime2_dyaC1() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_modtime();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFile_count_qxTE0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setFile_count(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFile_countWithZeroValue_tIJb1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setFile_count(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFile_countWithNegativeValue_xWSw2() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setFile_count(-1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_XTZZ0() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean expected = segmentHeader.have_code_flags_hi();
    boolean actual = segmentHeader.have_code_flags_hi();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_branchCoverage_yAih2() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean flag = true;
    if (flag) {
        segmentHeader.have_code_flags_hi();
    } else {
        segmentHeader.have_code_flags_hi();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_code_flags_hi_gtaY0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_code_flags_hi(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHave_code_flags_hiFalse_jwDQ1() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_code_flags_hi(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCp_Int_count_BranchCoverage_kZvD3() throws Exception {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setCp_Int_count(0);
    segmentHeader.setCp_Int_count(1);
    segmentHeader.setCp_Int_count(2);
    segmentHeader.setCp_Int_count(3);
    segmentHeader.setCp_Int_count(4);
    segmentHeader.setCp_Int_count(5);
    segmentHeader.setCp_Int_count(6);
    segmentHeader.setCp_Int_count(7);
    segmentHeader.setCp_Int_count(8);
    segmentHeader.setCp_Int_count(9);
    segmentHeader.setCp_Int_count(10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHaveMethodFlagsHi_Buxm0() throws Exception {
        SegmentHeader segmentHeader = new SegmentHeader();
        segmentHeader.setHave_method_flags_hi(true);
        boolean result1 = segmentHeader.have_method_flags_hi();
        assert result1 == true;
        segmentHeader.setHave_method_flags_hi(false);
        boolean result2 = segmentHeader.have_method_flags_hi();
        assert result2 == false;
    }
}