/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesNull_UgcR3_fid1() {
    byte[] signature = null;
    try {
        SevenZFile.matches(signature, 6);
        assert false;
    } catch (NullPointerException e) {
        assert true;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTrue_zgxb0_tMnn0() {
    byte[] signature = {(byte)0x37, (byte)0x7A, (byte)0xBC, (byte)0xAF, (byte)0x27, (byte)0x1C};
    boolean result = SevenZFile.matches(signature, 6);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseLength_aGEL1_wTYa0() {
    byte[] signature = {(byte)0x37, (byte)0x7A, (byte)0xBC, (byte)0xAF, (byte)0x27};
    boolean result = SevenZFile.matches(signature, 5);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseSignature_VWzB2_XLoS0() {
    byte[] signature = {(byte)0x37, (byte)0x7A, (byte)0xBC, (byte)0xAF, (byte)0x27, (byte)0x1D};
    boolean result = SevenZFile.matches(signature, 6);
    assert !result;
}
}