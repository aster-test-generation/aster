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

public class Aster_PureJavaCrc32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithByteArrayOffsetAndLength_FBzU0_fid1() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        crc32.update(data, 0, 10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithByteArrayOffsetAndLength2_hOKj1_fid1() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        byte[] data = new byte[]{0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14};
        crc32.update(data, 0, 10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate2_frQG1_Jpjs0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(1);
        assertEquals(crc32.getValue(), 2768625435L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate5_NAQR4_jByH0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(65535);
        assertEquals(crc32.getValue(), 4278190080L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate6_yLTS5_cMsW0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(65536);
        assertEquals(crc32.getValue(), 3523407757L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate7_Vska6_ZZGQ0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(16777215);
        assertEquals(crc32.getValue(), 4278190080L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate8_PcRg7_Ecyv0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(16777216);
        assertEquals(crc32.getValue(), 3523407757L);
    }
}