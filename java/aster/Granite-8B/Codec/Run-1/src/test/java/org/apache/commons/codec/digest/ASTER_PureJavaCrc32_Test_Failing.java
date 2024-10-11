/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PureJavaCrc32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNonEmptyArray_KIQa1() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(new byte[]{1, 2, 3, 4, 5}, 0, 5);
        assertEquals(0x964e5b00, crc32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_sntc0_vNnr0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(0);
        crc32.update(1);
        crc32.update(2);
        crc32.update(3);
        assertEquals(~crc32.getValue() & 0xffffffffL, crc32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate5_xXQH4_oSlQ0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(5);
        assertEquals(crc32.getValue(), 4294967290L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate6_TyCb5_tOOP0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(6);
        assertEquals(crc32.getValue(), 4294967289L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate7_XFkQ6_JSnm0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(7);
        assertEquals(crc32.getValue(), 4294967288L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate12_etGY11_VUTZ0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(12);
        assertEquals(crc32.getValue(), 4294967283L);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate13_Foul12_jzWS0_fid3() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        crc32.update(13);
        assertEquals(crc32.getValue(), 4294967282L);
    }
}