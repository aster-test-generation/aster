/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PureJavaCrc32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithByteArrayOffsetAndLength_FBzU0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        crc32.update(data, 0, 10);
        assertEquals(0x6819D91, crc32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithByteArrayOffsetAndLength2_hOKj1() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        byte[] data = new byte[]{0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14};
        crc32.update(data, 0, 10);
        assertEquals(0x3A938F1, crc32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_yKrE0_SNre0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update((int) 0x01);
        crc32.update((int) 0x02);
        crc32.update((int) 0x03);
        crc32.update((int) 0x04);
        assertEquals(0x01020304L, crc32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate2_frQG1_Jpjs0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(1);
        assertEquals(crc32.getValue(), 4294967295L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate5_NAQR4_jByH0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(65535);
        assertEquals(crc32.getValue(), 65535L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate6_yLTS5_cMsW0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(65536);
        assertEquals(crc32.getValue(), 2147483648L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate7_Vska6_ZZGQ0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(16777215);
        assertEquals(crc32.getValue(), 3221225471L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate8_PcRg7_Ecyv0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(16777216);
        assertEquals(crc32.getValue(), 2751463423L);
    }
}