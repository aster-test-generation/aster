/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_sGgo0() {
        byte[] b = new byte[4];
        ByteUtils.toLittleEndian(b, 0x12345678L, 0, 4);
        byte[] expected = new byte[] {(byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12};
        assertArrayEquals(expected, b);
    }
}