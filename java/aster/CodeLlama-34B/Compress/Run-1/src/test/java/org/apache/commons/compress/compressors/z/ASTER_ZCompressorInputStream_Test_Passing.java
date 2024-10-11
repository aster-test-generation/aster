/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.z;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_EmptySignature_gYOv2() {
    byte[] signature = new byte[] {};
    int length = signature.length;
    assertFalse(ZCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_NullSignature_iqbo3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(ZCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_ValidSignature_BRAr0_KSbb0() {
    byte[] signature = new byte[] { (byte)0x1f, (byte)0x8b };
    int length = signature.length;
    assertFalse(ZCompressorInputStream.matches(signature, length));
}
}