/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_xsBD0() throws IOException {
        byte[] data = new byte[100];
        int off = 0;
        int len = 10;
        FramedSnappyCompressorOutputStream stream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
        stream.write(data, off, len);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithConstructor2_YHbM2() throws IOException {
        OutputStream out = new ByteArrayOutputStream();
        FramedSnappyCompressorOutputStream stream = new FramedSnappyCompressorOutputStream(out);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMask_QOjP0_fid1() {
        long x = 1234567890L;
        long expected =2821160452L;
        long actual = FramedSnappyCompressorOutputStream.mask(x);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMaskWithNegativeInput_XueI1_fid1() {
        long x = -1234567890L;
        long expected =2726451115L;
        long actual = FramedSnappyCompressorOutputStream.mask(x);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMaskWithZeroInput_gLLd2_fid1() {
        long x = 0L;
        long expected =2726488792L;
        long actual = FramedSnappyCompressorOutputStream.mask(x);
        assertEquals(expected, actual);
    }
}