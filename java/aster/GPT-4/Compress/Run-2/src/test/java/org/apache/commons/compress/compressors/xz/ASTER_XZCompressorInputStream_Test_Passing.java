/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.tukaani.xz.XZ;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
public class Aster_XZCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_InputStreamClosed_KdeH0() throws IOException {
    InputStream mockInputStream = mock(InputStream.class);
    XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(mockInputStream);
    xzCompressorInputStream.close();
    verify(mockInputStream).close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTrue_EnGy0_ACwC0() {
    byte[] validSignature = new byte[] {(byte) 0xFD, '7', 'z', 'X', 'Z', (byte) 0x00};
    assertTrue(XZCompressorInputStream.matches(validSignature, validSignature.length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseDueToLength_WOif1_frwl0() {
    byte[] shortSignature = new byte[] {(byte) 0xFD, '7', 'z'};
    assertFalse(XZCompressorInputStream.matches(shortSignature, shortSignature.length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesExactBoundary_ytAo3_BFKZ0() {
    byte[] boundarySignature = new byte[] {(byte) 0xFD, '7', 'z', 'X', 'Z', (byte) 0x00};
    assertTrue(XZCompressorInputStream.matches(boundarySignature, XZ.HEADER_MAGIC.length));
}
}