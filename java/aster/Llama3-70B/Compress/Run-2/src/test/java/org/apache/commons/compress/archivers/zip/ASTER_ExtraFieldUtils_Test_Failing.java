/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExtraFieldUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullElement_LEbw5() {
    ZipExtraField[] data = new ZipExtraField[1];
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(data);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullArray_ACNE6() {
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(null);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullElement_LEbw5_fid2() {
    ZipExtraField[] data = new ZipExtraField[1];
    data[0] = null;
    assertNotNull(ExtraFieldUtils.mergeCentralDirectoryData(data));
}
}