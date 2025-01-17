/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithInvalidSignatureAndLength_YnPW1() {
    byte[] signature = {0x1f, 0x00};
    int length = 2;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithEmptySignature_bjdp2() {
    byte[] signature = {};
    int length = 0;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithNullSignature_tAcs3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithValidSignatureButSmallLength_IPTC4() {
    byte[] signature = {0x1f, (byte) 0x9d};
    int length = 1;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithInvalidSignatureButValidLength_fTrK5() {
    byte[] signature = {0x00, 0x00};
    int length = 2;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithValidSignatureButZeroLength_tDqp6() {
    byte[] signature = {0x1f, (byte) 0x9d};
    int length = 0;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithValidSignatureAndLength_wobv0_fid1() {
    byte[] signature = {0x1f, (byte) 0x9d};
    int length = 4;
    assertFalse(DeflateCompressorInputStream.matches(signature, length));
}
}