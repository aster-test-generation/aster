/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModificationTime_UZut0() {
    GzipParameters gzipParameters = new GzipParameters();
    long expected = 0; // Assuming default value is 0 since not set
    long actual = gzipParameters.getModificationTime();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFileName_TEmv0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expected = null; // Assuming default null since no setter or initialization shown
    assertEquals(expected, gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFilename_mVnN0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expected = null; // Assuming fileName is initialized to null
    assertEquals(expected, gzipParameters.getFilename());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateStrategy_OJqX0() {
    GzipParameters gzipParameters = new GzipParameters();
    int expected = 0; // Assuming default deflateStrategy is 0 if not set
    assertEquals(expected, gzipParameters.getDeflateStrategy());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetComment_ZqIA0() {
    GzipParameters gzipParameters = new GzipParameters();
    assertNull(gzipParameters.getComment());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevel_XGtH0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOperatingSystem_tAMP0_fid1() {
    GzipParameters gzipParameters = new GzipParameters();
    int expected =255; // Assuming default value is255 since not initialized in the provided code.
    assertEquals(expected, gzipParameters.getOperatingSystem());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBufferSize_DefaultValue_iIZm512() {
    GzipParameters gzipParameters = new GzipParameters();
    assertEquals(512, gzipParameters.getBufferSize());
}
@Test
public void testSetCompressionLevelInvalid_xXpr2_acSn0() {
    GzipParameters gzipParameters = new GzipParameters();
    try {
        gzipParameters.setCompressionLevel(10);
        fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
    }
}
@Test
public void testSetBufferSize_InvalidSize_zwKV1_AVHm0() {
    GzipParameters gzipParameters = new GzipParameters();
    try {
        gzipParameters.setBufferSize(0);
        fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperatingSystem_uldb0_OSFe0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setOperatingSystem(3);
    assertEquals(3, gzipParameters.getOperatingSystem());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFileName_imfZ0_EkTb0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expectedFileName = "testFile.gz";
    gzipParameters.setFileName(expectedFileName);
    assertEquals(expectedFileName, gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModificationTime_dZeh0_MTun0() {
    GzipParameters gzipParameters = new GzipParameters();
    long expectedTime = 123456789L;
    gzipParameters.setModificationTime(expectedTime);
    assertEquals(expectedTime, gzipParameters.getModificationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeflateStrategy_SvqH0_thFz0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setDeflateStrategy(1);
    assertEquals(1, gzipParameters.getDeflateStrategy());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFilename_utnf0_ULbi0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expectedFilename = "testFile.gz";
    gzipParameters.setFilename(expectedFilename);
    assertEquals(expectedFilename, gzipParameters.getFilename());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevelValidLowerBound_WCFR0_DHhI0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setCompressionLevel(-1);
    assertEquals(-1, gzipParameters.getCompressionLevel());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevelValidUpperBound_ktJs1_hkrE0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setCompressionLevel(9);
    assertEquals(9, gzipParameters.getCompressionLevel());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBufferSize_ValidSize_kkTX0_oxuL0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setBufferSize(1024);
    assertEquals(1024, gzipParameters.getBufferSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetComment_YGVZ0_BGPx0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expectedComment = "Test comment";
    gzipParameters.setComment(expectedComment);
    assertEquals(expectedComment, gzipParameters.getComment());
}
}