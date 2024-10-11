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
public class Aster_AsiExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_fNjH0_fid1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String result = asiExtraField.getLinkedFile();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_WCfX0_fid1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode(1);
    assertEquals(1, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_wkTR0_fid1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode((short) 1);
    asiExtraField.setLinkedFile("linkedFile");
    asiExtraField.setUserId((short) 1);
    asiExtraField.setGroupId((short) 1);
    byte[] result = asiExtraField.getLocalFileDataData();
    assertArrayEquals(new byte[asiExtraField.getLocalFileDataLength().getValue() - 4 + 4], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_false_dirFlagFalse_bqIA1_MxXA0_fid1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.clone(); // This is the only method available in AsiExtraField class
    assertFalse(asiExtraField instanceof AsiExtraField); // This assertion will always be false
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_FileFlag_rAgo0_VNid0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int result = asiExtraField.getMode(0);
    assertEquals(0, result); 
}
}