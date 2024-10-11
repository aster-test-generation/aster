/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import org.tukaani.xz.XZ;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_jwDJ0() throws Exception {
        XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]), false, 1024);
        assertEquals(0, xzCompressorInputStream.skip(0L));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip2_DXdS1() throws Exception {
        XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]), false);
        assertEquals(0, xzCompressorInputStream.skip(0L));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip3_sFbd2() throws Exception {
        XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, xzCompressorInputStream.skip(0L));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureAndLengthWhenSignatureIsNull_cKaI3() {
    byte[] signature = null;
    int length = XZ.HEADER_MAGIC.length;
    boolean result = XZCompressorInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureAndLength_vWOT0_fid1() {
    byte[] signature = new byte[XZ.HEADER_MAGIC.length];
    int length = XZ.HEADER_MAGIC.length;
    boolean result = XZCompressorInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureAndLengthWhenSignatureIsNull_cKaI3_fid1() {
    byte[] signature = null;
    int length = XZ.HEADER_MAGIC.length;
    boolean result = XZCompressorInputStream.matches(signature, length);
    assertFalse(result);
}
}