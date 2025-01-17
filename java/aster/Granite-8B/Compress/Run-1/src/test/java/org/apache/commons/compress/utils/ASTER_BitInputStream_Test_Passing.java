/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.InputStream;
import java.nio.ByteOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BitInputStream_Test_Passing {
    private InputStream in;
    private ByteOrder byteOrder;
    private BitInputStream bitInputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAlignWithByteBoundary_1_EjOD0() {
        BitInputStream bitInputStream = new BitInputStream(null, ByteOrder.LITTLE_ENDIAN);
        bitInputStream.alignWithByteBoundary();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAlignWithByteBoundary_2_dkcA1() {
        BitInputStream bitInputStream = new BitInputStream(null, ByteOrder.BIG_ENDIAN);
        bitInputStream.alignWithByteBoundary();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBitsCached_jDPd0() {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        int result = bitInputStream.bitsCached();
        assertEquals(0, result);
    }
}