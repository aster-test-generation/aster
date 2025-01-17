/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevel_CiJw0() {
    DeflateParameters deflateParameters = new DeflateParameters();
    int compressionLevel = deflateParameters.getCompressionLevel();
    assertEquals(0, compressionLevel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevelWithCustomValue_viCr2() {
    DeflateParameters deflateParameters = new DeflateParameters();
    int compressionLevel = deflateParameters.getCompressionLevel();
    assertEquals(10, compressionLevel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevelWithInvalidValue_IFAn3() {
    DeflateParameters deflateParameters = new DeflateParameters();
    int compressionLevel = deflateParameters.getCompressionLevel();
    assertEquals(-1, compressionLevel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithZlibHeader_vwJm0() {
    DeflateParameters deflateParameters = new DeflateParameters();
    boolean result = deflateParameters.withZlibHeader();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevel_ValidLevel_nKiX0() {
    DeflateParameters parameters = new DeflateParameters();
    parameters.setCompressionLevel(5);
    assertEquals(5, parameters.getCompressionLevel());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevel_InvalidLevel_lopi1() {
    DeflateParameters parameters = new DeflateParameters();
    try {
        parameters.setCompressionLevel(11);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid Deflate compression level: 11", e.getMessage());
    }
}
}