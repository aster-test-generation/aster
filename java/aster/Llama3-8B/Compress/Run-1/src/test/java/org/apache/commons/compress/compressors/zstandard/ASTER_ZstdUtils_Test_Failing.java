/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesZstandard_RXmM0_cdMl0() {
    byte[] signature = new byte[] {0x78, 0x5a, 0x73, 0x74, 0x61, 0x6e, 0x64, 0x5f, 0x46, 0x72, 0x61, 0x6d, 0x65, 0x5f, 0x4d, 0x61, 0x67, 0x69, 0x63};
    int length = signature.length;
    boolean result = ZstdUtils.matches(signature, length);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesNullLength_QyqS6_mgJJ0() {
    byte[] signature = new byte[] {0x28, 0x5a, 0x53, 0x54, 0x61, 0x6e, 0x64, 0x5f, 0x46, 0x72, 0x61, 0x6d, 0x65, 0x5f, 0x4d, 0x61, 0x67, 0x69, 0x63};
    int length = 0; // Fix: Initialize length to a valid value
    try {
        ZstdUtils.matches(signature, length);
        assert false;
    } catch (NullPointerException e) {
        assert true;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsZstdCompressionAvailable_ClassNotFound_nMKs1_fid2() {
    try {
        Class.forName("non.existent.class");
    } catch (ClassNotFoundException e) {
    }
    assertEquals(false, ZstdUtils.isZstdCompressionAvailable());
}
}