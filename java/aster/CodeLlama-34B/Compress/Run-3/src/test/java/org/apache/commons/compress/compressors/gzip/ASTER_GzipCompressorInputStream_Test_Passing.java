/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithMockInputStream_fjOr3() throws IOException {
    InputStream mockInputStream = mock(InputStream.class);
    GzipCompressorInputStream gcis = new GzipCompressorInputStream(mockInputStream, true);
    when(mockInputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(1);
    assertEquals(1, gcis.read());
    verify(mockInputStream).read(any(byte[].class), anyInt(), anyInt());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_FEET0() {
    byte[] signature = new byte[] { 31, -117 };
    int length = 2;
    assertTrue(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_XRAi1() {
    byte[] signature = new byte[] { 31, -118 };
    int length = 2;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_sHcc2() {
    byte[] signature = new byte[] {};
    int length = 0;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_cMhc3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_negativeLength_okTl5() {
    byte[] signature = new byte[] { 31, -117 };
    int length = -1;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_zeroLength_lOeB6() {
    byte[] signature = new byte[] { 31, -117 };
    int length = 0;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_lengthGreaterThanSignatureLength_dIxI7() {
    byte[] signature = new byte[] { 31, -117 };
    int length = 3;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_lengthLessThanSignatureLength_lReP8() {
    byte[] signature = new byte[] { 31, -117 };
    int length = 1;
    assertFalse(GzipCompressorInputStream.matches(signature, length));
}
}