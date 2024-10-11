/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_ZstandardFrame_True_CSWh2_fid1() {
    byte[] signature = new byte[4];
    signature[0] = (byte) 0x28;
    signature[1] = (byte) 0xB5;
    signature[2] = (byte) 0x2F;
    signature[3] = (byte) 0x4E;
    int length = 4;
    assertTrue(ZstdUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_SkippableFrame_True_rnLX4_fid1() {
    byte[] signature = new byte[5];
    signature[0] = (byte) 0x50;
    signature[1] = (byte) 0x2A;
    signature[2] = (byte) 0xB5;
    signature[3] = (byte) 0x2F;
    signature[4] = (byte) 0x4E;
    int length = 5;
    assertTrue(ZstdUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_NullSignature_False_xXHc5_fid1() {
    byte[] signature = null;
    int length = 4;
    assertFalse(ZstdUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nJtn0_2_fid2() {
    assertTrue(ZstdUtils.matches(new byte[]{(byte) 0x50, (byte) 0x2A, (byte) 0xB5, (byte) 0x2F, (byte) 0xFD}, 5));}
}