/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarMarker_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_JZWM0() {
        JarMarker jarMarker = new JarMarker();
        byte[] result = jarMarker.getCentralDirectoryData();
        assertArrayEquals(new byte[0], result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataData_DLsV0() {
        JarMarker jarMarker = new JarMarker();
        byte[] result = jarMarker.getLocalFileDataData();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_gaRK0_xDXn0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort result = jarMarker.getCentralDirectoryLength();
    assertEquals(ZipShort.getValue(result.getBytes()), result.getValue());
}
}