/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnparseableExtraFieldData_Test_Failing {
    private byte[] localFileData;
    private byte[] centralDirectoryData;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataNull_aHKX0_fid1() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] result = unparseableExtraFieldData.getCentralDirectoryData();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_JcCr0_fid1() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] result = unparseableExtraFieldData.getLocalFileDataData();
    assertNotNull(result);
}
}