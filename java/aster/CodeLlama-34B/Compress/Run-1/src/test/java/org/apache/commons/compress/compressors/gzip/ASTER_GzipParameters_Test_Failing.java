/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipParameters_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModificationTimeWithInvalidValue_yNri5() {
    GzipParameters gzipParameters = new GzipParameters();
    long modificationTime = -1;
    try {
        gzipParameters.setModificationTime(modificationTime);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid modification time", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFilename_Invalid_yVIM3() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setFilename("not equal");
    assertNotEquals("not equal", gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevelWithInvalidValue_EGxN3() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setCompressionLevel(10);
    int compressionLevel = gzipParameters.getCompressionLevel();
    assertEquals(compressionLevel, 9);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModificationTimeWithInvalidValue_qghL5_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setModificationTime(Long.MAX_VALUE + 1);
    long modificationTime = gzipParameters.getModificationTime();
    assertEquals(Long.MAX_VALUE, modificationTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetComment_aJnv0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    String comment = gzipParameters.getComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFilename_Invalid_yVIM3_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setFilename("test.txt");
    assertNotEquals("test.txt", gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevel_GcNo0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    int compressionLevel = gzipParameters.getCompressionLevel();
    assertEquals(compressionLevel, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevelWithInvalidValue_EGxN3_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setCompressionLevel(10);
    int compressionLevel = gzipParameters.getCompressionLevel();
    assertEquals(compressionLevel, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFilename_RTrN0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    String fileName = gzipParameters.getFilename();
    assertEquals("", fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFileName_nKbX0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    String fileName = gzipParameters.getFileName();
    assertEquals("", fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOperatingSystem_Null_rHrB4_qnEs0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setOperatingSystem(0);
    assertNull(gzipParameters.getOperatingSystem());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFilenameWithValidString_LZOc3_FxZa0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    String fileName = gzipParameters.getFilename();
    assertEquals("test.txt", fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFileNameWithValidString_sUMc3_zvVh0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    String fileName = gzipParameters.getFileName();
    assertEquals("test.txt", fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBufferSizeWithNullGzipParameters_VtsC11_gUOC0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    int bufferSize = gzipParameters.getBufferSize();
    assertEquals(8192, bufferSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBufferSizeWithNullGzipParametersAndZeroBufferSize_WICz14_yAPr0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setBufferSize(0);
    int bufferSize = gzipParameters.getBufferSize();
    assertEquals(0, bufferSize);
}
}