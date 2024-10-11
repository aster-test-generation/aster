/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ResourceAlignmentExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAllowMethodChange_True_RVVV0() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
    assertTrue(resourceAlignmentExtraField.allowMethodChange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAllowMethodChange_False_bIyK1() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, false);
    assertFalse(resourceAlignmentExtraField.allowMethodChange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAllowMethodChange_Default_irJZ2() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
    assertFalse(resourceAlignmentExtraField.allowMethodChange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAllowMethodChange_Padding_shiC3() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 10);
    assertTrue(resourceAlignmentExtraField.allowMethodChange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_DefaultConstructor_ckbX0_1() {
    ResourceAlignmentExtraField field = new ResourceAlignmentExtraField();
    byte[] centralDirectoryData = field.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_DefaultConstructor_ckbX0_2() {
    ResourceAlignmentExtraField field = new ResourceAlignmentExtraField();
    byte[] centralDirectoryData = field.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_ParameterizedConstructor_ytIX1_1() {
    ResourceAlignmentExtraField field = new ResourceAlignmentExtraField(4, true);
    byte[] centralDirectoryData = field.getCentralDirectoryData();
    assertEquals(4, centralDirectoryData[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_ParameterizedConstructorWithPadding_ARjC2_1() {
    ResourceAlignmentExtraField field = new ResourceAlignmentExtraField(4, true, 2);
    byte[] centralDirectoryData = field.getCentralDirectoryData();
    assertEquals(4, centralDirectoryData[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAlignmentWithAlignmentConstructor_OAil1() {
ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(2);
assertEquals(2, resourceAlignmentExtraField.getAlignment());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAlignmentWithAlignmentAndAllowMethodChangeConstructor_TUla2() {
ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(2, true);
assertEquals(2, resourceAlignmentExtraField.getAlignment());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAlignmentWithAlignmentAllowMethodChangeAndPaddingConstructor_cRht3() {
ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(2, true, 1);
assertEquals(2, resourceAlignmentExtraField.getAlignment());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_WithoutAlignment_MACv1_3() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(4);
    byte[] content = resourceAlignmentExtraField.getLocalFileDataData();
    assertEquals(0, content[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_WithPadding_xIMv2_4() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(4, true, 2);
    byte[] content = resourceAlignmentExtraField.getLocalFileDataData();
    assertEquals(0, content[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_WithPadding_xIMv2_5() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(4, true, 2);
    byte[] content = resourceAlignmentExtraField.getLocalFileDataData();
    assertEquals(0, content[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_lnrq0_fid2() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
    ZipShort zipShort = resourceAlignmentExtraField.getHeaderId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithDifferentAlignment_Apny1_fid2() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(2, true);
    ZipShort zipShort = resourceAlignmentExtraField.getHeaderId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_ParameterizedConstructor_ytIX1_2_fid2() {
    ResourceAlignmentExtraField field = new ResourceAlignmentExtraField(4, true);
    byte[] centralDirectoryData = field.getCentralDirectoryData();
}
}