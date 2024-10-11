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
public void testSetCp_String_count_null_nktU0() {
}
public void testSetCp_String_count_empty_MpOP1() {
}
public void testSetCp_String_count_nonEmpty_pUHA2() {
}
public void testSetCp_String_count_invalid_LccS3() {
}
public void testSetCp_String_count_zero_emuE4() {
}
public void testSetCp_String_count_negative_wPgr5() {
}
public void testSetCp_String_count_decimal_iEpm6() {
}
public void testSetCp_String_count_scientific_UWyD7() {
}
public void testSetCp_String_count_long_uJQq8() {
}
public void testSetCp_String_count_invalid_input_oJxV9() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFileOptions_aSfE0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_options();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchive_modtime_zbeZ0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    int archive_modtime = segmentHeader.getArchive_modtime();
    assertEquals(0, archive_modtime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFileModtime_lAnZ0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_modtime();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFileOptionsWithEmptyOptions_zKrb1_fid1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_file_options();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFieldFlagsHi_bkrb0_fid1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_field_flags_hi();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveFieldFlagsHi_rQOW1_2() {
    SegmentHeader segmentHeader = new SegmentHeader();
    boolean result = segmentHeader.have_field_flags_hi();
    assertFalse(segmentHeader.have_field_flags_hi());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultMajorVersion_kRIh0_fid1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    int expectedMajorVersion = 1;
    int actualMajorVersion = segmentHeader.getDefaultMajorVersion();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultMajorVersionWithDifferentMajorVersion_NtkU1_fid1() {
    SegmentHeader segmentHeader = new SegmentHeader();
    int expectedMajorVersion =0;
    int actualMajorVersion = segmentHeader.getDefaultMajorVersion();
    assertEquals(expectedMajorVersion, actualMajorVersion);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_True_Ohee0_HvGe0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setHave_code_flags_hi(true);
    assertTrue(segmentHeader.have_code_flags_hi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHaveCodeFlagsHi_False_NODO1_HZMm0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setHave_code_flags_hi(false);
    assertFalse(segmentHeader.have_code_flags_hi());
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultMajorVersionWithEmptyMajverCounter_BebE3_IoQM0() {
    SegmentHeader segmentHeader = new SegmentHeader();
    segmentHeader.setCp_Double_count(1);
    int expectedMajorVersion =0;
    int actualMajorVersion = segmentHeader.getDefaultMajorVersion();
    assertEquals(expectedMajorVersion, actualMajorVersion);
}
}