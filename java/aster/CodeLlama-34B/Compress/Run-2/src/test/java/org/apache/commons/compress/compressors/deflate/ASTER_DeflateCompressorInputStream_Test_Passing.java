/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableWithNullInputStream_fxwH3() throws IOException {
    DeflateParameters parameters = new DeflateParameters();
    DeflateCompressorInputStream inputStream = new DeflateCompressorInputStream(null, parameters);
    int available = inputStream.available();
    assertEquals(0, available);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_NWEE0() {
    byte[] signature = new byte[] { (byte) 0x78, (byte) 0x9C, (byte) 0x03, (byte) 0x00 };
    int length = 4;
    assertTrue(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_IbLG1() {
    byte[] signature = new byte[] { (byte) 0x78, (byte) 0x9C, (byte) 0x03, (byte) 0x01 };
    int length = 4;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_DLxH2() {
    byte[] signature = new byte[] {};
    int length = 0;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_GBAz3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidLength_jMFL4() {
    byte[] signature = new byte[] { (byte) 0x78, (byte) 0x9C, (byte) 0x03, (byte) 0x00 };
    int length = 3;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCountWithNullStream_UEER3() {
    DeflateParameters parameters = new DeflateParameters();
    DeflateCompressorInputStream compressor = new DeflateCompressorInputStream(null, parameters);
    assertEquals(0, compressor.getCompressedCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCountWithNullParametersAndInvalidStream_LJhE10() {
    DeflateCompressorInputStream compressor = new DeflateCompressorInputStream(null, null);
    assertEquals(0, compressor.getCompressedCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCountWithInvalidParametersAndValidStream_yzIk12() {
}
}